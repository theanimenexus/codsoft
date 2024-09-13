package task1;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("HLO THIS IS GUESSING GAME ^_^");

        int TURNS = 0;
        int score = 100;
        boolean PA = true;

        while (PA) {
            int TN = random.nextInt(20) + 1;
            int attempts = 0;
            int maxAttempts = 7;

            System.out.println("MY NUM IS BETWEEN 1 TO 20. Can you guess it (￣、￣)?");

            while (attempts < maxAttempts) {
                System.out.print(" your guess: ");
                int userGuess = scanner.nextInt();
                scanner.nextLine();

                attempts++;

                if (userGuess == TN) {
                    System.out.println("OHH YOU GOT THE RIGHT ONE " + TN + " in " + attempts + " attempts.");
                    TURNS++;
                    System.out.println("Game over! Your scores: " + score);
                    break;
                } else if (userGuess < TN) {
                    System.out.println("Too low! Try again.");
                    score -= 20;
                } else {
                    System.out.println("Too high! Try again.");
                    score -= 20;
                }
            }

            if (attempts >= maxAttempts) {
                System.out.println("Sorry, you've run out of attempts. The correct number was " + TN + ".");
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String PAInput = scanner.nextLine();
            PA = PAInput.equalsIgnoreCase("yes");
        }
        scanner.close();
    }
}
