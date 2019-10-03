import java.util.Random;
import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {
        int count = 0;
        boolean win = false;
        Random rand1 = new Random(); 
        int rand = rand1.nextInt(101);
        System.out.println(rand);
        System.out.println(
                "A number is randomly chosen between [1, 100] \n Now, it is your turn to guess the number, you have 10 guesses. \n Your first guess is: ");
        Scanner in = new Scanner(System.in);
        do {

            int input = in.nextInt();

            if (input == rand) {
                System.out.println("You Have Won");
                break;
            } else if (input < rand) {
                System.out.println("Your Guess is Low \n Try Again: ");
            } else {
                System.out.println("Your Guess is High \n Try Again:");
            }

            count++;
            if (count == 10) {
                System.out.println("You Lose");
            }
        } while (count != 10 || win != false);

    }
}