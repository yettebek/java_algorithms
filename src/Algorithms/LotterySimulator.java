package Algorithms;

import java.util.*;

public class LotterySimulator {
    public static List<Integer> out, out2;
    public static Random random = new Random();

    public static List<Integer> lotteryNumbers() {
        // Variables
        List<Integer> cpuNumbers = new ArrayList<Integer>();
        // Generate 6 positions for the lottery numbers inside the for loop
        for (int i = 1; i < 7; i++) {
            while (true) {
                // Generate the random numbers between 1 and 49
                int num = random.nextInt(49) + 1; // (49) = (from 0 to 48) + 1
                // If the number is not in the list, add it, otherwise, continue generating
                // numbers until it is not in the list (while loop)
                if (!cpuNumbers.contains(num)) { // true
                    cpuNumbers.add(num);
                    break;
                }
            }
        }
        // sort the numbers into ascending order
        Collections.sort(cpuNumbers);
        return cpuNumbers;
    }

    public static List<Integer> lotteryComplement() {
        List<Integer> cpuComplement = new ArrayList<Integer>();
        for (int i = 1; i < 2; i++) {
            int comp = random.nextInt(6) + 1;
            cpuComplement.add(comp);
        }
        return cpuComplement;
    }

    public static void main(String[] args) {
        // Instantiating the lists for the lottery numbers and the complement in the
        // main method
        out = lotteryNumbers();
        out2 = lotteryComplement();
        while (true) {
            try {
                // Create a scanner to read the number of combinations to generate
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter the number of combinations to generate (1 to 8): ");
                int combinations = scanner.nextInt();
                double price = Double.valueOf(combinations);

                if (combinations > 0 && combinations < 9) {

                    for (int i = 1; i <= combinations; i++) {
                        out = lotteryNumbers();
                        out2 = lotteryComplement();
                        System.out.println(i + ". Lottery numbers: " + out + " - " + out2);
                    }
                    System.out.printf("\nTOTAL: %.2f EUR", price * 0.5);

                    break;

                } else {
                    System.err.println("Invalid number of combinations".toUpperCase());
                }
            } catch (InputMismatchException ime) {
                System.out.println("Please. Enter a number between 1 and 8");
            }
        }
        // scanner.close();
    }
}
