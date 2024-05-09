package Algorithms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*GIVEN AN ARRAY OF INTEGERS, RETURN INDICES OF THE TWO NUMBERS SUCH THAT THEY ADD UP TO A SPECIFIC TARGET.
 * EACH INPUT WOULD HAVE EXACTLY ONE SOLUTION AND YOU MAY NOT USE THE SAME ELEMENT TWICE
 */

public class TwoSum {

    // Metodo guarda los números en una array y resultado a conseguir (target)
    public static int[] twoSum(int[] ArrayNumbers, int target) {

        // Map para sacar los nº del array y ponerlos en variables de tipo Integer
        Map<Integer, Integer> visitedNumbers = new HashMap<>();
        // For loop recorre el array ArrayNumbers
        for (int i = 0; i < ArrayNumbers.length; i++) {
            // la variable key es el resultado de la resta de target - ArrayNumbers[i]
            int key = target - ArrayNumbers[i]; // la resta de target y el valor del array puede dar con los números que
                                                // al sumarlos da el target (la resta es la inversa de la suma)

            System.out.println("HashMap: " + visitedNumbers.get(key)); // Para visualizar el HashMap

            /* Si el map contiene un valor de key (resultado de la resta de target -
            ArrayNumbers[i]) visitado previamente del array, devuelve su valor de la key
             y su valor del indice (i)*/
            if (visitedNumbers.containsKey(key)) {
                return new int[] {
                        visitedNumbers.get(key), i };// visitedNumber.get(key), value = index(position in the array)

            }
            // Pone los 2 numeros del array en las 2 variables de tipo <Integer, Integer>
            visitedNumbers.put(ArrayNumbers[i], i);
        }
        // In case there is no sum solution
        throw new IllegalArgumentException();
    }

    // Método principal Main
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your target: ");
        int target = sc.nextInt();

        int[] ArrayNumbers = new int[] { 3, 6, 11, 15 }; // 4, 1, -4, -8

        try {
            int[] result = twoSum(ArrayNumbers, target); // Argumentos del método de arriba 'twoSum'

            System.out.printf("TWO SUM INDICES: %s.", Arrays.toString(result));

        } catch (IllegalArgumentException iae) {
            System.err.print("sorry. not two sum solution found".toUpperCase());
        }
        sc.close();
    }
}
