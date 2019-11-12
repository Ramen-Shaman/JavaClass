//	TECH 2251
//	Advanced Programming Technology
//	Fall 2019
//	The University of Memphis
//
//	Assignment:		In Class Exercise Lecture 12-1
//	Developer:		Todd S. Canaday
//	Version:		1.0
//	Compiler:		Java ver. 1.8.0_221
//	Date:			August 2, 2019
//
//	Program Description:
//
//	A program that will demonstrates the use
//	of passing arguments to 'main()'.

public class UsingStringArguments
{
	/**
	 * The main program.
	 * @param args
	 */
	public static void main(String[] args)
	{
		if(args.length != 0)
		{
			//	display the arguments that the user passed in...
			for(int a=0; a<args.length; a++)
			{
				System.out.println("Argument #" + a + ":  " + args[a]);
			}
		}
		else
		{
			//	tell the user no arguments were passed in...
			System.out.println("No arguments passed to main().");
		}

	}

}
