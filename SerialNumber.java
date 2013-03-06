import java.lang.*;
import java.util.*;
import java.text.*;
import java.util.Random;
import java.util.Scanner;

public class SerialNumber
{
	public static final void main(String args[])
	{
		System.out.println("Enter the serial number: ");
		Scanner scan = new Scanner(System.in);
		String userInput = scan.nextLine();
//		System.out.println(userInput);
		
		if (checkSerial(userInput))
		{
			System.out.println("serial number is valid");
		}
		else
		{
			System.out.println("serial is not valid");
		}
		
		System.exit(0);
	}
	
	public static boolean checkSerial(String str)
	{
		boolean check = true;
		int i = 0;
		char c[] = str.toCharArray();

		if (!(c[5] == '-') && !(c[10] == '-'))
		{
			check = false;
			return check;
		}

		for(i = 0; i < 5; i++)
		{
			if (!Character.isLetter(c[i]))
			{
				check = false;
				return check;
			}
		}

		for(i = 6; i < 10; i++)
		{
			if (!Character.isDigit(c[i]))
			{
				check = false;
				return check;
			}
		}

		for(i = 11; i < 15; i++)
		{
			if (!Character.isLetter(c[i]))
			{
				check = false;
				return check;
			}
		}
		
		return check;
	}
}
