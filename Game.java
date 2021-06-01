/*

A number-guessing game.

*/
import java.util.Scanner;

public class Game {
  public static void main(String[] args){
    System.out.println("Hello there! May I have your name?");

    Scanner input = new Scanner(System.in);
    String name = input.nextLine();
    System.out.println("Hey," + name + "I'm thinking of a number between 1 and 100.");
    System.out.println("Try to guess my number");

    

    input.close();

  }

}
