package SoloLearn;

import java.util.Scanner;

/*

The binary numeric system uses only two digits: 0 and 1. Computers operate in binary, meaning they store data and perform calculations using only zeros and ones.

You need to make a program to convert integer numbers to their binary representation.
Create a Converter class with a static toBinary() method, which returns the binary version of its argument.
The code in main takes a number as input and calls the corresponding static method. Make sure the code works as expected.

Sample Input: 42  Sample Output: 101010

*/
public class BinaryConverter {

    public static class Converter {
        public static String toBinary(int num) {
            String binary = "";
            while (num > 0) {
                //Convert the int value into String to store it into the 'binary' variable
                binary = String.valueOf(num % 2 + binary); //el resto de la división se añade al string 'binary'
                num /= 2;
            }
            return binary;
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(Converter.toBinary(num));
    }
}
