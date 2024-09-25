package Algorithms.Algorithms;

public class MaxMinValues {

    public static int min(int[] list) {
        // Variable
        int minValue = list[0];
        for (int i = 1; i < list.length; i++) {
            if (list[i] < minValue) {
                minValue = list[i];
            }
        }
        return minValue;
    }

    public static int max(int[] list) {
        int maxValue = list[0];
        for (int i = 1; i < list.length; i++) {
            if (list[i] > maxValue) {
                maxValue = list[i];
            }
        }
        return maxValue;
    }

    public static void main(String[] args) {
        //int[] values = { 2, -4,0,43,27,34,-200 };

        //int outMin = min(values);
        //int outMax = max(values);

        System.out.println("MINIMUM VALUE: " + MaxMinValues.min(new int []{43,23,44,-344,23}));
        System.out.println("MAXIMUM VALUE: " + MaxMinValues.max(new int []{100,-21,2,8,43,2233}));
    }
} 