//	TECH 2251
//	Advanced Programming Technology
//	Fall 2019
//	The University of Memphis
//
//	Assignment:		In Class Example 9-1.2
//	Developer:		Todd S. Canaday
//	Version:		1.0
//	Compiler:		Java ver. 1.8.0_221
//	Date:			August 2, 2019
//
//	Program Description:
//	
//	Java program to demonstrate
//	inheritance.

/**
 * Container class used to demonstrate
 * inheritance in the Java language.
 * @author Todd S. Canaday
 * <br />Adjunct Professor
 * <br />The University of Memphis
 * <br />Herff College of Engineering<br />
 * @since 1.0
 */
public class InheritanceDemo2
{
	/**
	 * Main class where the program is launched from.
	 * @param args
	 */
	public static void main(String[] args)
	{
		//	create object of Class_B...
		Class_D cd = new Class_D();
		
		
		//	since Class_D inherits from Class_C,
		//	we have access to the member variables
		//	and methods of Class_C...
		int result = cd.AddTwoNumbers(500, 250);
		int y = cd.AddThreeNumbers(1, 2, 3);
		System.out.println("The result is:  " + result);
		System.out.println("The result is:  " + y);
	}
}

/**
 * Demo class 'C'.
 * @author Todd S. Canaday
 * <br />Adjunct Professor
 * <br />The University of Memphis
 * <br />Herff College of Engineering<br />
 * @since 1.0
 */
class Class_C
{
	public int intVarOne = 0;
	public int intVarTwo = 0;
	
	public int AddTwoNumbers(int x, int y)
	{
		return(x+y);
	}
}

/**
 * Demo class 'D' to show features
 * of inheritance in Java.
 * @author Todd S. Canaday
 * <br />Adjunct Professor
 * <br />The University of Memphis
 * <br />Herff College of Engineering<br />
 * @since 1.0
 */
class Class_D extends Class_C
{
	public double dblVarOne = 0.0;
	public double dblVarTwo = 0.0;
	
	public int AddThreeNumbers(int x, int y, int z)
	{
		return(x + y + z);
	}
}
