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
//	to read a text file.

import java.io.FileInputStream;
import java.io.IOException;

public class ReadTextFile
{
	/**
	 * The main program.
	 * @param args
	 */
	public static void main(String[] args)
	{
		//	set the file path...
		String filePath = "C:\\temp\\";
		//	set the file name (you do this)...
		String fileName = "";
		//	create an object of the FileInputStream class...
		FileInputStream theFile;
		//	variable to store int value read from file...
		int x;
		
		try
		{
			//	open the specified file...
			theFile = new FileInputStream(filePath + fileName);
			
			//	print out the file...
			do
			{
				//	get the next byte in the file...
				x = theFile.read();
				//	print out the byte.  since the object
				//	reads bytes from the file and returns as an int,
				//	we need to cast the returned data as a char...
				System.out.print((char)x);
			}
			while(x != -1);		//	-1 means EOF reached...
			
			//	close the file...
			theFile.close();
		}
		catch(IOException exc)
		{
			//	display the error message...
			System.out.println(exc.getMessage());
		}
	}
}
