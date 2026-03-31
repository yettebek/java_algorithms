package Algorithms;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.text.DecimalFormat;

public class FactorialNumber {

    public static long printFactorial(int num) { //long type is used to store large numbers
        long factorial = 1;

        // ITERATIVE APPROACH
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        if (num == 0) {
            return 1;
        }
        return factorial;
    }

    public static void main(String[] args) {
        while (true) {
            try {
                // input message for the user
                System.out.print("Enter a number: ");

                // create the scanner to read the user's number
                Scanner sc = new Scanner(System.in);
                int input = sc.nextInt();

                // calling the method to print the factorial
                long output = printFactorial(input);

                // closing the scanner
                sc.close();
                //formating the output number
                DecimalFormat df = new DecimalFormat("#,###");

                System.out.println("Factorial of " + input + " = " + df.format(output));

                // if the user enters a number as input, it'll break the while loop
                break;

                // if the user enters a string as input, it'll throw an exception
            } catch (InputMismatchException ime) {
                System.out.println("Not a number. Try again");
            }
        }
       
    }

}
