package Algorithms.Algorithms;

import java.util.Scanner;

/*
 * Given the array of itegers, find if the array contains any duplicates. Your function should return true if any value appears at least twice in the array, otherwise it'll return false.
 * */
public class ContainsDuplicate_v2 {
    //Variables
    public static int size;
    public static boolean duplicate;

    //Function
    public static boolean containsDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j] == nums[i]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the nº of integers of the array: ");
        size = sc.nextInt();
        int[] nums = new int[size];

        System.out.println("Enter the " + size + " number(s) of the array: ");
         

        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.print("[");
        for (int n : nums) {
            System.out.print(" " + n + " ");
        }
        System.out.print("]");

        duplicate = containsDuplicate(nums);
        System.out.println("\n" + "Does it contain any duplicates?: " + duplicate);
        sc.close();  
    }
}
