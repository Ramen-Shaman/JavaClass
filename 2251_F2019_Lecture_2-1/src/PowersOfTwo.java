//	TECH 2251
//	Advanced Programming Technology
//	Fall 2019
//	The University of Memphis
//
//	Assignment:		Lecture 2-2.3
//	Developer:		Todd S. Canaday
//	Version:		1.0
//	Compiler:		Java ver. 1.8.0_221
//	Date:			August 2, 2019
//
//	Program Description:
//
//	Using the bitwise shift left operator.

public class PowersOfTwo
{
	//	all executable Java programs MUST have a 
	//	'main()' function...
	public static void main(String[] args)
	{
		//	declare a variable and assign it the value of 1...
		int a = 1;
		
		//	describe the purpose of this program...
		System.out.println("Numbers 1 through 16 raised to the second power:");
		
		//	loop through 16 times, calculating the value to the
		//	second power each time...
		for(int b=0; b<16; b++)
		{
			//	print out the value of 'a' raised to the second power...
			System.out.print((a << b) + " ");
		}
	}
}
