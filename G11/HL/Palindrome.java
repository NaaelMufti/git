
/*
 * Palindrome.java
 * Write a recursive method to check whether a char array
 * is a palindrome or not. (Return true or false)
 */
import java.util.*;

public class Palindrome
{
	public static boolean isPalindrome(char[] array, int startIndex, int endIndex)
	{
		// Have we reached the middle of the array? If yes, it's a palindrome
		// if the extremes are the same, keep checking!
		if(endIndex - startIndex < 1) // if 6 letters, char3-char2, if 5 letters, char 2-char2
		{ //not <= 1 cuz then it doesn't check middle pair if even length 
			return true;
		} else if(array[startIndex] == array[endIndex]) //this is the actual check
		{
			return isPalindrome(array, startIndex + 1, endIndex - 1);
		}
		return false; // it's not a palindrome if this statement is reached.
	}
	
	public static void main (String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter text/number: ");
		String input = in.nextLine();
		char[] check = input.toCharArray();
		boolean isPalindrome = isPalindrome(check, 0, check.length-1);
		System.out.print( input + " is " );
		if( !isPalindrome )
		{	System.out.print("not ");
		}
		System.out.println("a palindrome.");
	}
}

