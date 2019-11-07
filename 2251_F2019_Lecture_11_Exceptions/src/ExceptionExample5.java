import org.uofm.tools.MyCustomException;

//	TECH 2251
//	Advanced Programming Technology
//	Fall 2019
//	The University of Memphis
//
//	Assignment:		In Class Example 11-1.5
//	Developer:		Todd S. Canaday
//	Version:		1.0
//	Compiler:		Java ver. 1.8.0_221
//	Date:			August 2, 2019
//
//	Program Description:
//	
//  Java program to demonstrate
//  a generic exception, a
//  NullPointerException, an
//  ArrayIndexOutOfBoundsException,
//	and a custom exception using
//  command line arguments.

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
public class ExceptionExample5
{
	/**
	 * Main class where the program is launched from.
	 * @param args
	 */
	public static void main(String[] args) throws MyCustomException
	{
		int maxArguments = 3;
		
		//	place all code within the try statement
		//	so that if anything 'blows up' one of the
		//	catch statements will handle it...
		try
		{
			//	let's check to see if the number of arguments
			//	exceeds our maximum value...
			if(args.length > maxArguments)
			{
				//	evidently we have entered more arguments than we wanted,
				//	so we will throw an exception (a custom exception in this case)...
				throw(new MyCustomException("Too many arguments!"));
			}
			
			//	attempt to go outside the bounds
			//	of the array...
			for(int x=0; x<3; x++)
			{
				//	print out the index and a space on the same line...
				System.out.print(args[x] + " ");
			}
			
			System.out.println();
		}
		catch(ArrayIndexOutOfBoundsException ai)
		{
			//	catch the ArrayIndexOutOfBoundsException...
			System.out.println();
			System.out.println("An ArrayIndexOutOfBoundsException occurred!");
		}
		catch(NullPointerException npe)
		{
			//	catch the NullPointerException...
			System.out.println();
			System.out.println("An NullPointerException occurred!");
		}
		catch(MyCustomException mce)
		{
			//	catch the MyCustomException...
			System.out.println();
			System.out.println(mce.getMessage());
		}
		catch(Exception exc)
		{
			//	if not either of the exceptions above,
			//	this should catch everything else...
			System.out.println();
			System.out.println("A generic Exception occurred!");
		}
	}
}
