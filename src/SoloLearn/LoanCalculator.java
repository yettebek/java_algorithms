package SoloLearn;

import java.util.Scanner;

/*Loan Calculator

You take a loan from a friend and need to calculate how much you will owe him after 3 months.
You are going to pay him back 10% of the remaining loan amount each month.
Create a program that takes the loan amount as input, calculates and outputs the remaining amount after 3 months.

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
*/
public class LoanCalculator {

    public static void main(String[] args) {
        //Variables
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the total amount ($): ");
        int amount = scanner.nextInt();

        //Iterate throuh 3 monthly payments
        for (int i = 1; i <= 3; i++) {
            amount *= 0.9;
        }
        System.out.println("Remaining amount (after 3 months): " + amount);

    }
}
