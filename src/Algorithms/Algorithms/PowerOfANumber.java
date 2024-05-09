package Algorithms;

public class PowerOfANumber {

    //No recursion solution
    public static int power(int num, int power) {
        int result = 1;
        for (int i = 0; i < power; i++) {
            result *= num;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(power(5, 3));
    }
}
