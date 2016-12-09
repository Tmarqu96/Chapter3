import java.util.Scanner;

/**
 * Created by Thomas Marquardt on 12/8/2016.
 * Check point 3.19 in chapter 3 on page 96
 * Also edited for part (b) of problem
 */
public class CheckPoint_3_19 {
    public static void main(String[] args){
        boolean isTrue;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 100 or a negative number");
        int num = input.nextInt();
        if ((num >= 1) && (num <= 100) || (num < 0)){
            isTrue = true;
        }else{
            isTrue = false;
            System.out.println("Enter a number between 1 and 100 or a negative number. ");
            System.exit(1);
        }
        System.out.println("Is the number between 1 and 100 or negative? " + isTrue);
    }
}
