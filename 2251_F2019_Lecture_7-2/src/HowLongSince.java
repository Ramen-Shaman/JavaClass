//	TECH 2251
//	Advanced Programming Technology
//	Fall 2019
//	The University of Memphis
//
//	Assignment:		Lecture 7-2 Program 4
//	Developer:		Todd S. Canaday
//	Version:		1.0
//	Compiler:		Java ver. 1.8.0_221
//	Date:			August 2, 2019
//
//	Program Description:
//	
//	Example Java program demonstrating how to calculate
//	the number of days elapsed from the current system
//	date and the user entered date...

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class HowLongSince
{
	//	object used to grab input from keyboard...
	static Scanner keyboard = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		String theDate = "";	//	variable to hold the user entry...
		int daysSince = 0;		//	variable to hold number of days since...
		String[] theDateArray = new String[3];	//	create an array to hold the three components of the date...
		
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
			
			//	create an instance of the calendar for the current year...
			GregorianCalendar gc = new GregorianCalendar();
			//  create an instance of the calendar for the entered year...
			GregorianCalendar gcEY = new GregorianCalendar();
			//	get the current year...
			int currentYear = gc.get(Calendar.YEAR);
		
			//	convert the String array elements to int data types...
			int monthEntered = Integer.parseInt(theDateArray[0]);
			int dayEntered = Integer.parseInt(theDateArray[1]);
			int yearEntered = Integer.parseInt(theDateArray[2]);
			
			//	set a new instance of the Calendar class to the
			//	date entered by the user...
			gcEY.set(Calendar.YEAR, yearEntered);
			gcEY.set(Calendar.MONTH, monthEntered-1);
			gcEY.set(Calendar.DAY_OF_MONTH, dayEntered);
			
			//	get the day of the year based on the date entered...
			int enteredDayOfYear = gcEY.get(gcEY.DAY_OF_YEAR);
			
			//	if the years are not equal, continue...
			if(gcEY.get(gc.YEAR) != Calendar.getInstance().get(Calendar.YEAR))
			{
				//	1.  We need to first determine the number of days in the first year...
				//	test to see if the year is a leap year - if so then we have 366 days
				//	in that year...
				boolean leapYr = gcEY.isLeapYear(gcEY.get(gc.YEAR));
				
				//	subtract the number of days in the year from the date entry...
				if(!leapYr)
					daysSince = 365 - enteredDayOfYear;
				else
					daysSince = 366 - enteredDayOfYear;
				
				//	2.  now, we need to loop through the years beginning with the year
				//	following the year entered and ending with the last calendar year...
				for(int a=yearEntered+1; a<currentYear-1; a++)
				{
					leapYr = gcEY.isLeapYear(a);
					
					if(!leapYr)
						daysSince += 365;
					else
						daysSince += 366;
				}
		
				//	3.  finally, we can determine the number of days to count in
				//	the current year based on the day of the year...
				daysSince += gc.get(Calendar.DAY_OF_YEAR);
				
				//	display the results...
				System.out.println("Number of days elapsed: " + daysSince + " days.");
			}
			else
			{
				//	this is within the same year...
				//	get the day of the year based on the date entered...
				int eDayOfYear = gcEY.get(gcEY.DAY_OF_YEAR);
				//	get the current day of the current year...
				int currentDayOfYear = Calendar.getInstance().get(Calendar.DAY_OF_YEAR);
				
				//	display the results...
				System.out.println("Days since : " + (currentDayOfYear - eDayOfYear));
			}
		}
		catch(Exception exc)
		{
			
		}
	}
}