//	TECH 2251
//	Advanced Programming Technology
//	Fall 2019
//	The University of Memphis
//
//	Assignment:		Lecture 3-1.4
//	Developer:		Todd S. Canaday
//	Version:		1.0
//	Compiler:		Java ver. 1.8.0_221
//	Date:			August 2, 2019
//
//	Program Description:
//
//	Using the switch control statement with String.

import java.util.Scanner;

public class SwitchStatementWithString
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		String userChoice = "";
		
		try
		{
			System.out.print("Enter a string:  ");
			userChoice = keyboard.next();
			
			switch(userChoice)
			{
				case "Hello":
					System.out.println(userChoice + " Java World!");
					break;
				case "Java":
					System.out.println("Hello " + userChoice + " World!");
					break;
				case "World":
					System.out.println("Hello Java " + userChoice + "!");
					break;
				default:
					System.out.println("Invalid choice.");
					break;
			}
		}
		catch(Exception exc)
		{
			System.out.println("Oops!  We had an exception!");
		}
	}
}