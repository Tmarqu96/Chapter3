import java.util.Scanner;

/**
 * Created by Thomas Marquardt on 12/5/2016.
 * written to show to use of simple selection statements
 */
public class ComputeRadiusWithSelectionStatements {
    public static void main(String[] args){
        double radius;
        double area;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a positive value for radius: "); //Prompt user for radius
        radius = input.nextDouble();
        if (radius < 0){
            System.out.println("Incorrect Input");
        }
        else {
            area = Math.PI * radius *radius; // compute area
            System.out.println("The area of a circe of radius " + radius + " is " + area); //Display area
        }
    }
}


