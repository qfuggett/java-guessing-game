/*

A number-guessing game.

*/
import java.util.Scanner;
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
    int user_input = input.nextInt();
    System.out.println("Here is your number: " + user_input + " Here is the random number: " + number);


    input.close();

  }

}
