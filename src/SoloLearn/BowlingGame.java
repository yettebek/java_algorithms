package SoloLearn;
/*
*You are creating a bowling game!
The given code declares a Bowling class with its constructor and addPlayer() method.
Each player of the game has a name and points, and are stored in the players HashMap.
The code in main takes 3 players data as input and adds them to the game.
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

import javax.swing.*;
import java.util.*;

public class BowlingGame {
    public static HashMap<String, Integer> players;

    BowlingGame() {
        players = new HashMap<String, Integer>();
    }


    public void addPlayer(String name, int p) {
        players.put(name, p);
    }

    //getWinner() method returns the Key with the highest value inside the Hashtable<>
    public void getWinner() {
        //Create a int variable to store the maximum value of the hashtable
        int maxValue = 0;
        //Create an object variable to store the Key associated to its value (maxvalue)
        Object maxKey = null;

        for (Map.Entry<String, Integer> entry : players.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }
        System.out.println("Winner: " + maxKey);
    }
}

class Program {
    public static void main(String[] args) {
        BowlingGame game = new BowlingGame();

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the name (press tab) and points:".toUpperCase());

        try {
            for (int i = 0; i < 3; i++) {
                String input = sc.nextLine();
                String[] values = input.split(" ");

                String name = values[0];//
                int points = Integer.parseInt(values[1]);

                game.addPlayer(name, points);
            }
            System.out.println(BowlingGame.players);
            game.getWinner();

        } catch (IndexOutOfBoundsException iobe) {
            System.err.println("one or more missing players!\ntry again!".toUpperCase());
        }
    }
}