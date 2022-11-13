package Algorithms;

import java.util.*;

public class FactorialOfANumber {
    // static variable
    public static int output = 0;

    /*
     * recursive function that calculates the factorial of a number by calling it
     * multiple times
     */
    public static int factorial(int num) {
        if (num == 0) {
            return 1;
        }

        else {
            num *= factorial(num - 1);
            return num;
        }

        /*// (Non recursive way ) For loop: factorial of a number:
        
        int baseNumber = 1;
        for (int i = 1; i<= num; i++) {
            baseNumber *= i;
        }
        return baseNumber;
        */
    }

    public static void main(String[] args) {
        while (true) {
            try {
                Scanner sc = new Scanner(System.in);

                System.out.print("Enter the number: ");
                int input = sc.nextInt();

                output = factorial(input);

                sc.close();

                System.out.println("The factorial of " + input + " is " + output);

                // in case we got a number as input, then break the while loop and exit
                break;

            } catch (InputMismatchException ime) {

                System.out.println("Not a number. Try again".toUpperCase());
            }
        }
    }
}
