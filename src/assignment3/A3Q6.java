/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;

/**
 *
 * @author laveh2107
 */
public class A3Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a city
        City kw = new City();

        //creating a robot 
        RobotSE joe = new RobotSE(kw, 0, 1, Direction.SOUTH);

        //things in street 1  
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 1);

        //things in street 2
        new Thing(kw, 2, 1);
        new Thing(kw, 2, 1);

        //things in street 3
        new Thing(kw, 3, 1);
        new Thing(kw, 3, 1);
        new Thing(kw, 3, 1);
        new Thing(kw, 3, 1);
        new Thing(kw, 3, 1);

        //things in street 4
        new Thing(kw, 4, 1);
        new Thing(kw, 4, 1);
        new Thing(kw, 4, 1);
        new Thing(kw, 4, 1);

        //count all the thing in city
        kw.showThingCounts(true);

        joe.move();

        while (joe.canPickThing()) {
            joe.pickAllThings();
            joe.turnLeft();
        
        }
    }
}
