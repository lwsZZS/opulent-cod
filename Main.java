import javax.swing.*;
import java.awt.event.*;
import kareltherobot.*;
import java.util.Scanner;

public class Main implements Directions
{
    public static void main(String[] args){
        // Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        // System.out.println("Please enter your user name");

  //   String userName = myObj.nextLine();  // Read user input of a String
  //   System.out.println("Hello " + userName + "! It is good to meet you!");  // Returns user output user input
   
        // Scanner in = new Scanner(System.in); // Read the user input of an int
  //   System.out.println("How many beepers do you want on each side of the diamond?");
  //   int side = in.nextInt(); //Stores the number of beepers on each side of the diamond
   
    Robot fred = new Robot(1, 1, North, 10);
    // World.setSize(side*2, side*2);
    World.setVisible(true);
    World.setDelay(10);

        fred.move();
        fred.move();
        fred.move();
        fred.move();
        fred.move();
        fred.turnLeft();
        fred.turnLeft();
        leaveFive(fred);
        fred.putBeeper();
        turnRight(fred);
        

        //calling the method, inserting the robot parameter I want to turn right
        
  }


    //write a method that will turn right
public static void turnRight(Robot r) //create a new method using a Robot parameter. r is a temp placeholder.
    {
      r.turnLeft();
      r.turnLeft();
      r.turnLeft();

    }
    //write a method that will go 5 steps and leave beepers each time.
public static void leaveFive(Robot r) //create a method bringing in a Robot parameter. r is a temp placeholder.
    {
      for(int i = 1; i<5; i++){
        r.putBeeper();
        r.move();
        r.turnLeft();
        r.move();
        turnRight(r);

      }

    }

    //Here we are going to learn how to make a loop
    public static void leaveAnotherFive(Robot bob){
      for(int i = 1; i<5; i++){
        r.putBeeper();
        r.move();
        r.turnLeft();
        r.move();
        r.turnRight(r);

    }
  }
}