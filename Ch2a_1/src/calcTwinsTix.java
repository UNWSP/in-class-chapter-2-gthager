import java.util.Scanner;

import javax.swing.JOptionPane;

public class calcTwinsTix {
	public static void main(String args[]) {
		int nTix = 0;
		double salesTax = .07;
		//Get user input
		Scanner input = new Scanner(System.in);
		//try catch statement prevents wrong inputs
		try {
			//gets the number of tickets
			nTix = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of tickets you would like: "));
		}
		catch (Exception InputMismatchException) {
			System.out.println("Please enter a integer value");
			main(args);
		}
		//calculates total charge
		double tCharge = (nTix *75)+20;
		double tax = tCharge * salesTax;
		tCharge = tCharge + tax;
		//Outputs the total charge
		JOptionPane.showMessageDialog(null, "Total Cost is: $"+String.format("%.2f", tCharge));
	}
}
