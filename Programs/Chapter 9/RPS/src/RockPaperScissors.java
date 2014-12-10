import java.util.Random;
import java.util.Scanner;

/*

Kevin Leary
Period 2
Date: 12/7/14
Chapter: 9
Excercise: Rock Paper Scissors

*/
enum Move {
   SCISSOR, PAPER, ROCK
}
public class RockPaperScissors {
   public static void main(String[] args) {
      Random random = new Random();   // Create a random number generator
      boolean gameOver = false;
      Move playerMove = Move.SCISSOR;
      Move computerMove;
      int numTrials = 0;
      int numComputerWon = 0;
      int numPlayerWon = 0;
      int numTie = 0;

      Scanner sc = new Scanner(System.in);
      System.out.println("Let us begin...");

      while (!gameOver) {
         System.out.printf("%nScissor-Paper-Stone");

         // Player move
         // Use a do-while loop to handle invalid input
         boolean validInput;
         do {
            System.out.print("   Your turn (Enter s for scissor, p for paper, r for rock, q to quit): ");
            char inChar = sc.next().toLowerCase().charAt(0); // Convert to lowercase and extract first char
            validInput = true;
            if (inChar == 'q') {
               gameOver = true;
            } else if (inChar == 's') {
               playerMove = Move.SCISSOR;
            } else if (inChar == 'p') {
               playerMove = Move.PAPER;
            } else if (inChar == 'r') {
               playerMove = Move.ROCK;
            } else {
               System.out.println("   Invalid input, try again...");
               validInput = false;
            }
         } while (!validInput);

         if (!gameOver) {
            // Computer Move
            int aRandomNumber = random.nextInt(3); // random int between 0 (inclusive) and 3 (exclusive)
            if (aRandomNumber == 0) {
               computerMove = Move.SCISSOR;
               System.out.println("   My turn: SCISSOR");
            } else if (aRandomNumber == 1) {
               computerMove = Move.PAPER;
               System.out.println("   My turn: PAPER");
            } else {
               computerMove = Move.ROCK;
               System.out.println("   My turn: ROCK");
            }

            // Check result
            if (computerMove == playerMove) {
               System.out.println("   Tie!");
               ++numTie;
            } else if (computerMove == Move.SCISSOR && playerMove == Move.PAPER) {
               System.out.println("   Scissor cuts paper, I won!");
               ++numComputerWon;
            } else if (computerMove == Move.PAPER && playerMove == Move.ROCK) {
               System.out.println("   Paper covers rock, I won!");
               ++numComputerWon;
            } else if (computerMove == Move.ROCK && playerMove == Move.SCISSOR) {
               System.out.println("   Stone breaks scissor, I won!");
               ++numComputerWon;
            } else {
               System.out.println("   You won!");
               ++numPlayerWon;
            }
            ++numTrials;
            
            if (numTrials == 7)
            	gameOver = true;
         }
      }
   
      System.out.printf("%nNumber of trials: " + numTrials);
      System.out.printf(" I won %d(%.2f%%). You won %d(%.2f%%). We tied %d(%.2f%%)", numComputerWon, 
    		  100.0*numComputerWon/numTrials, numPlayerWon, 100.0*numPlayerWon/numTrials, numTie, 100.0*numTie/numTrials);
      System.out.println("\nThanks for playing! ");
   }
}