package Algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LotterySimulator {
    public static List<Integer> out, out2;
    public static Random random = new Random();

    public static List<Integer> lotteryNumbers() {
        //Variables
        List<Integer> cpuNumbers = new ArrayList<Integer>();

        for (int i = 0; i < 6; i++) {
            while (true) {
                int num = random.nextInt(49) + 1;
                if (!cpuNumbers.contains(num)) {
                    cpuNumbers.add(num);
                    break;
                }
            }
        }
        return cpuNumbers;
    }

    public static List<Integer> lotteryComplement() {
        List<Integer> cpuComplement = new ArrayList<Integer>();
        for (int i = 0; i < 1; i++) {
            int comp = random.nextInt(6) + 1;
            cpuComplement.add(comp);
        }
        return cpuComplement;
    }

    public static void main(String[] args) {

        out = lotteryNumbers();
        out2 = lotteryComplement();
        System.out.println("Lottery numbers: " + out + " - " + out2);

        /*//For more than one combinations:
        for (int i = 1; i < 6; i++) {
            out = lotteryNumbers();
            out2 = lotteryComplement();
            System.out.println(i + ". Lottery numbers: " + out + " - " + out2);
        }*/
    }
}
