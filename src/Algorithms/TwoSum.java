package Algorithms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*GIVEN AN ARRAY OF INTEGERS, RETURN INDICES OF THE TWO NUMBERS SUCH THAT THEY ADD UP TO A SPECIFIC TARGET.
 * EACH INPUT WOULD HAVE EXACTLY ONE SOLUTION AND YOU MAY NOT USE THE SAME ELEMENT TWICE
 */

public class TwoSum {

    //Metodo guarda los números en una array y resultado a conseguir (target)
    public static int[] twoSum(int[] ArrayNumbers, int target) {

        //Map para sacar los nº del array y ponerlos en variables de tipo Integer
        Map<Integer, Integer> visitedNumbers = new HashMap<>();
        //For loop recorre el array ArrayNumbers
        for (int i = 0; i < ArrayNumbers.length; i++) {
            //
            int key = target - ArrayNumbers[i];

            //System.out.println(visitedNumbers.get(key)); //Para visualizar el HashMap

            //Si el complement está en el array entonces lo recoge y lo guarda en la variable number
            if (visitedNumbers.containsKey(key)) {
                return new int[]{
                        visitedNumbers.get(key), i // visitedNumber.get(key), value (position in the array)
                };
            }
            //Pone los 2 numeros del array en las 2 variables de tipo <Integer, Integer>
            visitedNumbers.put(ArrayNumbers[i], i);
        }
        //In case there is no sum solution
        throw new IllegalArgumentException();
    }

    //Método principal Main
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your target: ");
        int target = sc.nextInt();

        int[] ArrayNumbers = new int[]{3, 6, 11, 15};

        try {
            int[] result = twoSum(ArrayNumbers, target); //Argumentos del método de arriba 'twoSum'

            System.out.printf("TWO SUM INDICES: %s.", Arrays.toString(result));
            // int[] result

        } catch (IllegalArgumentException iae) {
            System.err.print("sorry. not two sum solution found".toUpperCase());
        }
        sc.close();
    }
}
