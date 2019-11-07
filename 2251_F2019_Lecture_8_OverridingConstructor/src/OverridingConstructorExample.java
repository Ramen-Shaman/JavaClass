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
//	Program Description:
//
//	Example program demonstrating the use
//	of constructor overloading.

import org.uofm.tools.OverridingConstructor;

public class OverridingConstructorExample
{
	/**
	 * Main class where the program is launched from.
	 * @param args
	 */
	public static void main(String[] args)
	{
		//	create an object using the default constructor...
		OverridingConstructor oc1 = new OverridingConstructor();
		//	create an object using the overridden constructor
		//	that accepts a single double value...
		OverridingConstructor oc2 = new OverridingConstructor(1000.0);
		//	create an object using the overridden constructor
		//	that accepts two double values...
		OverridingConstructor oc3 = new OverridingConstructor(2000.0, 500.0);
		
		//	display the results when an object is created using the
		//	default constructor...
		System.out.println("Calling the default constructor...");
		System.out.println();
		System.out.println("depositAmount = " + oc1.depositAmount);
		System.out.println("withdrawAmount = " + oc1.withdrawAmount);
		System.out.println("accountBalance = " + oc1.accountBalance);
		System.out.println();
		
		//	display the results when an object is created using the
		//	overridden constructor that accepts a single double value...
		System.out.println("Calling the first overridden constructor...");
		System.out.println();
		System.out.println("depositAmount = " + oc2.depositAmount);
		System.out.println("withdrawAmount = " + oc2.withdrawAmount);
		System.out.println("accountBalance = " + oc2.accountBalance);
		System.out.println();
		
		//	display the results when an object is created using the
		//	overridden constructor that accepts two double values...
		System.out.println("Calling the second overridden constructor...");
		System.out.println();
		System.out.println("depositAmount = " + oc3.depositAmount);
		System.out.println("withdrawAmount = " + oc3.withdrawAmount);
		System.out.println("accountBalance = " + oc3.accountBalance);
	}
}
