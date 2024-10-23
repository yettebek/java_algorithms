package Algorithms.Algorithms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*Write a function cakes(), which takes the recipe (object) and the available ingredients (also an object) and returns the maximum number of cakes Pete can bake (integer). 
For simplicity there are no units for the amounts (e.g. 1 lb of flour or 200 g of sugar are simply 1 or 200). Ingredients that are not present in the objects, can be considered as 0. 
Example:
// must return 2
cakes({flour: 500, sugar: 200, eggs: 1}, {flour: 1200, sugar: 1200, eggs: 5, milk: 200}); 
// must return 0
cakes({apples: 3, flour: 300, sugar: 150, milk: 100, oil: 100}, {sugar: 500, flour: 2000, milk: 2000}); 
*/
public class PeteBaker {

    public static int cakes(Map<String, Integer> recipe, Map<String, Integer> availableIngredients) {
        return Arrays.stream(recipe.keySet().toArray(String[]::new))
                .mapToInt(ingredient -> (int) Math
                        .floor((double) availableIngredients.getOrDefault(ingredient, 0) / recipe.get(ingredient)))
                        // / to handle the case where the min() method is called on an empty stream.
                .min().orElse(Integer.MIN_VALUE);

        /*
         * This uses Java 8's Map and Stream APIs to achieve the same result. The cakes
         * function takes two Map objects as input, representing the recipe and the
         * available ingredients respectively. It uses Arrays.stream to iterate over the
         * keys of the recipe map and calculates the maximum number of cakes that can be
         * made by dividing the available amount of each ingredient by the recipe
         * amount. The Math.min function is used to keep track of the smallest result.
         * If an ingredient is not present in the available map, it is treated as 0 and
         * the function returns Integer.MAX_VALUE.
         */
    }

    public static void main(String[] args) {
        // Create a map to represent the recipe
        Map<String, Integer> recipe = Map.of(
                "flour", 500,
                "sugar", 200,
                "eggs", 1);

        // Create a map to represent the available ingredients
        Map<String, Integer> availableIngredients = new HashMap<>();
        availableIngredients.put("milk", 200);
        availableIngredients.put("flour", 1200);
        availableIngredients.put("sugar", 1200);
        availableIngredients.put("eggs", 5);
        availableIngredients.put("oil", 100);

        System.out.println("Number of cakes Pete can bake: " + cakes(recipe, availableIngredients));
    }
}
