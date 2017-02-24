/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 * clean up all the things in the room
 *
 * @author laveh2107
 */
public class A3Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a city
        City kw = new City();

        //creating a robot 
        RobotSE joe = new RobotSE(kw, 1, 1, Direction.EAST);

        //creating walls  
        new Wall(kw, 1, 1, Direction.WEST);
        new Wall(kw, 2, 1, Direction.WEST);
        new Wall(kw, 3, 1, Direction.WEST);
        new Wall(kw, 1, 1, Direction.NORTH);
        new Wall(kw, 1, 2, Direction.NORTH);
        new Wall(kw, 1, 3, Direction.NORTH);
        new Wall(kw, 1, 4, Direction.NORTH);
        new Wall(kw, 1, 4, Direction.EAST);
        new Wall(kw, 2, 4, Direction.EAST);
        new Wall(kw, 3, 4, Direction.EAST);
        new Wall(kw, 3, 1, Direction.SOUTH);
        new Wall(kw, 3, 2, Direction.SOUTH);
        new Wall(kw, 3, 3, Direction.SOUTH);
        new Wall(kw, 3, 4, Direction.SOUTH);

        //create things
        new Thing(kw, 1, 2);
        new Thing(kw, 2, 2);
        new Thing(kw, 2, 3);
        new Thing(kw, 2, 4);
        new Thing(kw, 3, 4);
        new Thing(kw, 3, 1);

//When the bot isn't in the bottom right corner, clean the room

        //increase count when ever it goes along a row
        for (int i = 0; i >= 0; i = i - 1) {
            //when the bot can move
            while (joe.frontIsClear()) {
                //pick up everything it can each time it moves
                if (joe.canPickThing()) {
                    joe.pickAllThings();
                }
                joe.move();
            }
            //when bot hit a wall
            if (!joe.frontIsClear()) {
                //turn to move
                joe.turnRight();
                if (joe.canPickThing()) {
                    joe.pickAllThings();
                }
                //}
                //move to next row
                joe.move();
                //pickup if it can
                joe.canPickThing();
                {
                    joe.pickAllThings();
                }
                //turn into next row
                joe.turnRight();
            }



            //next row
            for (int counter = i; counter >= 0; counter = counter + 1) {
                while (joe.frontIsClear()) {
                    //pick up everything it can each time it moves
                    if (joe.canPickThing()) {
                        joe.pickAllThings();
                    }
                    joe.move();
                }
                if (joe.isFacingEast() && !joe.frontIsClear()) {
                joe.turnLeft();
            
            //turn to face south and see if you are at the bottom of the grid
            if (!joe.frontIsClear()) {
                joe.turnLeft();

            }

            //Check if robots on avenue 0
            while (joe.getAvenue() > 0) {
                //move to be in right direction
                while (joe.getDirection() != Direction.WEST) {
                    //turn till facing west
                    joe.turnLeft();
                }
                //move bot to get to 0
                joe.move();
            }
            //Check if robots on avenue 0
            while (joe.getAvenue() < 0) {
                //move to the right direction
                while (joe.getDirection() != Direction.EAST) {
                    //turn to face direction
                    joe.turnLeft();
                }
                //move robot to get to 0
                joe.move();
            }
            //Check the Street if its greater than 0
            while (joe.getStreet() > 0) {
                //Move to the right direction to move to the origin
                while (joe.getDirection() != Direction.NORTH) {
                    //turn to face north direction
                    joe.turnLeft();
                }
                //move bot to 0
                joe.move();
            }
            //Check the stret is lees than zero
            while (joe.getStreet() < 0) {
                //rotate to the south direction to move to the origin
                while (joe.getDirection() != Direction.SOUTH) {
                    //turn to face south
                    joe.turnLeft();
                }
                //move bot to 0
                joe.move();
            }
                //when bot hit a wall
                //if (!joe.frontIsClear()) {
                    //turn to move
                    //joe.turnLeft();
                    //if
                    //if (joe.canPickThing()) {
                        joe.pickAllThings();
                    //}
                    //}
                    //move to next row
                    //joe.move();
                    //pick up stuff while moving
                    //if (joe.canPickThing()) {
                        //joe.pickAllThings();
                    //}
                    //turn into new row
                    //joe.turnLeft();

                }
            }


// when it goes through loops check if its on bottom left corner 
              
            if (joe.isFacingEast() && !joe.frontIsClear()) {
                joe.turnLeft();
            
            //turn to face south and see if you are at the bottom of the grid
            if (!joe.frontIsClear()) {
                joe.turnLeft();

            }

            //Check if robots on avenue 0
            while (joe.getAvenue() > 0) {
                //move to be in right direction
                while (joe.getDirection() != Direction.WEST) {
                    //turn till facing west
                    joe.turnLeft();
                }
                //move bot to get to 0
                joe.move();
            }
            //Check if robots on avenue 0
            while (joe.getAvenue() < 0) {
                //move to the right direction
                while (joe.getDirection() != Direction.EAST) {
                    //turn to face direction
                    joe.turnLeft();
                }
                //move robot to get to 0
                joe.move();
            }
            //Check the Street if its greater than 0
            while (joe.getStreet() > 0) {
                //Move to the right direction to move to the origin
                while (joe.getDirection() != Direction.NORTH) {
                    //turn to face north direction
                    joe.turnLeft();
                }
                //move bot to 0
                joe.move();
            }
            //Check the stret is lees than zero
            while (joe.getStreet() < 0) {
                //rotate to the south direction to move to the origin
                while (joe.getDirection() != Direction.SOUTH) {
                    //turn to face south
                    joe.turnLeft();
                }
                //move bot to 0
                joe.move();
            }
        }

    }
        }
    }


