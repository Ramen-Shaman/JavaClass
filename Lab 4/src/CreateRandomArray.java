/* 
 * TECH 2251
 * Advanced Programming Technology
 * Fall 2019
 * The University of Memphis
 * 
 * Assignment:		Create Random Array
 * Developer:		Cameron Hall
 * Version:			1.0
 * Compiler:		Java ver. 1.8.0_201
 * Date:			August 10, 2019
 * Modified:		August 10, 2019
 * 
 * Program Description:
 * 
 * This program will prompt the user for an
 * array size, populate the array with random
 * double values between 0.0 and 100.0, sort
 * the array and finally display the results
 * to the user.
 * 
 */

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class CreateRandomArray 
{

	public static void main(String[] args) 
	{	
		Scanner keyboard = new Scanner(System.in);
		int arraySize = 0;
		double[] printArray = new double[arraySize];
		DecimalFormat df = new DecimalFormat("#.##");
		
		ProgramDescription();
		
		System.out.print("Enter the size of the array: ");
	try
	{
		arraySize = keyboard.nextInt();
		keyboard.close();	
	}
	
	
	catch(ArrayIndexOutOfBoundsException oob)
	{
		oob.printStackTrace();
	}
	catch(NumberFormatException nfe)
	{
		nfe.printStackTrace();
	}
	catch(Exception exc)
	{
		exc.printStackTrace();
	}
	
	System.out.println("The sorted double array is:");
	
	printArray = CreateRandomValueArray(arraySize);
	
		for (int y = 0; y<printArray.length; y++)
		{
			System.out.println("Number = " +df.format(printArray[y])+ "");
		}
		
		DeveloperInformation();
		
	}
	
	public static double[] CreateRandomValueArray(int size)
	{
		// The following method was provided by Professor Todd S. Canaday 
		// and slightly modified to be sorted...

		Random rand = new Random();
		double[] doubleArray = new double[size];
			
		for (int x=0; x<size; x++)
		{

			doubleArray[x] = 100.0 * rand.nextDouble();
		}
			
		Arrays.sort(doubleArray);
		
		return(doubleArray);
	}
	
	public static void ProgramDescription()
	{
		System.out.println();
		System.out.println("This program will prompt the user for an");
		System.out.println("array size, populate the array with random");
		System.out.println("double values between 0.0 and 100.0, sort");
		System.out.println("the array and finally display the results");
		System.out.println("to the user.");
		System.out.println();
	}
	
	public static void DeveloperInformation ()
	{
		System.out.println();
		System.out.println("This program was written by: Cameron Hall");
		System.out.println("Laboratory Exercise 4");
		System.out.println("TECH 2251");
		System.out.println("Advanced Programming Technology");
		System.out.println("Fall 2019");
		System.out.println("The University of Memphis");
	}

}
