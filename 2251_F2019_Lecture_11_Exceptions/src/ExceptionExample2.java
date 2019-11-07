//	TECH 2251
//	Advanced Programming Technology
//	Fall 2019
//	The University of Memphis
//
//	Assignment:		In Class Example 11-1.2
//	Developer:		Todd S. Canaday
//	Version:		1.0
//	Compiler:		Java ver. 1.8.0_221
//	Date:			August 2, 2019
//
//	Program Description:
//	
//	Java program to demonstrate
//	a generic exception and an
//	ArrayIndexOutOfBoundsException.

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
public class ExceptionExample2
{
	/**
	 * Main class where the program is launched from.
	 * @param args
	 */
	public static void main(String[] args)
	{
		//	declare simple int array...
		int[] testArray = {1,2,3,4,5,6,7,8,9,10};
		
		//	place all code within the try statement
		//	so that if anything 'blows up' one of the
		//	catch statements will handle it...
		try
		{
			//	attempt to go outside the bounds
			//	of the array...
			for(int x=0; x<11; x++)
			{
				//	print out the index and a space on the same line...
				System.out.print(testArray[x] + " ");
			}
			
			System.out.println();
		}
		catch(ArrayIndexOutOfBoundsException ai)
		{
			//	catch the ArrayIndexOutOfBoundsException...
			System.out.println();
			System.out.println("An ArrayIndexOutOfBoundsException occurred!");
		}
		catch(Exception exc)
		{
			//	if not the exception above, this should
			//	catch everything else...
			System.out.println();
			System.out.println("A generic Exception occurred!");
		}
	}
}