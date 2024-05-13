package Algorithms;

import java.util.InputMismatchException;
import java.util.Scanner;

// User
/*
 *            rock Paper scissors  ==  (array rows)
 * rock       (t)   (w)   (l)       == {(t), (l), (w)}
 * Paper      (l)   (t)   (w)       == {(w), (t), (l)}
 * scissors   (w)   (l)   (t)       == {(l), (w), (t)}
 * 
 */
public class RockPaperScissor {

    public static void main(String[] args) {

    
        System.out.println("\n-----Rock Paper Scissors Game!-----\n".toUpperCase());

        String[][] gameResults = {
                { "It's a tie", "You lose!", "You win!" },
                { "You win!", "It's a tie", "You lose!" },
                { "You lose!", "You win!", "It's a tie" }
        };
        String[] possibleChoices = { "Rock", "Paper", "Scissors" };

        
        // Create the user options via input (numbers) (0, 1 or 2)
        Scanner sc = new Scanner(System.in);
        int games = 1;
        while (games <= 5) {
            try {
            System.out.print("Enter Rock (0), Paper (1) or Scissors (2) >> ");
            int userChoice = sc.nextInt();

            // Create the cpu options via a random range of numbers from 0 to 2
            int cpuChoice = (int) (Math.random() * 3);

            System.out.println("Your choice: " + possibleChoices[userChoice]);
            System.out.println("CPU's choice: " + possibleChoices[cpuChoice]);

            String gameResult = gameResults[userChoice][cpuChoice];
            System.out.println("Game result: " + gameResult);
            
            games++;

            } catch (IndexOutOfBoundsException iobe) {
                System.err.println("Input must be a number between 0 and 2".toUpperCase());
                sc.nextLine();
            } 
            catch (InputMismatchException ime) {
                System.err.println("Input must be a number".toUpperCase());
                sc.nextLine();
            }
            catch (Exception e) {
                System.err.println("Something went wrong".toUpperCase() + "\n" + e.getMessage());
                sc.nextLine();
            }

        }
        sc.close();

    }

}
