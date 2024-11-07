package Algorithms.Algorithms;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Recursive_FactorialOfANumber {
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

                // if the user enters a number as input, it'll break the while loop
                break;
                            
                // if the user enters a string as input, it'll throw an exception
            } catch (InputMismatchException ime) {
                System.out.println("Not a number. Try again".toUpperCase());
            }
        }
    }
}

