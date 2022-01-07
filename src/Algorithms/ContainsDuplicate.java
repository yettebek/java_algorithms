package Algorithms;
/*
 * Given the array of integers, find if the array contains any duplicates. Your function should return true if any value appears at least twice in the array, otherwise it'll return false.
 * */

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ContainsDuplicate {
    //Variables
    public static int size, numbers;
    public static boolean duplicate;

    //Function
    public static boolean containsDuplicate(int[] nums) {
        //Hashset to compare between the array and the set values
        Set<Integer> set = new HashSet<>(nums.length);
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the nº of integers of the array: ");
        size = sc.nextInt();

        int[] output = new int[size];

        System.out.println("Enter the " + size + " number(s) of the array: ");
        for (int i = 0; i < size; i++) {
            output[i] = sc.nextInt();
        }
        for (int o : output) {
            System.out.printf("[%d] ", o);
        }

        duplicate = containsDuplicate(output);
        System.out.println("\nDoes it contain any duplicates?: " + duplicate);
    }
}

