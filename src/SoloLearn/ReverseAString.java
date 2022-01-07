package SoloLearn;
/*Write a program to take a string as input and output its reverse.
The given code takes a string as input and converts it into a char array, which contains letters of the string as its elements.

Sample Input:
hello there

Sample Output:
ereht olleh*/

import java.util.Scanner;

public class ReverseAString {

    public static String reverseString(String input) {
        //In case the string is empty or has only 1 letter
        if (input == null || input.length() <= 1) {
            return input;
        }
        //Create two int variables to compare each other's index
        int begin = 0, end = input.length() - 1; // end = string's index

        //Create a char array to store each letter from the input
        char[] inputLetters = input.toCharArray();

        //The reverse loop
        while (begin < end) {
            //char variable to store a character from index: 0
            char b = inputLetters[begin];
            //switch the entire char array order (reversed)
            inputLetters[begin] = inputLetters[end];
            //Add the last character of the array to variable 'char b'
            inputLetters[end] = b;
            //start the iteration through the array
            begin++;
            end--;
        }
        return new String(inputLetters);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input: ");
        String text = scanner.nextLine();

        System.out.println("Output: " + reverseString(text));
    }
}