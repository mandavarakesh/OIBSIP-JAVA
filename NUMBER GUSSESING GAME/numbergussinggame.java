//author: MANDAVA RAKESH
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        int randomNumber = rand.nextInt(100) + 1;
        // System.out.println("Random number is " + randomNumber);
        int tryCount = 0;
        int numberOfTry = 5;
        while (numberOfTry > 0) {
            System.out.println("Enter your guess (1-100): you have " + numberOfTry + " try left");
            int playerGuess = scanner.nextInt();
            tryCount++;
            if (playerGuess == randomNumber) {
                System.out.println("Correct! You win!");
                System.out.println("It took you " + tryCount + " tries");
                break;
            } else if (randomNumber > playerGuess) {
                System.out.println("Nope! The number is Higher. Guess again.");
            } else {
                System.out.println("Nope! The number is Lower. Guess again.");
            }
            numberOfTry--;
        }
        if (numberOfTry == 0) {
            System.out.println("GAME OVER");
        }
        scanner.close();
    }
}
