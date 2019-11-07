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
		
		int upperCase = su.CountUpperCaseLetters(userEntry);
		System.out.print("This string has " + upperCase + " uppercase letters in it!");
		System.out.println();
		
		int lowerCase = su.CountLowerCaseLetters(userEntry);
		System.out.println("This string also has" + lowerCase + "lowercase letters in it!");  
		System.out.println();
		
		System.out.print("Your string reversed:  ");
		System.out.println(su.ReverseUserInput(userEntry));
		//System.out.println();
		
		
		int stringLength = su.GetLengthOfString(userEntry);
		System.out.println("The length of the string is " + stringLength + " characters.");
		
		keyboard.close();
	}
}
