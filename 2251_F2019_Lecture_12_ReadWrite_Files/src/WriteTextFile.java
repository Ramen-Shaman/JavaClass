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
//	to write to a text file.

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class WriteTextFile
{
	/**
	 * The main program.
	 * @param args
	 */
	public static void main(String[] args)
	{
		//	set the file name (you do this)...
		//	NOTE - directory path seperator uses two forward slashes (//)...
		String fileName = "C:\\temp\\test1.txt";
		//	create an object of the Writer class...
		Writer writer = null;
		//	define the size of numbers...
		int maxValues = 26;
		
		try
		{
			//	assign to the object of the Writer class...
			writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName,false), "utf-8"));
			
			//	loop through the values of the counter...
			for(int a=65; a<(65+maxValues); a++)
			{
				//	write the data...
				writer.write(a);
				//	followed by a special character...
				writer.write("~");
			}
			
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
}
