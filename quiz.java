package QuizGame;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Quiz {

    // ArrayList to store questions
    ArrayList<Question> questions = new ArrayList<>();

    // HashMap to store correct answers
    HashMap<Integer, String> answers = new HashMap<>();

    Scanner sc = new Scanner(System.in);

    int score = 0;

    // Add questions
    public void addQuestions() {

        questions.add(new Question(
                1,
                "Which language is mainly used for Android development?",
                "Java",
                "HTML",
                "CSS",
                "SQL"
        ));

        answers.put(1, "A");


        questions.add(new Question(
                2,
                "Which collection allows duplicate elements?",
                "HashMap",
                "ArrayList",
                "HashSet",
                "TreeSet"
        ));

        answers.put(2, "B");


        questions.add(new Question(
                3,
                "Which collection stores key-value pairs?",
                "ArrayList",
                "LinkedList",
                "HashMap",
                "Stack"
        ));

        answers.put(3, "C");


        questions.add(new Question(
                4,
                "Which keyword is used to inherit a class in Java?",
                "implements",
                "extends",
                "inherit",
                "super"
        ));

        answers.put(4, "B");


        questions.add(new Question(
                5,
                "Which keyword is used for exception handling?",
                "try",
                "check",
                "error",
                "handle"
        ));

        answers.put(5, "A");


        questions.add(new Question(
                6,
                "Which method starts a Java program?",
                "start()",
                "run()",
                "main()",
                "execute()"
        ));

        answers.put(6, "C");


        questions.add(new Question(
                7,
                "Which collection does not allow duplicate elements?",
                "ArrayList",
                "HashSet",
                "LinkedList",
                "Vector"
        ));

        answers.put(7, "B");


        questions.add(new Question(
                8,
                "Which keyword is used to create an object?",
                "class",
                "object",
                "new",
                "create"
        ));

        answers.put(8, "C");


        questions.add(new Question(
                9,
                "Which concept hides internal data?",
                "Inheritance",
                "Polymorphism",
                "Encapsulation",
                "Abstraction"
        ));

        answers.put(9, "C");


        questions.add(new Question(
                10,
                "Which keyword is used to handle an exception?",
                "catch",
                "throwing",
                "error",
                "exception"
        ));

        answers.put(10, "A");
    }


    // Start quiz
    public void startQuiz() {

        score = 0;

        System.out.println("\n=================================");
        System.out.println("          QUIZ STARTED");
        System.out.println("=================================");

        for (Question q : questions) {

            q.displayQuestion();

            String userAnswer = getAnswer();

            String correctAnswer =
                    answers.get(q.getQuestionNumber());

            if (userAnswer.equalsIgnoreCase(correctAnswer)) {

                System.out.println("Correct Answer! ✓");
                score++;

            } else {

                System.out.println("Wrong Answer! ✗");
                System.out.println(
                        "Correct Answer: " + correctAnswer
                );
            }
        }

        showResult();
    }


    // Get user answer
    public String getAnswer() {

        while (true) {

            try {

                System.out.print("Enter your answer (A/B/C/D): ");

                String answer = sc.next();

                answer = answer.toUpperCase();

                if (!answer.equals("A") &&
                    !answer.equals("B") &&
                    !answer.equals("C") &&
                    !answer.equals("D")) {

                    throw new Exception(
                            "Invalid option! Please enter A, B, C or D."
                    );
                }

                return answer;

            } catch (Exception e) {

                System.out.println(e.getMessage());
            }
        }
    }


    // Display result
    public void showResult() {

        int total = questions.size();

        double percentage =
                ((double) score / total) * 100;

        System.out.println("\n=================================");
        System.out.println("             RESULT");
        System.out.println("=================================");

        System.out.println("Total Questions : " + total);
        System.out.println("Correct Answers : " + score);
        System.out.println("Wrong Answers   : " + (total - score));

        System.out.println(
                "Score           : " + percentage + "%"
        );

        if (percentage >= 80) {

            System.out.println("Excellent! 🎉");

        } else if (percentage >= 60) {

            System.out.println("Very Good! 👍");

        } else if (percentage >= 40) {

            System.out.println("Good! Keep Practicing.");

        } else {

            System.out.println("Need More Practice.");
        }

        System.out.println("=================================");
    }
}