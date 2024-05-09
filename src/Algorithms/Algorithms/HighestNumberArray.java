package Algorithms;

public class HighestNumberArray {

    public static void max(double[] num_arr) {
        double index_max = num_arr[0]; //to store the highest number of the array
        int max_value = 0; //to store the index of the highest number

        for (int i = 0; i < num_arr.length; i++) {
            //if it finds a number bigger than the first one, it'll store the number in the variable 'index_max'
            if (num_arr[i] > index_max) {
                //new maximum found
                index_max = num_arr[i];
                //Once found the number it'll store its index in the variable 'max_value'
                max_value = i;
            }
        }
        System.out.println("highest number of the array (index): ".toUpperCase() + max_value);
    }

    public static void main(String[] args) {
        double[] arr_main = new double[]{2500, 342, 43, 653, 6500};

        HighestNumberArray.max(arr_main);
    }
}
