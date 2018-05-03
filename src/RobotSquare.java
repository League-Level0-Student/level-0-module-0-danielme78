/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import org.jointheleague.graphical.robot.Robot;

// This recipe draws a square using the Robot

public class RobotSquare {
    public static void main(String[] args) throws Exception {
 
    	// 1. Make a new Robot
Robot r = new Robot();

        // 3. Put the robot's pen down
r.penDown();

        // 6. Make the robot move as fast as possible
r.setSpeed(10);

        // 5. Do everything below here 4 times
for (int i =0; i < 4; i++) {

        // 2. Move your robot 200 pixels
r.move(200);
r. turn(90);
        //4. Turn the robot 90 degrees to the right (90 degrees)
    }
}
}