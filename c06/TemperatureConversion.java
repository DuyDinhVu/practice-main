/**
 * ******************
 * Peter Do
 * Temperature Conversion
 * Exercise 6.22
 * 3/14/2022
 * ******************
 */

import java.util.Scanner;

public class TemperatureConversion {
    public static double toCelsius(double f) {
        return ((f - 32) * (5.0 / 9.0));
    }
    public static double toFahrenheit(double c) {
        return (c * (9.0 / 5.0) + 32);
    }
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);
        double temp;
        int select;

        do {
            System.out.println("TEMPERATURE CONVERSION");
            System.out.println("------------------------");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("3. Exit");

            System.out.printf("Choice: ");
            select = input.nextInt();

            switch (select) {
                case 1:
                    System.out.print("Enter temperature in Fahrenheit: ");
                    temp = input.nextDouble();
                    System.out.printf( "%.2f degree in Fahrenheit = %.2f degree in Celsius.%n%n", temp,toCelsius(temp));
                    break;
                case 2:
                    System.out.print("Enter temperature in Celsius: ");
                    temp = input.nextDouble();
                    System.out.printf( "%.2f degree in Celsius = %.2f degree in Fahrenheit.%n%n", temp,toFahrenheit(temp));
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Invalid input! Please enter 1, 2, or 3\n");
            }
        } while (select != 3);
    }
}
