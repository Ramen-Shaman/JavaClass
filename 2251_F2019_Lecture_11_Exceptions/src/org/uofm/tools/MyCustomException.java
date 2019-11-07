package org.uofm.tools;

//	TECH 2251
//	Advanced Programming Technology
//	Fall 2018
//	The University of Memphis
//
//	Assignment:		In Class Example 11-1
//	Developer:		Todd S. Canaday
//	Version:		1.0
//	Compiler:		Java ver. 1.8.0_144
//	Date:			August 3, 2018
//
//	Class Description:
//
//	Class used to handle a custom exception.

/**
 * A class used to handle a
 * custom exception.
 * 
 * @author Todd S. Canaday
 * <br />Adjunct Professor
 * <br />Herff College of Engineering
 * <br />The University of Memphis
 * @since 1.0
 */
public class MyCustomException extends Exception
{
	/**
	 * Default constructor
	 */
	public MyCustomException()
	{
	}
	
	/**
	 * Overriden constructor
	 * @param msg
	 */
	public MyCustomException(String msg)
	{
		//	super is a call to the constructor
		//	of the Exception class.
		super(msg);
	}
}




