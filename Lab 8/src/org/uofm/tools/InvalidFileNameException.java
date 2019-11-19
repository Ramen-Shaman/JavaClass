package org.uofm.tools;


public class InvalidFileNameException extends Exception
{
	public InvalidFileNameException()
	{
		System.out.println("An Invalid file name exception occured! No File names specified!");
	}
	
	public InvalidFileNameException(String msg)
	{
		super(msg);
	}
}
