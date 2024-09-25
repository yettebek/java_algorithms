package Algorithms.Algorithms;

public class HealthFunction {
   /*
    * Create a combat function that takes the player's current health and the
    * amount of damage recieved, and returns the player's new health. Health can't
    * be less than 0.
    * 
    */

   public static int Combat(int health, int damage) {

      return Math.max(0, health - damage);
      //max() is a function that  returns the greater of two int values.  If the arguments have the same value, the result is that same value
   }

   public static void main(String[] args) {
      System.out.println("NEW HEALTH: " + HealthFunction.Combat(100, 67));

   }
}
