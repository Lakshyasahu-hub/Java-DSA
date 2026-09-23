package Do_while;

import java.util.Scanner;

public class Guess_the_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int guess = (int) (Math.random() * 100 + 1);
        System.out.println("Enter number between 1 - 100 ");
        int userGuess;
        int maxGuess =10;
        do {
            userGuess = sc.nextInt();
            if (userGuess == guess) {
                System.out.println("Congratulations you guessed the correct Number");
                break;
            }
            if (--maxGuess == 0){
                System.out.println("Lost");
                break;
            }
            if (userGuess >= guess) {
                System.out.println("Big, Think Smaller");
            }
            if (userGuess <= guess) {
                System.out.println("Small, Think Bigger");
            }
        } while (true);
    }
}
