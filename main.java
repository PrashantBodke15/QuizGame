package QuizGame;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Quiz quiz = new Quiz();

        quiz.addQuestions();

        while (true) {

            System.out.println("\n=================================");
            System.out.println("            QUIZ GAME");
            System.out.println("=================================");

            System.out.println("1. Start Quiz");
            System.out.println("2. Exit");

            System.out.print("Enter your choice: ");

            try {

                int choice = sc.nextInt();

                switch (choice) {

                    case 1:

                        quiz.startQuiz();
                        break;

                    case 2:

                        System.out.println(
                                "Thank you for playing! 👋"
                        );

                        sc.close();
                        return;

                    default:

                        System.out.println(
                                "Invalid choice! Enter 1 or 2."
                        );
                }

            } catch (Exception e) {

                System.out.println(
                        "Invalid input! Please enter a number."
                );

                sc.nextLine();
            }
        }
    }
}