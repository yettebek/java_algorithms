package Algorithms;

import java.util.Scanner;

/**
 * FromAToZ: Given a string indicating a range of letters separated by a hyphen,
 * return a string which includes all the letters in that range, including the
 * last letter. Note that if the range is given in capital letters, return the
 * string in capitals also!.
 * 
 * 
 */

public class FromAToZ {

    public static void main(String[] args) {
        String allTheLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        System.out.print("Enter range of letters separated by a hyphen (e.g. A-Z)> ");
        Scanner sc = new Scanner(System.in);
        String[] letters = sc.nextLine().split("-"); // split the string by hyphen so that i can get each letter

        // i need get the first and second letter isolated in a variable
        String firstLetter = letters[0];
        String secondLetter = letters[1];

        // Checking if the first and second letter are uppercase or lowercase
        boolean isFirstLetterUppercase = Character.isUpperCase(firstLetter.charAt(0));
        boolean isSecondLetterUppercase = Character.isUpperCase(secondLetter.charAt(0));

        // Saving the index of the first and second letter
        int upperIndexfirst = allTheLetters.indexOf(firstLetter),
                upperIndexsecond = allTheLetters.indexOf(secondLetter) + 1;

        int lowerIndexfirst = allTheLetters.toLowerCase().indexOf(firstLetter),
                lowerIndexsecond = allTheLetters.toLowerCase().indexOf(secondLetter) + 1;

        if (isFirstLetterUppercase && isSecondLetterUppercase) {
            System.out.println("Both letters are uppercase".toUpperCase());
            // index of first and second letter
            System.out.println("FIRST LETTER INDEX: " + upperIndexfirst);
            System.out.println("SECOND LETTER INDEX: " + upperIndexsecond);

            // Substring
            System.out.println("Substring: " + allTheLetters.substring(upperIndexfirst, upperIndexsecond));
        } else {
            System.out.println("both letters are lowercase".toUpperCase());
            // index of first and second letter
            System.out.println("FIRST LETTER INDEX: " + lowerIndexfirst);
            System.out.println("SECOND LETTER INDEX: " + lowerIndexsecond);
            // Substring
            System.out
                    .println("Substring: " + allTheLetters.toLowerCase().substring(lowerIndexfirst, lowerIndexsecond));
        }
        sc.close();
    }
}