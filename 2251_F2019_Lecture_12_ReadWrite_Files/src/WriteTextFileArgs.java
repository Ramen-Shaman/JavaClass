//	TECH 2251
//	Advanced Programming Technology
//	Fall 2019
//	The University of Memphis
//
//	Assignment:		In Class Handout Lecture 12
//	Developer:		Todd S. Canaday
//	Version:		1.0
//	Compiler:		Java ver. 1.8.0_221
//	Date:			August 2, 2019
//
//	Program Description:
//
//	A program that will demonstrates how
//	to write to a text file using command
//	line arguments.

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class WriteTextFileArgs
{
	/**
	 * The main program.
	 * @param args
	 */
	public static void main(String[] args)
	{
		//	create an object of the Writer class...
		Writer writer = null;
		
		//	lets make sure that the user entered an argument (parameter)
		//	for the main() method...
		if(args.length != 0)
		{
			try
			{
				//	lets display the value entered into the args array
				//	just to show what is being sent...
				System.out.print("The argument passed in is:  ");
				System.out.println(args[0]);
				
				//	notice that we're using the args array to get the file name into
				//	the main() method...
				//	assign to the object of the Writer class...
				writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(args[0],true), "utf-8"));
				
				//	write the data...
				writer.write("This is a simple line of text.\r\n");
				
				//	let the user know that the file was written...
				System.out.println("File successfully written!");
			}
			catch(IOException exc)
			{
				//	let the user know that there was a problem...
				System.out.println("File write unsuccessful!");
				//	display the error message...
				System.out.println(exc.getMessage());
			}
			finally
			{
				try
				{
					//	close the file and release the handle...
					writer.close();
				}
				catch(Exception ex)
				{
				}
			}
		}
		else
		{
			//	tell the user no arguments were passed in...
			System.out.println("No arguments passed to main().");
		}
	}
}
