//	TECH 2251
//	Advanced Programming Technology
//	Fall 2019
//	The University of Memphis
//
//	Assignment:		Lecture 3-Lab Example
//	Developer:		Todd S. Canaday
//	Version:		1.0
//	Compiler:		Java ver. 1.8.0_221
//	Date:			August 2, 2019
//
//	Program Description:
//
//	Simple Java program that demonstrates
//	a console user menu.

import java.util.Scanner;

public class ExampleMenu
{
	//	object used to grab input from keyboard...
	static Scanner keyboard = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		String userChoice;				//	stores the user selection...
		boolean exitProgram = false;	//	indicates whether of not to exit the program...
		
		do
		{
			//	show the menu options to the user...
			/*  IN CLASS:   students will make the following block	*/
			/*				of code (display of menu) into a method	*/
			/*				the method will be called ShowMenu		*/
			System.out.println("This program will demonstrate the use of");
			System.out.println("a command line menu.  Available options:");
			System.out.println();
			System.out.println("a.  Choice a");
			System.out.println("b.  Choice b");
			System.out.println("c.  Choice c");
			System.out.println("d.  Choice d");
			System.out.println("e.  Exit");
			
			//	ask the user for their choice
			//	and get the input from keyboard...
			System.out.print("Your choice:  ");
			userChoice = keyboard.next();
			System.out.println();
			
			//	based on the users choice, perform the appropriate action...
			switch(userChoice)
			{
				case "a":
					System.out.println("You entered choice a.\n");
					break;
				case "b":
					System.out.println("You entered choice b.\n");
					break;
				case "c":
					System.out.println("You entered choice c.\n");
					break;
				case "d":
					System.out.println("You entered choice d.\n");
					break;
				case "e":
					exitProgram= true;
					break;
				default:
					System.out.println("Sorry, that was an invalid choice.  Try again!");
					break;
			}
		}
		while(!exitProgram);
		
		System.out.println("\nThis program has ended.  Thank you for trying it!");
		
		//	when done with Scanner object - we MUST close it!
		keyboard.close();
	}
}
