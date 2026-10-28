package part16;
import java.util.Random;

public class DiceRoller {
    // this line creates a the variable random of type random so that it can used elsewhere
    Random random;

    // this line creates the variable number of type int so it can be used again
    int number;

    // this constructor runs when a DiceRoller object is created
    DiceRoller() {
        // this creates a new Random object and stores it in random
        random = new Random();
        // this calls the roll method
        roll();
    }

    // this method rolls the dice and prints the result
    void roll() {

        // this generates a random number from 1 to 6 and stores it in number
        number = random.nextInt(6) + 1;

        // this prints the value stored in number
        System.out.println(number);
    }
}