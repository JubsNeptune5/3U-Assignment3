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
 * move around four squares continuously
 * @author laveh2107
 */
public class A3Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a city
        City kw = new City();

        //creating a robot 
        RobotSE joe = new RobotSE(kw, 3, 3, Direction.SOUTH);

        //creating first square
        new Wall(kw, 1, 1, Direction.WEST);
        new Wall(kw, 2, 1, Direction.WEST);
        new Wall(kw, 1, 1, Direction.NORTH);
        new Wall(kw, 1, 2, Direction.NORTH);
        new Wall(kw, 1, 2, Direction.EAST);
        new Wall(kw, 2, 2, Direction.EAST);
        new Wall(kw, 2, 2, Direction.SOUTH);
        new Wall(kw, 2, 1, Direction.SOUTH);

        //creating second square
        new Wall(kw, 1, 4, Direction.WEST);
        new Wall(kw, 2, 4, Direction.WEST);
        new Wall(kw, 1, 4, Direction.NORTH);
        new Wall(kw, 1, 5, Direction.NORTH);
        new Wall(kw, 1, 5, Direction.EAST);
        new Wall(kw, 2, 5, Direction.EAST);
        new Wall(kw, 2, 5, Direction.SOUTH);
        new Wall(kw, 2, 4, Direction.SOUTH);

        //creating third square
        new Wall(kw, 4, 1, Direction.WEST);
        new Wall(kw, 5, 1, Direction.WEST);
        new Wall(kw, 4, 1, Direction.NORTH);
        new Wall(kw, 4, 2, Direction.NORTH);
        new Wall(kw, 5, 2, Direction.EAST);
        new Wall(kw, 4, 2, Direction.EAST);
        new Wall(kw, 5, 2, Direction.SOUTH);
        new Wall(kw, 5, 1, Direction.SOUTH);

        //creating fourth square
        new Wall(kw, 4, 4, Direction.WEST);
        new Wall(kw, 5, 4, Direction.WEST);
        new Wall(kw, 4, 4, Direction.NORTH);
        new Wall(kw, 4, 5, Direction.NORTH);
        new Wall(kw, 5, 5, Direction.EAST);
        new Wall(kw, 4, 5, Direction.EAST);
        new Wall(kw, 5, 5, Direction.SOUTH);
        new Wall(kw, 5, 4, Direction.SOUTH);

        while(true){
        
        //set counter
        int x=1;
        //when the counter is between 1 and 4 to move around a square
        while(x<4 && x!=0){
            
            //move three spaces then turn left
            joe.move(3);
            joe.turnLeft();
            //add 1 each time this happens
            x=x+1;
        }
        
        //when the counter is four run in a straight line 
        if(x==4){
            joe.move(3);
            //Subtract 3 each time to make it equal one
                x =x-3;
           }
            
        }
    }
    }

