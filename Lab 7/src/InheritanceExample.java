/* 
 * TECH 2251
 * Advanced Programming Technology
 * Fall 2019
 * The University of Memphis
 * 
 * Assignment:		Inheritance Example
 * Developer:		Cameron Hall
 * Version:			1.0
 * Compiler:		Java ver. 1.8.0_201
 * Date:			November 12, 2019
 * Modified:		November 12, 2019
 * 
 * Program Description:
 * 
 * This program demonstrates the use
 * of inheritance within the Java framework.
 * 
 * 
 */

import org.uofm.tools.*;


public class InheritanceExample {

	public static void main(String[] args) 
	{	
		//Create and object of the Program Helper class
		ProgramHelper pH = new ProgramHelper();
		
		//call the program description method
		pH.ProgramDescription();
		System.out.println();
		
		//creating and using the algebra class and it's extended methods
		Algebra a = new Algebra();
		System.out.println("Addition results 10 + 30: " +a.AddTwoNumbers(10, 30) + "");
		System.out.println("Subtraction results 10 - 30: " +a.SubtractTwoNumbers(10, 30)+ "");
		System.out.println("Mutiplication results 10 * 30" +a.MultiplyTwoNumbers(10, 30) + "");
		System.out.println("Division results 10 / 30: " + a.DivideTwoNumbers(10, 30)+ "");
		
		//creating arrays to hold the results of the differential and quadratic equations
		double [] de = a.DifferentialEquation(55, 32, 9, 21);
		double [] qe = a.QuadraticEquation(1, 5, 2);
		
		//print out the results
		System.out.println("Differintial equation results (values 55,32,9,21): " +de[0]+ ", " +de[1]);
		System.out.println("Quadratic equation results (values 1,5,2): The roots are " +qe[0]+" and " +qe[1]+".");
		System.out.println();
		
		//finally, call the developer information method to show the author
		pH.DeveloperInformation();

	}
}
