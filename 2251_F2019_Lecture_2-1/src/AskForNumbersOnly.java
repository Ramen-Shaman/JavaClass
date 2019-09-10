//	TECH 2251
//	Advanced Programming Technology
//	Fall 2019
//	The University of Memphis
//
//	Assignment:		Demonstration of number validation
//	Developer:		Todd S. Canaday
//	Version:		1.0
//	Compiler:		Java ver. 1.8.0_221
//	Date:			August 2, 2019
//
//	Program Description:
//
//	Simple program that accepts numbers only.

import java.util.Scanner;

public class AskForNumbersOnly
{
	//	object used to grab input from keyboard...
	static Scanner keyboard = new Scanner(System.in);
	
	//	all executable Java programs MUST have a 
	//	'main()' function...
	public static void main(String[] args)
	{
		System.out.println("Program gets a number and does something.");
		
		//	declare a variable to store the users input...
		double userEntry = 0.0;
		
		//	ask the user to enter a number...
	    System.out.print("Enter a number:  ");

	    //	here is where we check to make sure that the user entered
	    //	a numeric value.  if not, prompt the user to enter a numeric
	    //	value and continue when they do...
	    while(!keyboard.hasNextDouble())
	    {
	    	System.out.println("Numbers only please!");
	    	System.out.print("Enter a number:  ");
	    	keyboard.next();
	    }
	    
	    //	get the user entry and store in in the variable 'costOfMeal'...
	    userEntry = keyboard.nextDouble();
	    
	    //	display the users entry back to them...
	    System.out.println("Great!  You entered the number " + userEntry + ".");
	}
	
	static void ProgramDescription()
	{
		System.out.println("Program gets a number and does something.");
	}
}
