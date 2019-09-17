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

public class PrintMenu 
{

	public static void main(String[] args)
	{
			boolean exit = false;
			int userChoice = 0;
			Scanner keyboard = new Scanner(System.in);
			
			do 
			{
				
				//call description method...
				ProgramDescription();
	
				//present categories to users...
				System.out.println("1. Display Uppercase Letters");
				System.out.println("2. Display Lowercse Letters");
				System.out.println("3. Display Numbers 0-9");
				System.out.println("4. Exit");
				System.out.println();
				System.out.println();
				System.out.print("Enter your selection: ");
				
				try
				{
					//	ask the user to enter a number...
					userChoice = keyboard.nextInt();
					
					switch(userChoice)
					{
						case 1:
							PrintUppercaseLetters();
							break;
						case 2:
							PrintLowercaseLetters();
							break;
						case 3:
							PrintNumbers();
							break;
						case 4:
							exit = true;
							break;
						default:
							System.out.println();
							System.out.println("Invalid choice! Please try again.");
							break; 
					}
					
					
				}
				catch(Exception exc)
				{
					System.out.println("Oops!  We had an exception!");
				}
			}
			
			while (!exit);
			
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
	
	public static void PrintUppercaseLetters ()
	{
		
		System.out.println();
		for (int i = 65; i < 91; i++)
		{
			System.out.println((char) i);
		}
		
	}
	
	
	public static void PrintLowercaseLetters ()
	{
		
		System.out.println();
		for (int i = 97; i < 123; i++)
		{
			System.out.println((char) i);
		}
		
	}
	
	public static void PrintNumbers()
	{
		
		System.out.println();
		for (int i = 48; i < 58; i++)
		{
			System.out.println((char) i);
		}
		
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


