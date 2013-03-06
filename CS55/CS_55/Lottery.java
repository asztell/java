import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.text.*;
import java.util.Random;
import java.util.Scanner;

public class Lottery
{
	public static final void main(String args[])
	{
		play();
	}
	
	public static void play()
	{
		Random randNum = new Random();

		int randomInt = 0;
		for(int i = 1; i <= 1; i++)
		{
			randomInt = randNum.nextInt(100);
			System.out.println("(Generated : " + String.format("%02d",randomInt) + ")");
		}

		System.out.println("Enter two digit number: ");
		Scanner scan = new Scanner(System.in);
		String userInput = scan.nextLine();
		if (userInput.length() > 2 || userInput.length() < 2)
		{
			System.out.println("You didn't enter two digits...try again");
			play();
		}

		int parsedInput = Integer.parseInt(userInput);
		System.out.println(userInput);

		String intToStr = Integer.toString(randomInt);
		char userZero = userInput.charAt(0), userOne = userInput.charAt(1);

		if(randomInt == parsedInput)
		{
			System.out.println("You guessed both digits!\nYou win $10,000!");
		}else if(userZero == intToStr.charAt(1)
				&& userZero == intToStr.charAt(0))
		{
			System.out.println("You guessed the two numbers, you win $3,000!");
		}else if(userZero == intToStr.charAt(0)
				|| userZero == intToStr.charAt(1)
				|| userOne == intToStr.charAt(0)
				|| userOne == intToStr.charAt(1))
		{
			System.out.println("You win $1,000!");
		}
		prompt();		
	}

	public static void prompt()
	{
		System.out.println ("Continue? (y/n): ");
		Scanner scan = new Scanner(System.in);
		char choice = scan.next().charAt(0);
		if(choice == 'y' || choice == 'Y')
		{
			play();
		}
	    else if(choice == 'n' || choice == 'N')
	    {
			System.exit(0);
	    }
	    else
	    {
			System.out.println("You must answer with y/n");
	    	prompt();
		}
	}
}
