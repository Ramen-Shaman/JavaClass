//	TECH 2251
//	Advanced Programming Technology
//	Fall 2019
//	The University of Memphis
//
//	Assignment:		In Class Example 9-1.3
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
public class InheritanceDemo3
{
	public static void main(String[] args)
	{
		Subclass s = new Subclass();
		int result = s.MultiplyTwoNumbers(5, 7);
		System.out.println("The result is:  " + result);
	}
}

/**
 * Demo class 'Superclass'.
 * @author Todd S. Canaday
 * <br />Adjunct Professor
 * <br />The University of Memphis
 * <br />Herff College of Engineering<br />
 * @since 1.0
 */
class Superclass
{
	public int MultiplyTwoNumbers(int a, int b)
	{
		System.out.println("Superclass");
		return(a * b);
	}
}

/**
 * Demo class 'Subclass' to show features
 * of inheritance in Java.
 * @author Todd S. Canaday
 * <br />Adjunct Professor
 * <br />The University of Memphis
 * <br />Herff College of Engineering<br />
 * @since 1.0
 */
class Subclass extends Superclass
{
	public int MultiplyTwoNumbers(int a, int b)
	{
		return(a * b);
	}
}


