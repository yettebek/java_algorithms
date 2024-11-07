package Algorithms.Algorithms;

/**
 * CountingBooleans
 */
public class CountingBooleans {
    public static int countingSheeps(Boolean[] arrayOfSheeps) {
        // variables
        int counter = 0;
        // for loop
        for (int i = 0; i < arrayOfSheeps.length; i++) {
            try {
                if (arrayOfSheeps[i].equals(true)) {
                    counter++;
                }
            } catch (NullPointerException e) {
                // Ignore any null values and proceed with the counting
            }

        }
        return counter;
    }

    public static void main(String[] args) {
        Boolean[] array1 = { true, true, true, false,
                true, true, true, true,
                false, true, false, null,
                true, false, false, true,
                true, true, true, true, null,
                false, false, true, true };

        int totalSheeps = countingSheeps(array1);

        System.out.printf("\nThere are %d sheeps in total.", totalSheeps);
    }
}