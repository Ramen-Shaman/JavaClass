package org.uofm.tools;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadDataFile 
{
	public String filecontents = "";
	
	 public String ReadFile (String fileName) throws IOException
	 { 	
		 	
			FileReader Fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(Fr);
		try
		{

			
			while ((filecontents = br.readLine()) != null)
			{
			 return filecontents;
			}
			
		
		 
		}
		catch(IOException exc)
		{
			System.out.println();
			exc.getMessage();
		}
		finally
		{
			br.close();
		}
		return filecontents;

	 }
}
