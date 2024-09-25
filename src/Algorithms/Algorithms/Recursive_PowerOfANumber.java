package Algorithms.Algorithms;

//The Power of a Number is a mathematical operation that consists of multiplying a number by itself several times.
public class Recursive_PowerOfANumber {
    //Return the power of a number recursively
    public
    static int power(int num, int power) {
        if (power == 0) {
            return 1;
        } else {
            return num * power(num, power - 1); // 2 * power(2, 2 - 1) = 2 * power(2, 1) = 2 * power(2, 0) = 2 * 1 = 2 
             }
    }
    public static void main(String[] args) {
        System.out.println(power(2, 3));
    }
}
