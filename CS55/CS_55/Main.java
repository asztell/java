import java.lang.Double;
import javax.swing.JOptionPane;
import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		//create and initialize primitive datatypes
		double num1 = 0, num2 = 0, result = 0, dbl = 0;
		String strInput = " ", strToParse = " ", input = " ", operation = " ";

		//create Scanner and Operation objects
		Scanner scanner = new Scanner(System.in);
		Operation op = new Operation();
		
		op.pr("\n* * * Arpad's calculator * * *\n");		
		JOptionPane.showMessageDialog(null, "dialog box");
		
		do {

			strInput = JOptionPane.showInputDialog(
			"\nEnter:\n\n"
			+ " 'a' - for addition\n"
			+ " 's' - for subtraction\n"
			+ " 'm' - for multiplication\n"
			+ " 'd' - for division\n");
			input = String.format("", strInput);

			strInput = JOptionPane.showInputDialog(
			"Enter num1: ");
			num1 = Double.parseDouble(
					strToParse = String.format("", strInput));
			strInput = JOptionPane.showInputDialog(
			"Enter num2: ");
			num2 = Double.parseDouble(
					strToParse = String.format("", strInput));

//			op.pr("enter num1: ");
//			num1 = scanner.nextDouble();
			op.pr("enter num2: ");
			num2 = scanner.nextDouble();

			//setter function setValues from operation class			
			op.setValues(input, operation, num1, num2);
			operation = op.opSign();			
			result = op.opResult();

			op.pr("\nround the result?(y/n) ");
			strInput = scanner.nextLine();
			input = "" + strInput.charAt(0);
			result = ((input == "y" || input == "Y") ? op.round() : result);

			op.pr("\n" + num1
				+ " " + operation
				+ " " + num2 
				+ " = " + result);

			op.pr("\n\nDo you wish to continue?(y/n) ");
			strInput = scanner.nextLine();
			input = "" + strInput.charAt(0);

		} while (input == "y" || input == "Y");

		System.exit(0);
	}
}
