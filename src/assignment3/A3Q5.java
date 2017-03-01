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
 * Pick up 10 thing and drop them off one at a time
 *
 * @author laveh2107
 */
public class A3Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a city
        City kw = new City();

        //creating a robot 
        RobotSE joe = new RobotSE(kw, 1, 1, Direction.EAST);

        //creating 10 things  
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 1);

        //count all the thing in city
        kw.showThingCounts(true);

        //do command 10 times
        for (int i = 0; i < 10; i = i + 1) {

            //pick up thing and move it to next intersection and drop it off
            joe.pickThing();
            joe.move();
            joe.putThing();

            //return to the other things
            joe.turnAround();
            joe.move();
            joe.turnAround();
        }
        //move to next intersection when done
        joe.move();
    }
}
