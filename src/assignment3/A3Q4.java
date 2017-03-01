/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Wall;

/**
 *moving around a room to find an exit
 * @author laveh2107
 */
public class A3Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a city
        City kw = new City();

        //creating a robot 
        RobotSE joe = new RobotSE(kw, 2, 3, Direction.EAST);

        //creating walls  
        new Wall(kw, 1, 1, Direction.WEST);
        new Wall(kw, 2, 1, Direction.WEST);
        new Wall(kw, 3, 1, Direction.WEST);
        new Wall(kw, 1, 1, Direction.NORTH);
        new Wall(kw, 1, 3, Direction.NORTH);
        new Wall(kw, 1, 4, Direction.NORTH);
        new Wall(kw, 1, 4, Direction.EAST);
        new Wall(kw, 2, 4, Direction.EAST);
        new Wall(kw, 3, 4, Direction.EAST);
        new Wall(kw, 3, 1, Direction.SOUTH);
        new Wall(kw, 3, 2, Direction.SOUTH);
        new Wall(kw, 3, 3, Direction.SOUTH);
        new Wall(kw, 3, 4, Direction.SOUTH);


        //Move to the edge of box
        if (joe.frontIsClear()) {
            joe.move();
        }

        //skim the wall to find exit
        while (!joe.frontIsClear()) {
            joe.turnLeft();
            //continue moving along the wall
            while (joe.frontIsClear()) {
                joe.move();
                joe.turnRight();

                if (joe.frontIsClear()) {
                    joe.move();
                    break;
                }

                if (!joe.frontIsClear()) {
                    joe.turnLeft();
                }
            }

        }


    }
}
