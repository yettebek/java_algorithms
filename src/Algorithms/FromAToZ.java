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
        String upperCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        
        String lowerCaseLetters = upperCaseLetters.toLowerCase();

        String[] letter = upperCaseLetters.split("");

        // Chosen letter i need to find the index of each letter
        String firstLetter = "b";
        String secondLetter = "b";
        int indexfirst = 0, indexsecond = 0;

        for (int i = 0; i < letter.length; i++) {
            // System.out.println("Letter nº " + i + " = " + letter[i]);
            if (firstLetter.equalsIgnoreCase(letter[i])) {
                indexfirst = i;
                
            } else if (secondLetter.equalsIgnoreCase(letter[i])) {
                indexsecond = i+1; //we meed to include it because of substring(endIndex)
            } else if (firstLetter.equalsIgnoreCase(secondLetter)) {
               
            }

        }
        System.out.println("Index of firstLetter = " + indexfirst);
        System.out.println("Index of secondLetter = " + indexsecond);

        //Substring
        System.out.println("Substring: " + upperCaseLetters.substring(indexfirst, indexsecond));
        /*
         * System.out.print("Your word here >  ");
         * Scanner sc = new Scanner(System.in);
         * String input = sc.nextLine();
         * 
         * System.out.println("Substring: " + input.substring(3, 7+1));
         * sc.close();
         */
    }

}