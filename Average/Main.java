import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int quiz, midterm, ffinal;
        double average;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the quiz mark: ");
        quiz = input.nextInt();
        System.out.println("Enter the quiz midterm: ");
        midterm = input.nextInt();
        System.out.println("Enter the quiz ffinal: ");
        ffinal = input.nextInt();

        average = (quiz * 0.2) + (midterm * 0.3) + (ffinal * 0.5);

        System.out.println("Your average mark is " +average);

        String result = (average >= 50) ? "Passed" : "Failed" ;
        System.out.println("result" +result);

    }
}
