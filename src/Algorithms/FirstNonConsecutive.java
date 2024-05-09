package Algorithms;

/*Your task is to find the first element of an array that is not consecutive.

By not consecutive we mean not exactly 1 larger than the previous element of the array.

E.g. If we have an array [1,2,3,4,6,7,8] then 1 then 2 then 3 then 4 are all consecutive but 6 is not, so that's the first non-consecutive number.

If the whole array is consecutive then return null.

The array will always have at least 2 elements1 and all elements will be numbers. The numbers will also all be unique and in ascending order. The numbers could be positive or negative and the first non-consecutive could be either too! */

public class FirstNonConsecutive {
    static Integer find(final int[] arrayOfNumbers) {
        int positive = 1;
        int negative = -1;

        for (int i = 0; i < arrayOfNumbers.length - 1; i++) { //length - 1 ==> This ensures that the loop only iterates until the last element of the array, preventing the out-of-bounds error.

            if (((arrayOfNumbers[i]) - (arrayOfNumbers[i + 1])) == negative
                    || ((arrayOfNumbers[i]) - (arrayOfNumbers[i + 1])) == positive) {

            } else {
                return Integer.valueOf(arrayOfNumbers[i + 1]);
            }
        }

        return null;
    }

    public static void main(String[] args) {

        int[] arrNew = {-3, -2, -1, 0, 1};
        System.out.println("\n" + find(arrNew));

    }
}
