import java.util.Scanner;

/**
 * Created by Thomas Marquardt on 12/8/2016.
 * Check points 3.26 through 3.28 on page 97
 */
public class CheckPoint_3_26To28 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a height and weight");
        int weight = input.nextInt();
        int height = input.nextInt();
        boolean expression1 = (weight > 50) || (height > 60);
        boolean expression2 = (weight > 50) && (height > 60);
        boolean expression3 = (weight > 50) ^ (height > 60);
        System.out.println(expression1);
        System.out.println(expression2);
        System.out.println(expression3);
    }
}
