package org.uofm.tools;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class WriteDataFile 
{

	public boolean writemode;
	
	public boolean WriteFile(String fileName) throws IOException
	{
		ReadDataFile rdf = new ReadDataFile();
		FileWriter Fw = new FileWriter(fileName, false);
		
		Fw.write(rdf.filecontents);
		
		Fw.close();
		return writemode;
	}
}

