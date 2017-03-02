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
 *Create a bar graph with a bot moving things
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

        //move into bar graph
        joe.move();
        joe.turnLeft();

        //keep in loop until the bar graph ends
        while (true) {

            //pick evrything at the begining of the line
            while (joe.canPickThing()) {
                joe.pickAllThings();

                //When the backpack is full place one thing at a time and move
                while (joe.countThingsInBackpack() > 0) {
                    joe.putThing();
                    joe.move();
                }

                //when there is nothing in backpack move to the start of axis
                while (joe.countThingsInBackpack() == 0) {
                    joe.turnAround();
                    joe.move();
                    
                    //follow the line of things without picking up
                    while (joe.canPickThing()) {
                        joe.move();
                    }
                    
                    //when the bot isn't a the end of the bar graph
                    if (joe.getAvenue() != 1 || joe.getStreet() != 5) {
                        
                        //turn around when reach end of bar
                        while (!joe.canPickThing()) {
                            joe.turnLeft();
                            joe.move();
                        }
                    }
                    //end code when at the end of the bar
                    break;
                }
            }


        }
    }
}
