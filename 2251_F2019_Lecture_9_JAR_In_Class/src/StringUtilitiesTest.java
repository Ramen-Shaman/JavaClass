import java.util.Scanner;

import org.uofm.tools.StringUtilities;

public class StringUtilitiesTest
{
	public static void main(String[] args)
	{
		StringUtilities su = new StringUtilities();
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Please enter a string:  ");
		String userEntry = keyboard.nextLine();
		System.out.println();
		System.out.println("You entered:  " + userEntry);
		System.out.println();
		
		System.out.print("Your string reversed:  ");
		System.out.println(su.ReverseUserInput(userEntry));
		//System.out.println();
		
		int whiteSpace = su.CountWhiteSpaceInString(userEntry);
		System.out.println("There are " + whiteSpace + " whitespace characters in the string.");
		//System.out.println();
		
		int stringLength = su.GetLengthOfString(userEntry);
		System.out.println("The length of the string is " + stringLength + " characters.");
	}
}
