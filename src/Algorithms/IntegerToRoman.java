package Algorithms;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IntegerToRoman {

    //Create two arrays to store the numbers and the roman letters
    public static int[] romanNumbers = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    public static String[] romanSymbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    public static int num;

    public static String intToRoman(int num) {
        final StringBuilder output = new StringBuilder();
        int i = 0;
        if (num < 1 || num > 3999) {
            System.out.println("The range number must be between 1 and 3999".toUpperCase());
            System.exit(1);
        } else {
            while (i < romanNumbers.length) {
                if (num >= romanNumbers[i]) {
                    output.append(romanSymbols[i]);
                    num -= romanNumbers[i]; //substract the number and the number in the [i] position
                } else {
                    i++;
                }
            }
        }
        return output.toString();
    }

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number: ");
            num = sc.nextInt();

            String result = intToRoman(num);

            System.out.println("Roman number: " + result);

        } catch (InputMismatchException ime) {
            System.err.println("no letters allowed!".toUpperCase());
        }
    }
}
