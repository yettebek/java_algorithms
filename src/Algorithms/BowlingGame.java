package Algorithms;
/*
*You are creating a bowling game!
The given code declares a Bowling class with its constructor and addPlayer() method.
Each player of the game has a name and points, and are stored in the players HashMap.
The code in main takes 3 players' data as input and adds them to the game.
You need to add a getWinner() method to the class, which calculates and outputs the name of the player with the maximum points.

Sample Input:
Dave 42
Amy 103
Rob 64
Maria 67

Sample Output:
Amy
You need to iterate through the HashMap to find the element with the maximum points and output its corresponding key.
 */

import java.util.*;

public class BowlingGame {
    public static HashMap<String, Integer> players; // declaring HashMap of type String and Integer

    /*
     * Constructor to initialize a new HashMap object (every time a new instance of
     * the class is created the 'players' variable is set to an empty HashMap)
     */
    BowlingGame() {
        players = new HashMap<String, Integer>();
    }

    // the addPlayer() method adds the player's name and points into the HashMap
    public void addPlayer(String name, int p) {
        players.put(name, p);
    }

    /*
     * getWinner() method returns the Key with the highest value inside the
     * Hashtable<>
     */
    public void getWinner() {
        // Create a int variable to store the maximum value of the hashtable
        int maxValue = 0;
        // Create an object variable to store the Key associated to its value (maxvalue)
        Object maxKey = null;

        for (Map.Entry<String, Integer> entry : players.entrySet()) {
            if (entry.getValue() >= maxValue) {
                maxValue = entry.getValue(); // Player's points
                maxKey = entry.getKey(); // Player's name
            }
        }
        System.out.println("Winner: " + maxKey);
    }
}

class Program {
    public static void main(String[] args) {
        BowlingGame game = new BowlingGame(); // create new instance of the class BowlingGame

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the name (press tab) and points:".toUpperCase());

        try {
            // loop: it'll add 3 new players taking their names and points as input
            for (int i = 0; i < 3; i++) {
                String input = sc.nextLine();
                String[] values = input.split(" ");

                String name = values[0];// take the first input of the array, store as a String
                int points = Integer.parseInt(values[1]); // take the second input of the array, store as int

                game.addPlayer(name, points); // using the method to add the variables' values into the hashmap
            }
            System.out.println(BowlingGame.players);
            game.getWinner(); // returns the String key value associated to the highest Integer maxValue found

        } catch (IndexOutOfBoundsException iobe) {
            System.err.println("one or more missing players!\ntry again!".toUpperCase());
        }
        sc.close();
    }
}