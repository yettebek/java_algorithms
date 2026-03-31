package Algorithms;

public class ShuffleNumbers {

    static int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

    public static int[] shuffleNumbers(int[] numbers) {

        for (int i = 0; i < numbers.length; i++) {
            // Generate a random number within the range of the array length by multiplying
            // a random number between 0 and 1 by the length of the array
            int randomIndex = (int) (Math.random() * numbers.length);
            // Swaps the number at the current index with the number at the random index
            // (randomIndex)
            // For example, if the current index is 0 and the random index is 3, the number
            // at index 0 will be replaced with the number at index 3
            // The current element is stored in a temporary variable called 'temp'
            int temp = numbers[i];
            // The number at the random index (randomIndex) is stored in the current index
            // (numbers[i])
            numbers[i] = numbers[randomIndex];
            // the temporary variable is stored in the random index (randomIndex)
            numbers[randomIndex] = temp;
        }

        return numbers;
    }
    /*
     * public static int[] shuffleArray(int[] numbers) {
     * Random rand = new Random();
     * for (int i = numbers.length - 1; i > 1; i--) {
     * int j = rand.nextInt(i) + 1;
     * int temp = numbers[i];
     * numbers[i] = numbers[j];
     * numbers[j] = temp;
     * }
     * return numbers;
     * }
     */

    // Call the function and print the result.
    public static void main(String[] args) {
        System.out.println("Original array: " + java.util.Arrays.toString(numbers));
        System.out.println("Shuffled array: " + java.util.Arrays.toString(shuffleNumbers(numbers)));
    }
}
