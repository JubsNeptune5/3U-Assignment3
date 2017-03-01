package assignment3;


import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
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


        joe.move();
        if (joe.canPickThing()) {
            joe.pickAllThings();
        }
        // bot will move around the block if it isn't on 1,1
        while (joe.getAvenue() != 1 || joe.getStreet() != 1) {

            //move when it isn't blocked

            while (joe.frontIsClear()) {
                joe.move();
                //pick up when ever able to move
                if (joe.canPickThing()) {
                    joe.pickAllThings();
                }
            }

            //when hits a wall turn to avoid wall
            while (!joe.frontIsClear()) {
                joe.turnRight();

                //If the bot is in bottom corner, move to the begining, if not true, will continue code with else loop
                if (!joe.frontIsClear() && joe.isFacingSouth()) {
                    //Check if robots on avenue 0
                    while (joe.getAvenue() > 1) {
                        //move to be in right direction
                        while (joe.getDirection() != Direction.WEST) {
                            //turn till facing west
                            joe.turnLeft();
                        }
                        //move bot to get to 0
                        joe.move();
                    }
                    //Check if robots on avenue 0
                    while (joe.getAvenue() < 1) {
                        //move to the right direction
                        while (joe.getDirection() != Direction.EAST) {
                            //turn to face direction
                            joe.turnLeft();
                        }
                        //move robot to get to 0
                        joe.move();
                    }
                    //Check the Street if its greater than 0
                    while (joe.getStreet() > 1) {
                        //Move to the right direction to move to the origin
                        while (joe.getDirection() != Direction.NORTH) {
                            //turn to face north direction
                            joe.turnLeft();
                        }
                        //move bot to 0
                        joe.move();
                    }
                    //Check the stret is lees than zero
                    while (joe.getStreet() < 1) {
                        //rotate to the south direction to move to the origin
                        while (joe.getDirection() != Direction.SOUTH) {
                            //turn to face south
                            joe.turnLeft();
                        }
                        //move bot to 0
                        joe.move();
                    }
                } else {
                    if (joe.frontIsClear()) {
                        joe.move();
                        joe.turnRight();
                        //if bot can pick thing, it will
                        if (joe.canPickThing()) {
                            joe.pickAllThings();
                        }
                    }
                }



                //Move to the left of a row

                //move when it isn't blocked
                while (joe.frontIsClear()) {
                    joe.move();
                    //pick up when ever able to move
                    if (joe.canPickThing()) {
                        joe.pickAllThings();
                    }
                }
                //when hits a wall turn to avoid wall
                while (!joe.frontIsClear()) {
                    joe.turnLeft();
                    //If the bot is in bottom corner, move to the begining, if not true, will continue code with else loop
                    if (!joe.frontIsClear() && joe.isFacingEast()) {
                        //Check if robots on avenue 0
                        while (joe.getAvenue() > 1) {
                            //move to be in right direction
                            while (joe.getDirection() != Direction.WEST) {
                                //turn till facing west
                                joe.turnLeft();
                            }
                            //move bot to get to 0
                            joe.move();
                        }
                        //Check if robots on avenue 0
                        while (joe.getAvenue() < 1) {
                            //move to the right direction
                            while (joe.getDirection() != Direction.EAST) {
                                //turn to face direction
                                joe.turnLeft();
                            }
                            //move robot to get to 0
                            joe.move();
                        }
                        //Check the Street if its greater than 0
                        while (joe.getStreet() > 1) {
                            //Move to the right direction to move to the origin
                            while (joe.getDirection() != Direction.NORTH) {
                                //turn to face north direction
                                joe.turnLeft();
                            }
                            //move bot to 0
                            joe.move();
                        }
                        //Check the stret is lees than zero
                        while (joe.getStreet() < 1) {
                            //rotate to the south direction to move to the origin
                            while (joe.getDirection() != Direction.SOUTH) {
                                //turn to face south
                                joe.turnLeft();
                            }
                            //move bot to 0
                            joe.move();
                        }
                    } else {
                        if (joe.frontIsClear()) {
                            joe.move();

                            joe.turnLeft();
                            //if bot can pick thing, it will
                            if (joe.canPickThing()) {
                                joe.pickAllThings();
                            }
                        }
                    }
                }
            }
        }
    }
}
