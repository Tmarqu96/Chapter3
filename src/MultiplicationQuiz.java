import java.util.Scanner;

/**
 * Created by Thomas Marquardt on 12/6/2016.
 * This program was created to help me practice my multiplication
 */
public class MultiplicationQuiz {
    public static void main(String[] args){
        int number1 = (int)System.currentTimeMillis() % 10;
        int number2 = (int)System.currentTimeMillis() / 7 % 10;

        Scanner input = new Scanner(System.in);
        System.out.print(
                "What is " + number1 + " * " + number2 + "? ");
        int number = input.nextInt();
        int answer = number1 + number2;
        System.out.print(
                number1 + " * " + number2 + " = " + number + " is " + (number1 + number2 == answer));

    }
}
