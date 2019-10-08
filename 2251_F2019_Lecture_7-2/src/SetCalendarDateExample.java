//	TECH 2251
//	Advanced Programming Technology
//	Fall 2019
//	The University of Memphis
//
//	Assignment:		Lecture 7-2 Program 3
//	Developer:		Todd S. Canaday
//	Version:		1.0
//	Compiler:		Java ver. 1.8.0_221
//	Date:			August 2, 2019
//
//	Program Description:
//	
//	Example Java program demonstrating how to enter
//	a date usint the MM/DD/YYYY format, then split the
//	user entry into a String array, and then set the
//	date based on the users entry...

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class SetCalendarDateExample
{
	//	object used to grab input from keyboard...
	static Scanner keyboard = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		String theDate = "";					//	holds user input...
		String[] theDateArray = new String[3];	//	will hold seperated MM/DD/YYYY...
		
		//	create an instance of the Gregorian calendar...
		GregorianCalendar gc = new GregorianCalendar();
		
		try
		{
			//	ask the user to enter the date in MM/DD/YYYY format...
			System.out.print("Please enter the date (MM/DD/YYYY):  ");
			
			//	this will take care of users that enter letters...
		    while(!keyboard.hasNext())
		    {
		    	System.out.print("Please enter the date (MM/DD/YYYY):  ");
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
					
			//	if EDEC passes, continue to set the date...
			
			//	convert each element of the string array into an int...
			int monthEntered = Integer.parseInt(theDateArray[0]);
			int dayEntered = Integer.parseInt(theDateArray[1]);
			int yearEntered = Integer.parseInt(theDateArray[2]);
		    
			//	set a new instance of the Calendar class to the
			//	date entered by the user...
			gc.set(Calendar.YEAR, yearEntered);
			gc.set(Calendar.MONTH, monthEntered-1);
			gc.set(Calendar.DAY_OF_MONTH, dayEntered);
			
			//	print out the calendar settings...
			System.out.println("I set the month to:  " + (gc.get(gc.MONTH)+1));		//	months are indexed beginning with 0...
			System.out.println("I set the day to:    " + gc.get(gc.DAY_OF_MONTH));	//	print out the day...
			System.out.println("I set the year to:   " + gc.get(gc.YEAR));			//	print out the year...
			
		    //	add some line spacing...
			System.out.println();
		}
		catch(Exception exc)
		{
			//System.out.println(exc.getMessage());
			exc.printStackTrace();
		}
	}
}
