package Algorithms;

public class StarPattern {
    public static void main(String[] args) {
        //DECREASING LEFT TRIANGLE
        /*for (int i = 1; i <= 10; i++) {
            for (int j = 10; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }*/

        //DECREASING RIGHT TRIANGLE (1.Increasing space - 2.Decreasing star)
        //1.For loop: number of rows
        for (int i = 1; i <= 10; i++) {
            //2.For loop will print the SPACES INCREASING in each loop
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            //3.For loop; will print the stars decreasing in each loop
            for (int j = i; j <= 10; j++) {
                System.out.print("*");
            }
            //Repeat the loops in another line
            System.out.println();
        }
    }
}
