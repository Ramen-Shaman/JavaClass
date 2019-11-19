package org.uofm.tools;


import java.io.FileWriter;
import java.io.IOException;


public class WriteDataFile 
{

	public boolean writemode;
	
	public boolean WriteFile(String fileName, String contents) throws IOException
	{
	
		FileWriter Fw = new FileWriter(fileName, false);
		String s; 
		
<<<<<<< HEAD
		rdf.ReadFile(fileName);
		Fw.write(s = rdf.filecontents);
=======
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
>>>>>>> 9ad3c72cd72eac62b599eaa08abecda5038ddf63
		
		return writemode;
	}
}

