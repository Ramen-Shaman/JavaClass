//	TECH 2251
//	Advanced Programming Technology
//	Fall 2019
//	The University of Memphis
//
//	Assignment:		Lecture 6 Example 3
//	Developer:		Todd S. Canaday
//	Version:		1.0
//	Compiler:		Java ver. 1.8.0_221
//	Date:			August 2, 2019
//
//	Program Description:
//	
//	Simple Java program demonstrating
//	the multi dimension array.

public class InitMultiDimArrayExample
{
	public static void main(String[] args)
	{
		//	declare and initialize a simple multi dimensional
		//	string array with 3 rows and 3 columns...
		//	[ ] [ ] [ ] 
		//	[ ] [ ] [ ] 
		//	[ ] [ ] [ ] 
		String[][] myStringArray = {
									  {"One","Two","Three"},
									  {"Four","Five","Six"},
									  {"Seven","Eight","Nine"}
								   };
		
		//	now let's display the results of the String
		//	array.  Again, the outer 'for' loop
		//	controls the "rows" and the inner 'for' loop
		//	controls the "columns"...
		System.out.println("Contents of the String array:");
		System.out.println();
		
		for(int c=0; c<myStringArray.length; c++)
		{
			for(int d=0; d<myStringArray[0].length; d++)
			{
				//	send to the console in a row / column
				//	format...
				System.out.print("[" + myStringArray[c][d] + "] ");
			}
			
			System.out.println();
		}
		
		//	add some space...
		System.out.println();
		
		//	let's print out the contants of the String
		//	array in reverse...
		System.out.println("Contents of the String array reversed:");
		System.out.println();
		
		for(int c=myStringArray.length-1; c>=0; c--)
		{
			for(int d=myStringArray[0].length-1; d>=0; d--)
			{
				//	send to the console in a row / column
				//	format...
				System.out.print("[" + myStringArray[c][d] + "] ");
			}
			
			System.out.println();
		}
	}
}