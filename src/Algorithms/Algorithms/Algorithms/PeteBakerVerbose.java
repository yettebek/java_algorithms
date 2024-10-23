package Algorithms.Algorithms;

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

public class PeteBakerVerbose {

    public static int cakes(Map<String, Integer> recipe, Map<String, Integer> availableIngredients) {
        // Get the keys of the recipe map (i.e., the ingredients)
        Object[] recipeIngredients = recipe.keySet().toArray();

        // Initialize a variable to store the minimum number of cakes that can be made
        int minCakes = Integer.MAX_VALUE;

        // Iterate over each ingredient in the recipe
        for (int i = 0; i < recipeIngredients.length; i++) {

            // Get the current ingredient (key)
            String ingredient = (String) recipeIngredients[i];

            // Get the amount of the ingredient required by the recipe
            int requiredAmount = recipe.get(ingredient);
            System.out.println("Required amount of " + ingredient + ": " + requiredAmount);

            // Get the amount of the ingredient available
            int availableAmount = availableIngredients.getOrDefault(ingredient, 0);
            System.out.println("Available amount of " + ingredient + ": " + availableAmount+"\n");

            // Calculate the number of cakes that can be made with the available amount of
            // the ingredient
            int cakesWithIngredient = availableAmount / requiredAmount;

            // Update the minimum number of cakes that can be made
            if (cakesWithIngredient < minCakes) {
                minCakes = cakesWithIngredient;
            }
        }
        // Return the minimum number of cakes that can be made
        return minCakes;
    }

    public static void main(String[] args) {
        Map<String, Integer> recipe = Map.of("flour", 500, "sugar", 200, "eggs", 1, "milk", 200);

        Map<String, Integer> availableIngredients = new HashMap<>();
        availableIngredients.put("flour", 1200);
        availableIngredients.put("sugar", 1200);
        availableIngredients.put("eggs", 5);
        availableIngredients.put("oil", 100);

        System.out.println("Number of cakes Pete can bake: " + cakes(recipe, availableIngredients));
    }
}
