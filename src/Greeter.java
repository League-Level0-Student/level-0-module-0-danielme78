import javax.swing.JOptionPane;
public class Greeter {
	public static void main (String[]args) {
	JOptionPane.showMessageDialog(null, "Hi");
	String answer = JOptionPane.showInputDialog("What's your name?" );
	 JOptionPane.showMessageDialog( null,"Hi " + answer + ", how is your day?");
	
	

}
}

