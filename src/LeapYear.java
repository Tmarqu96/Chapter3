import java.util.Scanner;

/**
 * Created by Thomas Marquardt on 12/8/2016.
 * The program was created to find out whether a year is a leap year or not
 * From Listing 3.7 on page 98
 */
public class LeapYear {
    public static void main(String[] args){
        //Create a scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a year:");
        int year = input.nextInt();

        //Check if leap year
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        //Display year
        System.out.println(year + " is leap year? " + isLeapYear);
    }
}
