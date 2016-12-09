import java.util.Scanner;

/**
 * Created by Thomas Marquardt on 12/7/2016.
 * Simple program used to show how you can alter code with an IF statement
 */
public class CheckPoint_3_6 {
    public static void main(String[] args){
        double score;
        double pay = 100;
        Scanner input = new Scanner(System.in);
        //Prompt user to enter score
        System.out.println("What is the score?");
        score = input.nextDouble();
        if (score > 90){
            pay = pay + 0.03;
            System.out.println("Pay is: " + pay);
        }
        else{
            pay = pay + 0.01;
            System.out.println("Pay is: " + pay);
        }


    }
}
