// Here's a Java program implementing the described functionality:

// ```java
import java.util.Random;
import java.util.Scanner;

public class Num {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int minRange = 1;
        int maxRange = 100;
        int attemptsLimit = 5;
        int score = 0;
        boolean playAgain = true;

        while (playAgain) 
        {
            System.out.println("Welcome to the Number Guessing Game!");
            System.out.println("I have selected a number between " + minRange + " and " + maxRange + ". Guess it!");

            int randomNumber = random.nextInt(maxRange - minRange + 1) + minRange;
            int attempts = 0;
            boolean guessedCorrectly = false;

            while (!guessedCorrectly && attempts < attemptsLimit) 
            {
                System.out.print("Enter your guess: ");
                int guess = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                attempts++;

                if (guess == randomNumber) 
                {
                    System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
                    guessedCorrectly = true;
                    score++;
                } 
                else if (guess < randomNumber) 
                {
                    System.out.println("Too low! Try again.");
                } 
                else 
                {
                    System.out.println("Too high! Try again.");
                }
            }

            if (!guessedCorrectly) 
            {
                System.out.println("Sorry, you've reached the maximum number of attempts. The correct number was: " + randomNumber);
            }

            System.out.println("Your current score: " + score);
            System.out.print("Do you want to play again? (yes/no): ");
            String playChoice = scanner.nextLine().toLowerCase();
            playAgain = playChoice.equals("yes");
        }

        System.out.println("Thank you for playing! Your final score: " + score);
        scanner.close();
    }
}


// This program allows the user to play a number guessing game with the specified features. It generates a random number within a specified range, prompts the user to guess the number, compares the guess with the generated number, and provides feedback. It also includes options for limiting attempts, playing multiple rounds, and displaying the user's score.