package org.uofm.tools;


import java.io.FileWriter;
import java.io.IOException;


public class WriteDataFile 
{

	public boolean writemode;
	
	public boolean WriteFile(String fileName, String contents) throws IOException
	{
	
		FileWriter Fw = new FileWriter(fileName, false);
		
		try
		{
		Fw.write(contents);
		writemode = true;
		}
		
		catch (IOException exc)
		{
			writemode = false;
		}
		
		finally
		{
			try 
			{
				Fw.close();
			}
			catch(Exception ex)
			{
				writemode = false;
			}
		}
		
		return writemode;
	}
}

