import java.util.Scanner;

public class QuestionDemo1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        Question q = new Question();
        q.setText("Who was the inventor of Java?");
        q.setAnswer("James Gosling");

        q.display();
        System.out.print("Your answer: ");
        String response = in.nextLine();
        System.out.println(q.checkAnswer(response));

        //Numeric Question class that extends Question
        P9_01NumericQuestion nQ = new P9_01NumericQuestion();
        nQ.setText("Enter a number between 1 and 10 to see if it matches: ");
        nQ.setAnswer(10);

        nQ.display();
        System.out.print("Your answer: ");
        Double nQRes = in.nextDouble();
        System.out.println(nQ.checkAnswer(String.valueOf(nQRes)));

        ChoiceQuestion cQ = new ChoiceQuestion();
        cQ.setText("Enter");
    }
}
