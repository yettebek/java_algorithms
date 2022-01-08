package Algorithms;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ReverseInteger {
    //static variables (accesibles desde el método Main)
    public static int numberInput;
    public static long reverser;

    //function
    public static int reverseFunct(int number) {
        long reverser = 0;
        // mientras que el nº no sea 0: multiplica * 10 y saca el modulo % 10 de nuestro nº
        // el resultado lo guarda en la variable reverser y lo usa en el siguiente loop
        // despues divide el nº / 10
        while (number != 0) {
            reverser = (reverser * 10) + (number % 10);
            number = (number / 10);

            // El nº no puede superar los 32-bits (2^31) por lo que tenemos que crear una condición if en caso de que exceda

            if (reverser > Integer.MAX_VALUE || reverser < Integer.MIN_VALUE) {
                return 0;
            }
        }
        return (int) reverser; // hay que hacer cast porque 'reverser' es de tipo long
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ".toUpperCase());

        try {
            numberInput = sc.nextInt();

            //Si el numero se excede de los 32-bits
        } catch (InputMismatchException ime) {
            System.err.print("error.Number over 32-bits.".toUpperCase());
        }
        reverser = reverseFunct(numberInput);
        System.out.println("Reversed integer: ".toUpperCase() + reverser);
    }
}
