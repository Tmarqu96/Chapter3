import java.util.Scanner;

/**
 * Created by Thomas Marquardt on 12/5/2016.
 * Program created to make a game used to do addition easily
 */
public class AdditionQuiz {
    public static void main(String[] args){
        int number1 = (int)(System.currentTimeMillis() % 10);
        int number2 = (int)(System.currentTimeMillis() / 7 % 10);

        //Create Scanner
        Scanner input = new Scanner(System.in);

        System.out.print(
                "What is " + number1 + " + " + number2 + "? ");
        int number = input.nextInt();
        int answer = number1 + number2;

        System.out.print(
                number1 + " + " + number2 + " = " + number + " is " + (number1 + number2 == answer));


    }
}
