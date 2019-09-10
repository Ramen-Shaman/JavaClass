//	TECH 2251
//	Advanced Programming Technology
//	Fall 2019
//	The University of Memphis
//
//	Assignment:		Lecture 3-1.1
//	Developer:		Todd S. Canaday
//	Version:		1.0
//	Compiler:		Java ver. 1.8.0_221
//	Date:			August 2, 2019
//
//	Program Description:
//
//	Using the switch control statement.

import java.util.Scanner;

public class SwitchStatementDemo
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int userChoice = 0;
		
		try
		{
			//	ask the user to enter a number...
			System.out.print("Enter a whole number between 1 and 12:  ");
			userChoice = keyboard.nextInt();
			
			switch(userChoice)
			{
				case 1:
					System.out.println("January");
				case 2:
					System.out.println("February");
				case 3:
					System.out.println("March");
				case 4:
					System.out.println("April");
				case 5:
					System.out.println("May");
				case 6:
					System.out.println("June");
				case 7:
					System.out.println("July");
				case 8:
					System.out.println("August");
				case 9:
					System.out.println("September");
				case 10:
					System.out.println("October");
				case 11:
					System.out.println("November");
				case 12:
					System.out.println("December");
				default:
					System.out.println("Invalid choice");
			}
			
			keyboard.close();
		}
		catch(Exception exc)
		{
			System.out.println("Oops!  We had an exception!");
		}
	}
}