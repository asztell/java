import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.text.*;
import java.util.Random;
import java.util.Scanner;

public class CreditCardValidator
{

	public static final void main(String args[])
	{
		do
		{
			if (validateCard() == true)
			{
				JOptionPane.showMessageDialog( null, 
				"the credit card number is valid");
			}
			else
			{
				JOptionPane.showMessageDialog( null, 
				"the credit card number is invalid");
			}
		} while (prompt() == true);
	}

	public static boolean validateCard() 
	{
		String userInput = JOptionPane.showInputDialog( null, 
		"Please enter credit card number: ");

		int strlen = userInput.length();

		if (strlen <= 12)
		{
			JOptionPane.showMessageDialog( null, 
			"The credit card number you entered is too short");
			prompt();
		}
		else if (strlen >= 17)
		{
			JOptionPane.showMessageDialog( null, 
			"The credit card number you entered is too long");

			prompt();
		}

		int sum = 0;
		int value;
		boolean validate = false;

		while (strlen-- > 0) 
		{
			value = Integer.parseInt(userInput.substring(strlen, strlen + 1));

			if (validate) 
			{
				value *= 2;
				
				if (value > 9)
				{
					value -= 9;
				}
			}
			sum += value;
			validate = !validate;
		}
		return (sum % 10) == 0;
	}
	
	public static boolean prompt()
	{
		boolean again = true;		
		int continueOrNot = JOptionPane.showConfirmDialog( null, 
		"Would you like to continue this transaction?");

		JOptionPane.showMessageDialog( null, continueOrNot);
		
		if(continueOrNot == 0)
		{
			validateCard();
		}
		else if(continueOrNot == 1 || continueOrNot == 2)
	    {
			again = false;
	    }

		return again;
	}

}
