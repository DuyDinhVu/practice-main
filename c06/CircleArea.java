/**
 * ******************
 * Peter Do
 * Circle Area
 * Exercise 6.20
 * 3/14/2022
 * ******************
 */
import java.util.Scanner;

public class CircleArea {
    public static double circleArea(double r){
        return Math.PI*r*r;
    }

    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);
        double radius;
        do {
            System.out.printf("Enter radius units (negative to quit): ");
            radius = input.nextDouble();

            if (radius >=0) {
                System.out.printf("Area of the circle : %.5f units square.%n%n", circleArea(radius));
            }

        } while (radius >= 0);
    }
}
