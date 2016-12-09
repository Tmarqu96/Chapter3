import java.util.Scanner;

/**
 * Created by Thomas Marquardt on 12/6/2016.
 * A simple IF statement used to show how you can alter the output of your code
 */
public class CheckPoint_3_4 {
    public static void main(String[] args){
        int X;
        int Y;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter value for Y: ");
        Y = input.nextInt();
        if (Y > 0){
            X = 1;
            System.out.println("X is: " + X );
        }

    }
}
