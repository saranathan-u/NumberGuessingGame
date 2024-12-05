import java.util.Scanner;

public class Guessinggame {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Welcome to the Number Guessing Game!");
    System.out.println("I am thinking of a number between 1 and 10.");
    System.out.println("Can you guess what it is? You have 3 attempts!");

    int secretNumber = (int) (Math.random() * 10) + 1;
    int attempts = 3;
    boolean hasWon = false;

    for (int i = 1; i <= attempts; i++) {
      System.out.print("Attempt " + i + ": Enter your guess: ");
      int playerGuess = scanner.nextInt();

      if (playerGuess == secretNumber) {
        hasWon = true;
        break;
      } else if (playerGuess > secretNumber) {
        System.out.println("Too high! Try again. ");
      } else {
        System.out.println("Too low! Try again. ");
      }

    }

    if (hasWon) {
      System.out.println("Congratulations! You guessed the right number. ");
    } else {
      System.out.println("Sorry!, you've used your all attempts. The correct number was: "+ secretNumber);
    }
    scanner.close();
  }
}