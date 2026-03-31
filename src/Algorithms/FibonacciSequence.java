package Algorithms;

public class FibonacciSequence {
    public static void main(String[] args) {
        // add the previous number to the next and return the result
        // 0 1 1 2 3 5 8 13 21 34
        // fib[0] = 0
        // fib[1] = 1
        // fib[2] = fib[1] + fib[0]
        // fib[3] = fib[2] + fib[1]
        // ...
        // fib[n] = fib[n-1] + fib[(n-1)-1]

        int numbers = 10;
        int[] fib = new int[numbers];

        fib[0] = 0;
        fib[1] = 1;

        System.out.println("First " + fib.length + " numbers of the Fibonacci sequence:");
        
        for (int i = 0; i < fib.length; i++) {
            if (i > 1) {
                fib[i] = (fib[i - 1]) + (fib[(i - 1) - 1]);
            }
            System.out.print(fib[i] + " ");
        }

    }
}