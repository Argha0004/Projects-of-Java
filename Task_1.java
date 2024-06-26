// Task_1(Number Game)--->>>

import java.util.Random;
import java.util.Scanner;

class Game {
    
    public int number;
    public int inputNumber;
    private int noOfGuesses = 0;
    

    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }

    Game() {
        Random rand = new Random();
        this.number = rand.nextInt(100);
        System.out.println("*****************Welcome to all in my Number Game*****************");
    }
    

    int takeUserInput() {
        
        System.out.print("Guess the number: ");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
        return inputNumber;
    }

    boolean isCorrectNumber() {
        noOfGuesses++;
        if (inputNumber == number) {
            System.out.format("Yes you guessed it right, it was %d\n, You guessed it in %d attempts\n", number, noOfGuesses);
            return true;
        } else if (inputNumber < number) {
            System.out.println("Too Low..!!");
        } else if (inputNumber > number) {
            System.out.println("Too High..!!");
        }
        return false;

    }
}

public class Task_1 {

    public static void main(String[] args) {
        /*
         * Create a class game, which allows a user to play
         * "Number Game".
         * 1. Constructor to generate the random number.
         * 2. takeUserInput() to take a user input of number.
         * 3. isCorrectNumber() to detect whether the number entered by the user is
         * true.
         * 4. Getters amd Setters for noOfGuesses
         * Use properties such as noOfGuesses(int)
         */

        Game g = new Game();
        boolean b = false;
        while (!b) {
            g.takeUserInput();
            b = g.isCorrectNumber();
            System.out.println(b);
        }
    }
}