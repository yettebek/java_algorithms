package Algorithms;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FactorialNumber {

    public static int printFactorial(int num) {

        // ITERATIVE APPROACH
        if (num != 0) {
            int result = 1;
            for (int i = num; i >= 1; i--) {
                result *= i;

            }
            return result;
        } else {
            return 1;
        }

    }

    public static void main(String[] args) {

        try {
            // input message for the user
            System.out.print("Enter a number: ");

            // create the scanner to read the user's number
            Scanner sc = new Scanner(System.in);
            int input = sc.nextInt();

            // calling the method to print the factorial
            int output = printFactorial(input);

            System.out.println("Factorial of " + input + " = " + output);

            // closing the scanner
            sc.close();

            // if the user enters a type string as input instead of an int, it'll return an
            // exception
        } catch (InputMismatchException ime) {
            System.out.println("Not a number. Try again");
        }
    }

}
