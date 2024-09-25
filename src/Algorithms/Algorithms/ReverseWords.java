package Algorithms.Algorithms;

import java.util.StringJoiner;

public class ReverseWords {

    /*
     * method that gets a string as a parameter and returns the sentence's words
     * backwards
     */

    public static String wordReverser(String text) {

        // ese string pasarlo a un array o lista
        String[] splittedMessage = text.split(" ");

        StringJoiner joiner = new StringJoiner(" ");

        // acceder al ultimo elemento del array
        for (int i = splittedMessage.length - 1; i < splittedMessage.length; i--) {
            if (i < 0) {
                break;
            }
            joiner.add(splittedMessage[i]);
        }
        // meterlo en una string de nuevo
        String reversedMessage = joiner.toString();

        return reversedMessage;
    }

    public static void main(String[] args) {
        System.out.println(wordReverser("The greatest victory is that which requires no battle"));

    }

    
}