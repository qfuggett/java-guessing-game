/*

A number-guessing game.

*/
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Random;

public class Game {
  public static void main(String[] args){
    System.out.println("Hello there! May I have your name?");

    //Greet the player
    Scanner input = new Scanner(System.in);
    String name = input.nextLine();
    System.out.println("Hey, " + name + " I'm thinking of a number between 1 and 100.");
    System.out.println("Try to guess my number!");

    //This is our number that the user is trying to guess
    Random rand = new Random();
    int number = rand.nextInt(100);

    //User inputs number
    int count = 0;

    //Start loop for guessing game
    while (true) {
      int user_input;

      try {
        user_input = input.nextInt();
        input.nextLine();

      } catch (InputMismatchException e) {
          String bad_input = input.next();
          System.out.println(bad_input + " is not an integer, try again.");
          continue;
      } 


      if (user_input < number) {
        count = count + 1;
        if (user_input < 1 | user_input > 100){
          System.out.println("Your guess must be between 1-100");
        }
        System.out.println("Your guess is too low, try again");

      } else if (user_input > number) {
          count = count + 1;
          if (user_input < 1 | user_input > 100){
            System.out.println("Your guess must be between 1-100");
          }
          System.out.println("Your guess is too high, try again");
        
      } else if (user_input == number) {
          count = count + 1;
          System.out.println("Congratulations! The number was " + number + " and it took you only " + count + " tries!");
          break;
      }
    }
  }

}
