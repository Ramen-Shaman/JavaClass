//	TECH 2251
//	Advanced Programming Technology
//	Fall 2019
//	The University of Memphis
//
//	Assignment:		Lecture 6 Example 2
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

public class SingleDimensionArrayExample
{
	//	object used to grab input from keyboard...
	static Scanner keyboard = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		int arraySize = 0;			//	used to hold int conversion...
		
		try
		{
			//	prompt the user for input...
			System.out.print("Enter the size for your array:  ");
			
			//  store the users input...
			arraySize = keyboard.nextInt();
			
			//	lets declare a char array where the size
			//	is defined by the user...
			char[] charArray = new char[arraySize];
			
			//	now, based on the user size entry, let's
			//	fill the array with characters...
			for(int x=0; x<charArray.length; x++)
			{
				//	using the ASCII character...
				charArray[x] = (char)(x+65);
			}
			
			//	add some space before printing our output...
			System.out.println();
			System.out.println();
			
			//	display the results of the array to the user...
			for(int y=0; y<charArray.length; y++)
			{
				System.out.print(charArray[y]);
			}
			
			//	1.  What would happen if one were added to the
			//		length of the array in the 'test' portion
			//		(i.e. - y<charArray.length+1)?
			//	2.  How would you print all 26 letters of the
			//		alphabet in lower case?
			//	3.  What would happen if the user entered an
			//		alpha character for the size of the array?
			//	4.	Rewrite the 'for' loop so that the letters
			//		Z through A are displayed.
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
