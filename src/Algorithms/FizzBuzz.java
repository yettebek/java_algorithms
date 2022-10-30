package Algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Given an integer n, return a string array. Output fizz for multiples of 3, buzz for multiples of 5, 'fizzbuzz' for both multiples or the number itself.
Constraints: 1 <= n <= 10000
* */

public class FizzBuzz {
    //Variables
    public static int num;

    public static List<String> fizzBuzzList(int num) {
        List<String> numbersList = new ArrayList<>();

        if (num >= 1 && num <= 10000) {
            for (int i = 1; i <= num; i++) {
                if ((i % 3 == 0) && (i % 5 == 0)) {
                    numbersList.add("fizzbuzz".toUpperCase());
                } else if (i % 3 == 0) {
                    numbersList.add("fizz".toUpperCase());
                } else if (i % 5 == 0) {
                    numbersList.add("buzz".toUpperCase());
                } else {
                    numbersList.add(Integer.toString(i)); //Not divisible by 3 or 5 just output the number //("" + i)
                }
            }
        } else {
            System.err.println("Exceeded number limit!".toUpperCase());
            System.exit(1);
        }
        return numbersList;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = sc.nextInt();

        List<String> output = fizzBuzzList(num);

        System.out.println(output);
        sc.close();
    }
}
