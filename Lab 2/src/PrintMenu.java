/* 
 * TECH 2251
 * Advanced Programming Technology
 * Fall 2019
 * The University of Memphis
 * 
 * Assignment:		Weight In Space Program
 * Developer:		Cameron Hall
 * Version:			1.0
 * Compiler:		Java ver. 1.8.0_201
 * Date:			August 10, 2019
 * Modified:		August 10, 2019
 * 
 * Program Description:
 * 
 * This program will calculate the weight of an
 * object in space based on the objects weight
 * and the distance from Earth.
 * 
 * Example:			The GOES R Satellite weights 6,173 lbs.
 * 					and orbits the Earth at a distance of 
 * 					22,300 miles. It's estimated weight
 * 					in space is 140.57 lbs.
 */

import java.util.Scanner;

public class PrintMenu 
{

	public static void main(String[] args)
	{
		
		//call description method...
		ProgramDescription();

		//present categories to users...
		System.out.println("0. Display Uppercase Letters");
		System.out.println("1. Display Lowercse Letters");
		System.out.println("2. Display Numbers 0-9");
		System.out.println("3. Exit");
		System.out.println();
		System.out.println();

		//Prompt user for selection...
		System.out.print("Enter your selection: ");


	}

	public static void ProgramDescription()
	{
	Scanner keybaord = new Scanner(System.in);
		
		System.out.println("This program will present different catagories of information");
		System.out.println("depending on what option the user selects.");
		System.out.println("");
	}
}


