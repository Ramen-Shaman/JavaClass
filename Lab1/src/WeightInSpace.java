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

import java.text.DecimalFormat;
import java.util.Scanner;

public class WeightInSpace
{

	public static void main(String[] args)
	{
		
		// initialize variables...
		double EarthWeight = 0.0;
		double Height = 0.0;
		double SpaceWeight = 0.0;
		double EarthRadius = 3963.17;
		Scanner userInput = new Scanner(System.in); 
		
		// state the purpose of the program...
		System.out.println("This program will calculate the estimated");
		System.out.println("weight of an object orbiting the earth");
		System.out.println("at a given distance.");
		System.out.println("");
		
		// get weight from the user and store it...
		System.out.print("Enter the objects weight on Earth (in lbs): ");
		
		//Check to make sure it is a number. Otherwise, store it normally!
		while (!userInput.hasNextDouble())
		{
			System.out.println("Numbers only please!");
			System.out.println("Enter the objects weight on Earth (in lbs): ");
			userInput.next();
		}
		
		EarthWeight = userInput.nextDouble();
		//For debugging, uncomment below line
		//System.out.println(EarthWeight);
		
		// get distance from the user...
		System.out.print("Enter the distance of the object from Earth (in miles): ");
		
		while (!userInput.hasNextDouble())
		{
			System.out.println("Numbers only please!");
			System.out.println("Enter the distance of the object from Earth (in miles): ");
			userInput.next();
		}
		Height = userInput.nextDouble();
		//For debugging, uncomment below line
		//System.out.println(Height);
		
		//calculate the ratio based on the object's distance from earth...
		double ratio = (Math.pow(EarthRadius, 2)) / (Math.pow((EarthRadius + Height), 2));
		
		//calculate the weight of the object and store it...
		SpaceWeight = ratio * EarthWeight;
		
		System.out.println();
		
		//use the DecimalFormatter class to format the calculated 
		//value properly using commas and specified digits of precision...
		DecimalFormat formatter = new DecimalFormat ("#,###.00");
		DecimalFormat df = new DecimalFormat("0.#");
		df.setMaximumFractionDigits(8);
		
		
		//show your work...
		System.out.println("An object weighing "+ formatter.format(EarthWeight) + " pounds on Earth and");
		System.out.println("at a distance of " + formatter.format(Height) + " miles from the");
		System.out.println("Earth will weigh approximately " + formatter.format(SpaceWeight) + " pounds in space.");
		
		//Display author info...
		System.out.println("This program was written by: Cameron Hall");
		System.out.println("Laboratory Exercise 1");
		System.out.println("TECH 2251");
		System.out.println("Advanced Programming Technology");
		System.out.println("Fall 2019");
		System.out.println("The University of Memphis");
		
		//close scanner instance to prevent memory leaks...
		userInput.close();
		
	}

}
