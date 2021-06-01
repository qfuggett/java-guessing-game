/*

A number-guessing game.

*/
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
 
// class Main
// {
//     private static Integer[] append(Integer[] arr, int element)
//     {
//         List<Integer> list = new ArrayList<>(Arrays.asList(arr));
//         list.add(element);
 
//         return list.toArray(new Integer[0]);
//     }


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
    int bestScore = Integer.MAX_VALUE;

    //Start loop for guessing game
    while (true) {
      int user_input;

      //Check for if string input
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
          if (count < bestScore) {
            bestScore = count;
          }

          System.out.println("Congratulations! The number was " + number + " ....This games score is: " + count + "!");

          System.out.println("Would you like to play again?  Type true or false");
          Boolean play = input.nextBoolean();

          if (play == true) {
            System.out.println("Starting new game....");
            System.out.println("Please enter a new number to guess.");
            continue;

          } else if (play == false) {            

              System.out.println("Game Over. Thanks for playing! Your high score is..." + bestScore);
              break;
          }

      }
    }
  }

}

// import java. util. Arrays;
// class Main.
// private static Integer[] append(Integer[] arr, int element)
// {
// Integer[] array = new Integer[arr. length + 1];
// System. arraycopy(arr, 0, array, 0, arr. length);
// array[arr. length] = element;
// return array;

// Convert Array into ArrayList using asList() method.
// Add elements into the array list using the add() method.
// Convert the ArrayList again to the array using the toArray() method.