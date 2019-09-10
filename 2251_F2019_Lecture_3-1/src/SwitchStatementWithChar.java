//	TECH 2251
//	Advanced Programming Technology
//	Fall 2019
//	The University of Memphis
//
//	Assignment:		Lecture 3-1.3
//	Developer:		Todd S. Canaday
//	Version:		1.0
//	Compiler:		Java ver. 1.8.0_221
//	Date:			August 2, 2019
//
//	Program Description:
//
//	Using the switch control statement with char.

import java.util.Scanner;

public class SwitchStatementWithChar
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int userChoice = 0;
		
		try
		{
			System.out.print("Enter a decimal representation of a char:  ");
			userChoice = keyboard.nextInt();
			
			switch(userChoice)
			{
				case 'a':
					System.out.println("Choice 'a'.");
					break;
				case 'b':
					System.out.println("Choice 'b'.");
					break;
				case 'c':
					System.out.println("Choice 'c'.");
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