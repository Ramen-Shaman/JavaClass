package org.uofm.tools;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
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
			 filecontents = br.readLine();
		 }
		 catch (FileNotFoundException fnf)
		 {
			 System.out.println("where does this show up?");
			 fnf.getMessage();
		 }
		 catch (IOException exc)
		 {
			 System.out.println("There was an error reading the file!");
		 }

		 finally
		 {
		 br.close();
		 Fr.close();
		 }
		
		 return filecontents;
		 
		
	 }

}
