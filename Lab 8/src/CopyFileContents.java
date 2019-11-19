/* 
 * TECH 2251
 * Advanced Programming Technology
 * Fall 2019
 * The University of Memphis
 * 
 * Assignment:		Copy File Contents
 * Developer:		Cameron Hall
 * Version:			1.0
 * Compiler:		Java ver. 1.8.0_201
 * Date:			November 12, 2019
 * Modified:		November 12, 2019
 * 
 * Program Description:
 * 
 * This program demonstrates the use
 * of custom exceptions as well as the use of File IO
 * 
 * 
 */

import java.io.IOException;
import org.uofm.tools.*;


public class CopyFileContents 
{

	public static void main(String[] args) throws IOException
	{				
		try
		{
			if(args.length > 1)
			{
				    String filestuff;
				    
					ReadDataFile reader = new ReadDataFile();
					filestuff = reader.ReadFile(args[0]);
					
					WriteDataFile writer = new WriteDataFile();
					writer.WriteFile(args[1], reader.filecontents);
					if(writer.writemode ==true)
					{
						System.out.println("File successfully copied!");
					}
					else
					{
						System.out.println("File copy unsuccessful.");
					}
					
		
			}
			else
			{
				throw(new InvalidFileNameException());
			}
		}
		catch (InvalidFileNameException exc)
		{
			
		}
		finally
		{
			ProgramHelper pH = new ProgramHelper();
			pH.DeveloperInformation();
		}

	}
}
