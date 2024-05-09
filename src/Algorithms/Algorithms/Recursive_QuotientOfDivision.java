package Algorithms;

public class Recursive_QuotientOfDivision {
    // the function counts the number of recursive calls it makes before
    // reaching the base case, which is when b is greater than a 
    public static int division(int a, int b) {
        if (b > a) {
            return 0; //base case 
        } else {
            //recursive call to the function 
            return division(a - b, b) + 1;
        }
    }

    public static void main(String[] args) {
        int a = 36, b = 4;
        System.out.printf("Quotient of %d divided by %d is %d", a, b, division(a, b));
    }
}
 