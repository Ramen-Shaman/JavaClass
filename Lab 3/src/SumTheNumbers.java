/* 
 * TECH 2251
 * Advanced Programming Technology
 * Fall 2019
 * The University of Memphis
 * 
 * Assignment:		Sum of Numbers
 * Developer:		Cameron Hall
 * Version:			1.0
 * Compiler:		Java ver. 1.8.0_201
 * Date:			August 10, 2019
 * Modified:		August 10, 2019
 * 
 * Program Description:
 * 
 * This program will take a beginning and ending number 
 * and find the sum of all of the number between the given range..
 * 
 */

import java.util.Scanner;

public class SumTheNumbers 
{
	

	public static void main(String[] args) 
	{
		
	// initializing keyboard and exit flag here because they are outside the do while loop...
		Scanner keyboard = new Scanner(System.in);
		boolean exit = false;
		ProgramDescription();
		
		do
		{
			
		// initializing variables so they reset on each loop...
			boolean userError = false;
			int beginningNumber = 0;
			int endingNumber = 0;
			int numberSum = 0;
			
		// quick way to separate the user input from the calculation. 
		// this assists in a proper output...
			int number = 0;
			number = beginningNumber;
			
		// Ask the user for the beginning of the range...
			System.out.print("Enter a starting value (-1 to quit):  " );
			
		// test this input to make sure they not only don't want to quit
		// but also that the input is an integer, while handling
		// non-integers with style...
			try
			{
				//	get the user entry from the keyboard...
				beginningNumber = keyboard.nextInt();
				
				//	if user enters -1, they want to quit...
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
				
			// asking the user for the end of the range...
				System.out.print("Enter an ending value (-1 to exit): ");
				
			// same checking as above but at line 95...
				try
				{
					//	get the user entry from the keyboard...
					endingNumber = keyboard.nextInt();
					
					//	if user enters -1, they want to quit...
					if(endingNumber == -1)
					{
						
						//	set the flag indicating the user wants to exit the program...
						exit = true;
					}
					
				// we test to make sure the beginning number of the range
				// is smaller than the ending number...
					if(beginningNumber < endingNumber)
					{
						
					// if so, then begin finding the sum of numbers...
						for (number++; endingNumber>=number; number++)
						{
							numberSum = numberSum + number;
						}
						
					// and display the result...	
						System.out.println();
						System.out.println("The sum of the number "+beginningNumber+" to "+endingNumber+" is "+numberSum+".");
					}
					
				// if not, we ask them to provide the range again, starting with the beginning number prompt...
					else
					{
						System.out.println("The ending number must be larger than the beginning number!");				
					}
				}
				catch(Exception letterExc)
				{
					
					//	if a letter, handle here...
					keyboard.next();
					//	set the error flag to true...
					userError = true;
					//	tell the user what they did wrong and send them back to line 81...
					System.out.println("Invalid Entry! Try that again.");
				}
			}
		}
		
	// if the user exits, show them author info and close the keyboard to prevent leaks...
		while(!exit);
			DeveloperInformation();
			keyboard.close();
	}
	
	
	public static void ProgramDescription()
	{
		System.out.println();
		System.out.println("This program will take a beginning and ending number");
		System.out.println("and find the sum of all of the number between the given range.");
		System.out.println("");
	}
	
	public static void DeveloperInformation ()
	{
		System.out.println();
		System.out.println("This program was written by: Cameron Hall");
		System.out.println("Laboratory Exercise 3");
		System.out.println("TECH 2251");
		System.out.println("Advanced Programming Technology");
		System.out.println("Fall 2019");
		System.out.println("The University of Memphis");
	}
}
