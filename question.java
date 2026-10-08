package QuizGame;

public class Question {

    private int questionNumber;
    private String question;
    private String optionA;
    private String optionB;
    private String optionC;
    private String optionD;

    public Question(int questionNumber, String question,
                    String optionA, String optionB,
                    String optionC, String optionD) {

        this.questionNumber = questionNumber;
        this.question = question;
        this.optionA = optionA;
        this.optionB = optionB;
        this.optionC = optionC;
        this.optionD = optionD;
    }

    public int getQuestionNumber() {
        return questionNumber;
    }

    public String getQuestion() {
        return question;
    }

    public String getOptionA() {
        return optionA;
    }

    public String getOptionB() {
        return optionB;
    }

    public String getOptionC() {
        return optionC;
    }

    public String getOptionD() {
        return optionD;
    }

    public void displayQuestion() {

        System.out.println("\nQ" + questionNumber + ". " + question);

        System.out.println("A. " + optionA);
        System.out.println("B. " + optionB);
        System.out.println("C. " + optionC);
        System.out.println("D. " + optionD);
    }
}