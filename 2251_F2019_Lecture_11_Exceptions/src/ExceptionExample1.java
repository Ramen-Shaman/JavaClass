//	TECH 2251
//	Advanced Programming Technology
//	Fall 2019
//	The University of Memphis
//
//	Assignment:		In Class Example 11-1.1
//	Developer:		Todd S. Canaday
//	Version:		1.0
//	Compiler:		Java ver. 1.8.0_221
//	Date:			August 2, 2019
//
//	Program Description:
//	
//	Java program to demonstrate
//	a generic exception.

/**
 * Class used to launch Exception
 * Example discussed in lecture.
 * 
 * @author Todd S. Canaday
 * <br />Adjunct Professor
 * <br />Herff College of Engineering
 * <br />The University of Memphis
 * @since 1.0
 */
public class ExceptionExample1
{
	/**
	 * Main class where the program is launched from.
	 * @param args
	 */
	public static void main(String[] args)
	{
		//	declare simple int array...
		int[] testArray = {2,4,6,8,10};
		
		//	place all code within the try statement
		//	so that if anything 'blows up' the catch
		//	statement will handle it...
		try
		{
			//	attempt to go outside the bounds
			//	of the array...
			for (int x=0; x<6; x++)
			{
				//	print out the index and a space on the same line...
				System.out.print(testArray[x] + " ");
			}
			
			System.out.println();
		}
		catch(Exception exc)
		{
			//	we had an exception, so print the
			//	stack trace...
			System.out.println("\nError!\n");
			System.out.println("Error Message:  " + exc.getMessage());
		}
	}
}