
/* 
 * ***** SIMPLE SCHOOL REGISTRY SYSTEM *****
 * ******** utilizing swing methods ********
 * **** by TABLANTE, MIGUEL LORENZO F. *****
 * ************ August 6, 2023 *************
 */

package swing_SchoolRegistry;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.*;

public class Main {
	
	public static ArrayList <String> students = new ArrayList <String>();
	
	public static void menu() {
		String choice = "";
		
		while (choice.isBlank() && (!choice.equalsIgnoreCase("A")) && (!choice.equalsIgnoreCase("B"))) {
			choice = JOptionPane.showInputDialog("Please choose: A = register | B = login | C = exit");
		}
		
		if (choice.equalsIgnoreCase("A")) {
			register();
		}
		else if (choice.equalsIgnoreCase("B")) {
			login();
		}
		else if (choice.equalsIgnoreCase("C")) {
			System.exit(0);
		}
		else {
			menu();
		}
	}
	
	public static void register() {
		String name_reg = "";
		
		while (name_reg.isBlank()) {
			name_reg = JOptionPane.showInputDialog("Please enter your name: ");
		}
		students.add(name_reg);
		JOptionPane.showMessageDialog(null, "Welcome " + name_reg);
		menu();
		
	}
	
	public static void login() {
		while (students.size() == 0) {
			JOptionPane.showMessageDialog(null, "No students are currently registered. Please register first.");
			menu();
		}
		String name_login = "";
		
		while (name_login.isBlank()) {
			name_login = JOptionPane.showInputDialog("Please input your name: ");
		}
		if (students.contains(name_login)) {
			JOptionPane.showMessageDialog(null, "Welcome " + name_login);
		}
		else {
			JOptionPane.showMessageDialog(null, "No names matched the database. Please try again.");
			menu();
		}
	}

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Welcome to the official School Registry!");
		menu();
		
		

	}
}	

