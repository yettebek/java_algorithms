package Algorithms;

import java.util.Scanner;

/*Loan Calculator

You take a loan from a friend and need to calculate how much you will owe him after x months.
You are going to pay him back 10% of the remaining loan amount each month.
Create a program that takes the loan amount as input, calculates and outputs the remaining amount after x months.

Sample Input: 20000   |  Sample Output: 14580

Here is the monthly payment schedule:
Month 1
Payment: 10% of 20000 = 2000
Remaining amount: 18000
Month 2
Payment: 10% of 18000 = 1800
Remaining amount: 16200
Month 3:
Payment: 10% of 16200 = 1620
Remaining amount: 14580
Month X:
*/
public class LoanCalculator {

    public static void main(String[] args) {
        // Variables
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the total amount ($): ");
        double amount = scanner.nextInt();
        int months = 0;

        // Iterate till the remaining amount is greater than or equal to 1
        while (true) {
            amount *= 0.9;
            double roundedAmount = Math.round(amount * 100.0) / 100.0;
            if (amount >= 1) {
                System.out.println("Remaining amount (minus 10%): " + roundedAmount);
                months++;
            }else{
                break;
            }
        }

        System.out.println("It took " + months + " months to pay off the loan.");
        scanner.close();
    }
}
