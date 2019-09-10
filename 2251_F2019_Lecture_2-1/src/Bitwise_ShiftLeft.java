//	TECH 2251
//	Advanced Programming Technology
//	Fall 2019
//	The University of Memphis
//
//	Assignment:		Lecture 2-2.1
//	Developer:		Todd S. Canaday
//	Version:		1.0
//	Compiler:		Java ver. 1.8.0_221
//	Date:			August 2, 2019
//
//	Program Description:
//
//	Using the bitwise shift left operator.

public class Bitwise_ShiftLeft
{
	//	all executable Java programs MUST have a 
	//	'main()' function...
	public static void main(String[] args)
	{
		//	declare a variable and assign it the value of 1...
		int a = 1;
		
		//	generate powers of 2...
		//
		//		  		Value Of a	After Left Shift
		//		  		----------	----------------
		//	a=1  b=0:  	0000 0001	0000 0001			2 ^ 0 = 1
		//	a=1  b=1:  	0000 0001	0000 0010			2 ^ 1 = 2
		//	a=1  b=2:  	0000 0001	0000 0100			2 ^ 2 = 4
		//	a=1  b=3:  	0000 0001	0000 1000			2 ^ 3 = 8
		//	a=1  b=4:  	0000 0001	0001 0000			2 ^ 4 = 16
		//	a=1  b=5:  	0000 0001	0010 0000			2 ^ 5 = 32
		//	a=1  b=6:  	0000 0001	0100 0000			2 ^ 6 = 64
		//	a=1  b=7:  	0000 0001	1000 0000			2 ^ 7 = 128
		System.out.println("Generate powers of 2:");
		
		for(int b=0; b<8; b++)
		{
			System.out.print((a << b) + " ");
		}

		System.out.println();
		System.out.println();
		
		//  multiplication
		//	left shift by 1 ->  multiply by 2
		//
		//		  Value Of c	After Left Shift
		//		  ----------	----------------
		//  c=0:  0000 0000		0000 0000			0 x 2 = 0
		//	c=1:  0000 0001		0000 0010			1 x 2 = 2
		//	c=2:  0000 0010		0000 0100			2 x 2 = 4
		//	c=3:  0000 0011		0000 0110			3 x 2 = 6
		//	c=4:  0000 0100		0000 1000			4 x 2 = 8
		//	c=5:  0000 0101		0000 1010			5 x 2 = 10
		//	c=6:  0000 0110		0000 1100			6 x 2 = 12
		//	c=7:  0000 0111		0000 1110			7 x 2 = 14
		System.out.println("Multiply numbers 0 through 7 by 2:");
		
		for(int c=0; c<8; c++)
		{
			System.out.print((c << 1) + " ");
		}
	}
}
