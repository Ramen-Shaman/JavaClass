//	TECH 2251
//	Advanced Programming Technology
//	Fall 2019
//	The University of Memphis
//
//	Assignment:		Lecture 4-1
//	Developer:		Todd S. Canaday
//	Version:		1.0
//	Compiler:		Java ver. 1.8.0_221
//	Date:			September 15, 2019
//
//	Program Description:
//
//	Simple program that shows the user how to quit a program
//	based on a specific criteria.

import java.util.Scanner;

/**
 * Class demonstrating how to exit a program
 * based on a specific criteria.
 * 
 * @author Todd S. Canaday
 * <br />Adjunct Professor
 * <br />Herff College of Engineering
 * <br />The University of Memphis
 * @since 1.0
 */
public class Lecture_4_Demo
{
	/**
	 * Main method where application is launched from.
	 * @param args
	 */
	public static void main(String[] args)
	{
		//	object used to grab input from keyboard...
		Scanner keyboard = new Scanner(System.in);
		boolean userQuit = false;	//	boolean value indicating user exit...
		boolean entryError = false;	//	boolean value indicating input error...
		int userEntry = 0;			//	variable to store the users entry...

		//	describe the program to the user...
		System.out.println("This program shows the user how to");
		System.out.println("use a specic value to exit a program.");
		
		//	execute this program until the user enters a specific
		//	value to quit...
		do
		{
			entryError = false;		//	clear the entryError flag upon each entry...
			
			//	prompt the user to enter an int value...
			System.out.print("Enter an integer value (999 to quit):  ");
			
			try
			{
				//	get the user entry from the keyboard...
				userEntry = keyboard.nextInt();
				
				//	if user enters -999, they want to quit...
				if(userEntry == -999)
				{
					//	set the flag indicating the user wants to exit the program...
					userQuit = true;
				}
			}
			catch(Exception letterExc)
			{
				//	if a letter, handle here...
				keyboard.next();
				//	set the error flag to true...
				entryError = true;
				//	tell the user what they did wrong...
				System.out.println("Letters are not allowed!");
			}
			
			//	user decided to continue the program and has entered a valid number...
			if(!userQuit && !entryError)
			{
				System.out.println("You entered the integer value " + userEntry + ".");
			}
		}
		while(!userQuit);
		
		//	program developer information...
		System.out.println("\n\nThis program written by: Student Name");
		System.out.println("TECH 2251");
		System.out.println("Advanced Programming Technology");
		System.out.println("Fall 2019");
		System.out.println("The University of Memphis");
		
		//	close the keyboard...
		keyboard.close();
	}

}
