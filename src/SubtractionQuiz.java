import java.util.Scanner;

/**
 * Created by Thomas Marquardt on 12/7/2016.
 * program created to test the subtraction idea and if statements
 */
public class SubtractionQuiz {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number1 = (int)(Math.random() * 10);
        int number2 = (int) (Math.random() * 10);
        int answer;

        if (number1 < number2){
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }
        //Prompt student to answer

        System.out.println("What is " + number1 + " - " + number2 + " ?");
        answer = input.nextInt();

        if (number1 - number2 == answer){
            System.out.println("You are correct!");
        }
        else{
            System.out.println("Your answer is incorrect");
            System.out.println(number1 + " - " + number2 +
                    " should be " + (number1 - number2));
        }

    }
}
