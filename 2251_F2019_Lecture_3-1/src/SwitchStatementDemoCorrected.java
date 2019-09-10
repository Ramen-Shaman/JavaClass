//	TECH 2251
//	Advanced Programming Technology
//	Fall 2019
//	The University of Memphis
//
//	Assignment:		Lecture 3-1.2
//	Developer:		Todd S. Canaday
//	Version:		1.0
//	Compiler:		Java ver. 1.8.0_221
//	Date:			August 2, 2019
//
//	Program Description:
//
//	Using the switch control statement with break.

import java.util.Scanner;

public class SwitchStatementDemoCorrected
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
					break;
				case 2:
					System.out.println("February");
					break;
				case 3:
					System.out.println("March");
					break;
				case 4:
					System.out.println("April");
					break;
				case 5:
					System.out.println("May");
					break;
				case 6:
					System.out.println("June");
					break;
				case 7:
					System.out.println("July");
					break;
				case 8:
					System.out.println("August");
					break;
				case 9:
					System.out.println("September");
					break;
				case 10:
					System.out.println("October");
					break;
				case 11:
					System.out.println("November");
					break;
				case 12:
					System.out.println("December");
					break;
				default:
					System.out.println("Invalid choice");
					break;
			}
			
			keyboard.close();
		}
		catch(Exception exc)
		{
			System.out.println("Oops!  We had an exception!");
		}
	}
}
