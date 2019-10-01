//	TECH 2251
//	Advanced Programming Technology
//	Fall 2019
//	The University of Memphis
//
//	Assignment:		Lecture 6 Example 4
//	Developer:		Todd S. Canaday
//	Version:		1.0
//	Compiler:		Java ver. 1.8.0_221
//	Date:			August 2, 2019
//
//	Program Description:
//	
//	Simple Java program demonstrating
//	the multi dimension array.

public class MultiDimensionArrayExample
{
	public static void main(String[] args)
	{
		//	declare a multi dimensioned array with
		//	5 "rows" and 3 "columns"...
		//	imagine the output will look like this:
		//	[ ] [ ] [ ] 
		//	[ ] [ ] [ ] 
		//	[ ] [ ] [ ] 
		//	[ ] [ ] [ ] 
		//	[ ] [ ] [ ]
		int[][] myMultiDimArray = new int[5][3];
		
		//	now, we are going to populate this array
		//	with some data - just for the sake of simplicity
		//	we'll input the sum of 'a' and 'b'.  Notice the use
		//	of two 'for' loops - one for the "rows" (the outer
		//	loop) and one for the "columns" (the inner loop)...
		for(int a=0; a<myMultiDimArray.length; a++)
		{
			for(int b=0; b<myMultiDimArray[0].length; b++)
			{
				//	input the sum of 'a' and 'b'...
				myMultiDimArray[a][b] = a+b;
			}
		}
		
		//	once we have populated the array, we should display
		//	the results so that we can put our visualization
		//	techniques to use.  Again, the outer 'for' loop
		//	controls the "rows" and the inner 'for' loop
		//	controls the "columns"...
		System.out.println("Contents of the int array:");
		System.out.println();
		
		for(int c=0; c<myMultiDimArray.length; c++)
		{
			for(int d=0; d<myMultiDimArray[0].length; d++)
			{
				//	send to the console in a row / column
				//	format...
				System.out.print("[" + myMultiDimArray[c][d] + "] ");
			}
			
			System.out.println();
		}
	}
}
