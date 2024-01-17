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
<<<<<<< HEAD
public class FromAToZ {

    public static void main(String[] args) {
        String upperCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        //String lowerCaseLetters = upperCaseLetters.toLowerCase();

        

        System.out.print("Your word here > ");
        Scanner sc = new Scanner(System.in);
        String[] letters = sc.nextLine().split("-"); // split the string by hyphen so that i can get each letter
        
        // i need get the first and second letter separated
        String firstLetter = letters[0];
        String secondLetter = letters[1];

        // Saving the index of the first and second letter
        int indexfirst = upperCaseLetters.indexOf(firstLetter),
                indexsecond = upperCaseLetters.indexOf(secondLetter) + 1;

        System.out.println("FIRST LETTER INDEX: " + indexfirst);
        System.out.println("SECOND LETTER INDEX: " + indexsecond);

        // Substring
        System.out.println("Substring: " + upperCaseLetters.substring(indexfirst, indexsecond));
        sc.close();

    }

=======

public class FromAToZ {
    public static String gimmeTheLetters(String input) {

        String allTheLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter range of letters separated by a hyphen (e.g. A-Z)> ");

        // store the input in a string variable
        input = sc.nextLine();
        sc.close();

        String[] letters = input.split("-"); // split the string by hyphen so that i can get each letter

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
            // index of first and second letter
             System.out.println("FIRST LETTER INDEX: " + upperIndexfirst);
             System.out.println("SECOND LETTER INDEX: " + upperIndexsecond);

            // Substring
            return allTheLetters.substring(upperIndexfirst, upperIndexsecond);
        } else {
            // index of first and second letter
             System.out.println("FIRST LETTER INDEX: " + lowerIndexfirst);
             System.out.println("SECOND LETTER INDEX: " + lowerIndexsecond);
            // Substring
            return allTheLetters.toLowerCase().substring(lowerIndexfirst, lowerIndexsecond);
        }
    }

    public static void main(String[] args) {
        System.out.println(gimmeTheLetters(""));
    }
>>>>>>> 17a0938a6f2ca6e122484646264787a3dd71534d
}