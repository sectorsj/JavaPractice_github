package java_1_david.homeworkthree;


import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main (String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int counter, guess, number;
        do {
            counter = 0;
            guess = -1;
            number = random.nextInt(10);
            while (counter < 3 && guess != number) {
                System.out.print("Guess the number 0 ... 9: ");
                guess = scanner.nextInt();
                if (guess != number) {
                    System.out.println("Your number is " + (guess < number? "less" : "greater"));
                    counter++;
                }
            }
            System.out.println("YOU " + (guess == number? "WON!" : "lose: " + number));
            System.out.println("Repeat game? Yes - 1, No - 0");
        } while (scanner.nextInt() == 1);
    }
}
