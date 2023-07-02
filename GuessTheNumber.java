import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1; // Generates a random number between 1 to 100
        
        Scanner scanner = new Scanner(System.in);
        int userNumber;
        int attempts = 0;
        
        System.out.println("Welcome to Guess the Number game!");
        
        while (true) {
            System.out.print("Enter your guess (1-100): ");
            userNumber = scanner.nextInt();
            attempts++;
            
            if (userNumber == randomNumber) {
                System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
                break;
            } else if (userNumber < randomNumber) {
                System.out.println("The number is higher. Try again!");
            } else {
                System.out.println("The number is lower. Try again!");
            }
        }
        
        scanner.close();
    }
}
