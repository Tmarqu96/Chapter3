import java.awt.*;
import java.util.Scanner;

/**
 * Created by Thomas Marquardt on 12/8/2016.
 * Check point 3.23 on page 69
 * What is the value of the expression x >= 50 && x <= 100 if x is 45, 67, or 101?
 */
public class CheckPoint_3_23 {
    public static void main(String[] args){
        boolean expression;
        Scanner input = new Scanner(System.in);
        int x;
        System.out.println("Enter 45, 67, or 101.");
        x = input.nextInt();
        expression = (x >= 50) && (x <= 100);
        System.out.println(expression);
    }
}
