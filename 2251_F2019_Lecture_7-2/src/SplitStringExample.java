//	TECH 2251
//	Advanced Programming Technology
//	Fall 2019
//	The University of Memphis
//
//	Assignment:		Lecture 7-2 Program 2
//	Developer:		Todd S. Canaday
//	Version:		1.0
//	Compiler:		Java ver. 1.8.0_221
//	Date:			August 2, 2019
//
//	Program Description:
//	
//	Example Java program demonstrating how to split
//	a String based on a delimiter and store the contents
//	into String array...

import java.util.Scanner;

public class SplitStringExample
{
	//	object used to grab input from keyboard...
	static Scanner keyboard = new Scanner(System.in);
	
	public static void main(String args[])
	{
		String theDate = "";					//	holds user input...
		String[] theDateArray = new String[3];	//	will hold seperated MM/DD/YYYY...
		
		try
		{
			//	ask the user to enter the date in MM/DD/YYYY format...
			System.out.print("Please enter the date (MM/DD/YYYY):  ");
			
			//	this will take care of users that enter letters...
		    while(!keyboard.hasNext())
		    {
		    	System.out.print("Please enter the date:  ");
		    	keyboard.next();
		    }
		    
		    //	get the user entry and store it...
		    theDate = keyboard.next();
		    
		    //	split the string the user entered based on the '/' character...
		    theDateArray = theDate.split("/");
		    
		    /************************************************************************/
		    /*	ERROR DETECTION - ERROR CORRECTION									*/
		    /************************************************************************/
		    //	if the day is not 2 characters in length, then
			//	we need to tell the user...
			if(theDateArray[0].length() != 2)
			{
				System.out.println("Hey genius, you were supposed to enter a two digit day...");
				return;
			}
			
			//	if the month is not 2 characters in length, then
			//	we need to tell the user...
			if(theDateArray[1].length() != 2)
			{
				System.out.println("Hey genius, you were supposed to enter a two digit month...");
				return;
			}
			
			//	if the year is not 4 characters in length, then
			//	we need to tell the user...
			if(theDateArray[2].length() != 4)
			{
				System.out.println("Hey genius, you were supposed to enter a four digit year...");
				return;
			}
					
			//	if EDEC passes, show the user that the array looks like...
			
		    //	show the contents of the String array after using split()...
		    System.out.println("theDateArray[0] contains:  " + theDateArray[0]);
		    System.out.println("theDateArray[1] contains:  " + theDateArray[1]);
		    System.out.println("theDateArray[2] contains:  " + theDateArray[2]);
		    
		    //	add some line spacing...
			System.out.println();
		}
		catch(Exception exc)
		{
			
		}
	}
}
