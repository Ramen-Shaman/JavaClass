/* 
 * TECH 2251
 * Advanced Programming Technology
 * Fall 2019
 * The University of Memphis
 * 
 * Assignment:		Print Menu and ASCII Conversion
 * Developer:		Cameron Hall
 * Version:			1.0
 * Compiler:		Java ver. 1.8.0_201
 * Date:			August 10, 2019
 * Modified:		August 10, 2019
 * 
 * Program Description:
 * 
 * This program will demonstrate a menu selection
 * while using separate methods for each option.
 * 
 */

import java.util.Scanner;

public class SumTheNumbers 
{
	

	public static void main(String[] args) 
	{
		
		int beginningNumber = 0;
		int endingNumber = 0;
		int numberSum = 0;
		Scanner keyboard = new Scanner(System.in);
		boolean exit = false;
		boolean userError = false;
		
		ProgramDescription();
		
		do
		{
			System.out.print("Enter a starting value (-1 to quit):  " );
				
			try
			{
				//	get the user entry from the keyboard...
				beginningNumber = keyboard.nextInt();
				
				//	if user enters -999, they want to quit...
				if(beginningNumber == -1)
				{
					//	set the flag indicating the user wants to exit the program...
					exit = true;
				}
			}
			catch(Exception letterExc)
			{
				//	if a letter, handle here...
				keyboard.next();
				//	set the error flag to true...
				userError = true;
				//	tell the user what they did wrong...
				System.out.println("Invalid Entry! Try that again.");
			}
			
			if(!exit && !userError)
			{
				
				System.out.print("Enter an ending value (-1 to exit): ");
				
				try
				{
					//	get the user entry from the keyboard...
					endingNumber = keyboard.nextInt();
					
					//	if user enters -999, they want to quit...
					if(endingNumber == -1)
					{
						//	set the flag indicating the user wants to exit the program...
						exit = true;
					}
				}
				catch(Exception letterExc)
				{
					//	if a letter, handle here...
					keyboard.next();
					//	set the error flag to true...
					userError = true;
					//	tell the user what they did wrong...
					System.out.println("Invalid Entry! Try that again.");
				}
				
				if(!exit && !userError)
				{
					numberSum = beginningNumber + endingNumber;
					System.out.println("The sum of the numbers " + beginningNumber + " to "+ endingNumber + " is "+ numberSum + "." );
				}
			}
		}
		while(!exit);
		
			DeveloperInformation();
			
			keyboard.close();

	}
	
	
	public static void ProgramDescription()
	{
		System.out.println();
		System.out.println("This program will present different catagories of information");
		System.out.println("depending on what option the user selects. Here are some available options:");
		System.out.println("");
	}
	
	public static void DeveloperInformation ()
	{
		System.out.println();
		System.out.println("This program was written by: Cameron Hall");
		System.out.println("Laboratory Exercise 2");
		System.out.println("TECH 2251");
		System.out.println("Advanced Programming Technology");
		System.out.println("Fall 2019");
		System.out.println("The University of Memphis");
	}
}
