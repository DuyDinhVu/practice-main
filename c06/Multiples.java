/**
 * ******************
 * Peter Do
 * Multiples
 * Exercise 6.16
 * 3/14/2022
 * ******************
 */
import java.util.Scanner;

public class Multiples {
    public static boolean isMultiple(int x, int y){
        return y % x == 0;
    }
    public static void main (String [] args) {
        Scanner input = new Scanner (System.in);
        int num1;
        int num2;
        do {
            System.out.print("Enter First Number (0 to exit): ");
            num1 = input.nextInt();
            if (num1==0) {
                break;
            }
            System.out.print("Enter Second Number: ");
            num2 = input.nextInt();

            if (isMultiple(num1, num2))
                System.out.printf("***The number %d is a multiple of %d\n", num2, num1);
            else
                System.out.printf("***The number %d is not a multiple of %d\n", num2, num1);

        } while(num1 !=0);
    }
}
