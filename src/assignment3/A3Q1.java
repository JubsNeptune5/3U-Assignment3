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
 *Stop when bot is in front of wall or o0n thing
 * @author laveh2107
 */
public class A3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // City
        City kw = new City();

        //robot
        RobotSE joe = new RobotSE(kw, 1, 1, Direction.EAST);
        
        //Create thing and wall
        new Wall(kw, 1, 7, Direction.WEST);
        new Thing(kw, 1, 9);
        
        //Move until it reaches a wall or thing
        while(!joe.canPickThing() && joe.frontIsClear()){
        joe.move();
    }
    }
}
