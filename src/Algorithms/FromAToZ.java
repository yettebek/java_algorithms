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

}