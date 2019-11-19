import java.io.IOException;

import org.uofm.tools.*;

public class CopyFileContents 
{

	public static void main(String[] args) throws IOException
	{		
		if(args.length != 0)
		{
				ReadDataFile reader = new ReadDataFile();
				reader.ReadFile(args[0]);
				
				WriteDataFile writer = new WriteDataFile();
				writer.WriteFile(args[1]);
		}
		else
		{
		}
		

	}
}
