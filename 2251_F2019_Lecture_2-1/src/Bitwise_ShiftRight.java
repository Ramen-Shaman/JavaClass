//	TECH 2251
//	Advanced Programming Technology
//	Fall 2019
//	The University of Memphis
//
//	Assignment:		Lecture 2-2.2
//	Developer:		Todd S. Canaday
//	Version:		1.0
//	Compiler:		Java ver. 1.8.0_221
//	Date:			August 2, 2019
//
//	Program Description:
//
//	Using the bitwise shift right operator.

public class Bitwise_ShiftRight
{
	//	all executable Java programs MUST have a 
	//	'main()' function...
	public static void main(String[] args)
	{
		//  division
		//	right shift by 1 ->  divide by 2
		//
		//		    Value 		After Right      Bit
		//			Of d		   Shift	  Pushed Out
		//		  ----------	-----------	  ----------
		//  d=0:  0000 0000		0000 0000 		  0			0 / 2 = 0
		//	d=1:  0000 0001		0000 0000 		  1			1 / 2 = 0
		//	d=2:  0000 0010		0000 0001 		  0			2 / 2 = 1
		//	d=3:  0000 0011		0000 0001 		  1			3 / 2 = 1
		//	d=4:  0000 0100		0000 0010 		  0			4 / 2 = 2
		//	d=5:  0000 0101		0000 0010 		  1			5 / 2 = 2
		//	d=6:  0000 0110		0000 0011 		  0			6 / 2 = 3
		//	d=7:  0000 0111		0000 0011 		  1			7 / 2 = 3
		System.out.println("Divide numbers 0 through 7 by 2:");
		
		for(int d=0; d<8; d++)
		{
			System.out.print((d >> 1) + " ");
		}
	}
}
