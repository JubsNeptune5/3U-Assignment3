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
 * move around a square 2 times
 *
 * @author laveh2107
 */
public class A3Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a city
        City kw = new City();

        //creating a robot 
        RobotSE joe = new RobotSE(kw, 0, 2, Direction.WEST);

        //creating walls  
        new Wall(kw, 1, 1, Direction.WEST);
        new Wall(kw, 2, 1, Direction.WEST);
        new Wall(kw, 1, 1, Direction.NORTH);
        new Wall(kw, 1, 2, Direction.NORTH);
        new Wall(kw, 1, 2, Direction.EAST);
        new Wall(kw, 2, 2, Direction.EAST);
        new Wall(kw, 2, 1, Direction.SOUTH);
        new Wall(kw, 2, 2, Direction.SOUTH);

        //move around the square twice
        //turning a corner eight times
        for (int i = 0; i < 8; i = i + 1) {
            //move around a corner
            joe.move();
            joe.move();
            joe.turnLeft();
            joe.move();
        }
    }
}
