import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;
public class CheckPoint {
	public static void main (String[]args) {
	String answer = JOptionPane.showInputDialog("What is your favorite color?"); 
	JOptionPane.showMessageDialog(null, answer + " is also my favorite color") ;
	Robot r= new Robot();
	
	r.penDown();
	
	r.setSpeed(10);
	
	
}
 }
  }
  