package section3;

import javax.swing.JOptionPane;

public class CandyCrush {

	public static void main(String[] args) {
		// 1. Using a pop-up, ask the user who they don't like
String name=JOptionPane.showInputDialog("Who Do you not of the likeings");
		// 2. Change the next line so that the pop-up will tell them they have a crush on that person
		JOptionPane.showMessageDialog(null, name+" You totally have a crush on Java!");
		// 3. Ask the user for the name of their best friend
 name=JOptionPane.showInputDialog("what is the name of your best friend?");
		// 4. Tell them their best friend is as sweet as candy
JOptionPane.showConfirmDialog(null, name+" is as sweet as candy");
	} 
}



