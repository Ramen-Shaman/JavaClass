//	TECH 2251
//	Advanced Programming Technology
//	Fall 2019
//	The University of Memphis
//
//	Assignment:		In Class Example 9-1.1
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
public class InheritanceDemo1
{
	/**
	 * Main class where the program is launched from.
	 * @param args
	 */
	public static void main(String[] args)
	{
		//	create objects of each class...
		Class_A ca = new Class_A();
		Class_B cb = new Class_B();
		
		//	call the method in Class_A to add 2 numbers...
		int result = ca.AddTwoNumbers(500, 250);
		System.out.println("The result is:  " + result);
		
		//	call the method in Class_b to add 3 numbers...
		result = cb.AddThreeNumbers(10, 20, 30);
		System.out.println("The result is:  " + result);
	}
}

/**
 * Demo class 'A'.
 * @author Todd S. Canaday
 * <br />Adjunct Professor
 * <br />The University of Memphis
 * <br />Herff College of Engineering<br />
 * @since 1.0
 */
class Class_A
{
	public int intVarOne = 0;
	public int intVarTwo = 0;
	
	public int AddTwoNumbers(int x, int y)
	{
		return(x+y);
	}
}

/**
 * Demo class 'B'.
 * @author Todd S. Canaday
 * <br />Adjunct Professor
 * <br />The University of Memphis
 * <br />Herff College of Engineering<br />
 * @since 1.0
 */
class Class_B
{
	public double dblVarOne = 0.0;
	public double dblVarTwo = 0.0;
	
	public int AddThreeNumbers(int x, int y, int z)
	{
		return(x + y + z);
	}
}
