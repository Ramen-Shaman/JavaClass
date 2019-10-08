//	TECH 2251
//	Advanced Programming Technology
//	Fall 2019
//	The University of Memphis
//
//	Assignment:		Lecture 6 Example 1
//	Developer:		Todd S. Canaday
//	Version:		1.0
//	Compiler:		Java ver. 1.8.0_221
//	Date:			August 2, 2019
//
//	Program Description:
//	
//	Simple Java program demonstrating
//	the single dimension array.

import java.util.Scanner;

public class CreateSingleDimensionedArray
{
	//	object used to grab input from keyboard...
	static Scanner keyboard = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		int arraySize = 0;			//	used to hold int conversion...
		double userEntry = 0;		//	used to hold double conversion...
		
		try
		{
			//	prompt the user for input...
			System.out.print("Enter the size for your array:  ");
			//	store the users input...
			arraySize = keyboard.nextInt();
			
			//	lets declare a char array where the size
			//	is defined by the user...
			double[] dblArray = new double[arraySize];
			
			//	now, based on the user size entry, let's
			//	get the user to enter values...
			for(int x=0; x<dblArray.length; x++)
			{
				//	prompt the user for input...
				System.out.print("Enter a number: ");
				//  get user input from keyboard...
				userEntry = keyboard.nextDouble();
				//	add the value to the array...
				dblArray[x] = userEntry;
			}
			
			//	add some space before printing our output...
			System.out.println();
			System.out.println();
			
			//	show the user what they entered...
			System.out.println("You entered the following numbers:");
			
			//	display the results of the array to the user...
			for(int y=0; y<dblArray.length; y++)
			{
				System.out.println(dblArray[y]);
			}
			
			//	1.  What would happen if one were added to the
			//		length of the array in the 'test' portion
			//		(i.e. - x<dblArray.length+1)?
			//	2.  What data type would the output be if the user
			//		entered int values?
			//	3.  What would happen if the user entered an
			//		alpha character for an entry into the array?
			//	4.	How could the programmer prompt the user to
			//		enter the sequential number for input (i.e. - 
			//		Please enter number 1:  "?
		}
		catch(ArrayIndexOutOfBoundsException oob)
		{
			//	had an exception with the array...
			oob.printStackTrace();
		}
		catch(NumberFormatException nfe)
		{
			//	had an exception with the number entered...
			nfe.printStackTrace();
		}
		catch(Exception exc)
		{
			//	had some other generic exception...
			exc.printStackTrace();
		}
	}
}
