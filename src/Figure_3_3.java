import java.util.Scanner;

/**
 * Created by Thomas Marquardt on 12/7/2016.
 * nested if statement example
 */
public class Figure_3_3 {
    public static void main(String[] args){
        double score;
        Scanner input = new Scanner(System.in);
        //Prompt user to enter score
        System.out.println("Whats the score?");

        score = input.nextDouble();
        if (score >= 90)
            System.out.println('A');
        else if (score >= 80.0)
            System.out.println('B');
        else if (score >= 70.0)
            System.out.println('C');
        else if (score >= 60.0)
            System.out.println('D');
        else
            System.out.println('F');
    }
}




