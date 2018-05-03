import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
public static void main (String[] args) throws Exception {	

	Robot r= new Robot();
	
	
	r.miniaturize();
	
	
	r.penDown();
	
	r.setSpeed(10);
	
	 r.move(115);
	 r.turn(90);
	
	for (int i = 0; i < 180; i++) {
		
		
		r.turn(1);
		r.move(1); }
	
	r.hide();
}
}

//This recipe draws the first letter of your name using the Robot

//1. Create a class called RobotGraffiti
//2. Use the Robot to draw the first letter of your name
//HINT: Use the RobotSquare recipe to help remember how to draw using Robot
//3. BONUS: Write your entire first name using the Robot

//Copyright League of Amazing Programmers 2013-2018 