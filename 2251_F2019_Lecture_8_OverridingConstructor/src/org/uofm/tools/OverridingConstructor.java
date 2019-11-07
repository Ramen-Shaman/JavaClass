package org.uofm.tools;

//	TECH 2251
//	Advanced Programming Technology
//	Fall 2019
//	The University of Memphis
//
//	Assignment:		In Class Exercise L8-1
//	Developer:		Todd S. Canaday
//	Version:		1.0
//	Compiler:		Java ver. 1.8.0_221
//	Date:			October 12, 2019
//
//	Class Description:
//
//	OverridingConstructor Class.  Used to
//	demonstrate the use of constructor
//	overloading within a Java program.

/**
 * OverridingConstructor Class.  Used to
 * demonstrate the use of constructor
 * overloading within a Java program.
 *  
 * @author Todd S. Canaday
 * <br />Adjunct Professor
 * <br />Herff College of Engineering
 * <br />The University of Memphis
 * @since 1.0
 */
public class OverridingConstructor
{
	//	member variables...
	public double depositAmount;
	public double withdrawAmount;
	public double accountBalance;
	
	//	constructor declarations...
	
	/**
	 * The default constructor for the class.
	 */
	public OverridingConstructor()
	{
	}
	
	/**
	 * An overridden constructor that accepts
	 * a single double value and sets the
	 * depositAmount variable to the value
	 * passed in.
	 * @param da
	 */
	public OverridingConstructor(double da)
	{
		depositAmount = da;
	}
	
	/**
	 * An overridden constructor that accepts
	 * two double values and sets the
	 * depositAmount variable and the withdrawAmount
	 * variable to the value passed in.
	 * @param da
	 * @param wa
	 */
	public OverridingConstructor(double da, double wa)
	{
		depositAmount = da;
		withdrawAmount = wa;
	}
	
	//	member methods, if any, would be placed here...
}
