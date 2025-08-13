import javax.swing.*;
import java.awt.event.*;
import kareltherobot.*;
//This is the starter code for Karel the Robot AP CSA Thai

public class Main implements Directions {
  public static void main(String[] args) 
	{
		//My robot's name is karel
    Robot karel = new Robot(5,1,East,100);
    World.setVisible(true);
    World.setSize(10,10);
    World.setDelay(100);

		karel.move();
    karel.turnLeft();
    karel.move();
    karel.move();
    
    //initial position
    karel.turnLeft();
    karel.turnLeft();
    karel.putBeeper();
    karel.move();
    karel.putBeeper();
    karel.move();
    karel.putBeeper();
    karel.move();
    karel.putBeeper();
    karel.move();
    karel.putBeeper();
    karel.turnLeft();
    //first part of L
    karel.move();
    karel.putBeeper();
    karel.move();
    karel.putBeeper();
    karel.move();
    //second part of L
    karel.move();
    //reposition
    karel.putBeeper();
    moveThree(karel);
    karel.turnLeft();
    //
    karel.move();
    karel.putBeeper();
    karel.move();
    karel.putBeeper();
    karel.turnLeft();
    
    karel.move();
    karel.putBeeper();
    karel.move();
    karel.putBeeper();
    karel.move();
    karel.putBeeper();
    turnRight(karel);

    karel.move();
    karel.putBeeper();
    karel.move();
    karel.putBeeper();
    turnRight(karel);

    karel.move();
    karel.putBeeper();
    karel.move();
    karel.putBeeper();
    karel.move();
    karel.putBeeper();

    turnRight(karel); //here is where I call the method
karel.move();
karel.move();
    
  }

//this is a method. We use a placeholder robot as a parameter
//so thatI can call the method inside of my main method

    public static void turnRight(Robot placeholder){
      placeholder.turnLeft();
      placeholder.turnLeft();
      placeholder.turnLeft();
      //this is turnRight
    }

      public static void moveThree(Robot placeholder){
      placeholder.move();
      placeholder.putBeeper();
      placeholder.move();
      placeholder.putBeeper();
      placeholder.move();
      placeholder.putBeeper();
      }

      public static void moveFour(Robot k){
        for(int i=0; i<4; i++){
          k.move();
          k.putBeeper();
        }
      
      
}

}