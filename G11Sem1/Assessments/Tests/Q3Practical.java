/*
 * Q3Practical.java
 * 
 * Java programming practical test
 * Topic: Arrays, algorithms, problem solving
 * 
 * Test:
 * Don't need to know add, remove algorithms
 * compare to/equals
 * sortings
 * modifying searching algorithms (understand each part)
 * s1.compareTo(s2) > 0 = s1 > s2
 * s1.compareTo(s2) < 0 = s1 < s2
 * s1.compareTo(s2) = 0 = s1 == s2
 * 
 * Exam Topics:
 * 
 * Disadvantages and advantages of binary search (that it can only be done with sorted)
 * trace stacks, feel like recursion but not
 * as many questions abt tracing as he could
 * alrdy table headings given
 * no 2D arrays, put all abstract data types
 * HL -linked list, add and pop something out of linked lists
 * HL - LL is about LL and array interacting, do not have size or length
 * array not known length
 * made up mostly of IB past paper questions
 * adv disadv queue vs stack 
 * bubble sort and binary search, one trace and one code
 * swap a[i], a[i+1]; (pseudo code)
 * CHAPTER 4 (STRESS)
 * FLOW CHART TRACING	
 * how OS provides security (username security encription)
 * up to 2.1.8
 * situational questions not definitons 
 * advantages and disadvantages of things
 * very little about how cpu works
 * much more on OS
 * wireless networking lots
 * vpn lots
 * things around them (eg connecting to vpn using WAN)
 * tracing algorithms
 * no question on comparing packet switching and circuit switching
 * no 4.1? (not sure if right)
 * flow chart for us to trace (should be familiar with the algorithm so don't overthink)
 * write more algorithms then before (java or pseudocode)
 * HL - diagrams, bring small ruler (have to draw also)
 * HL - stacks are used to store function calls, not assessed on recursion but similar cuz of stacks
 * HL - whats the use of a stack/queue or why use stack instead of queue
 * OSI model (pneumonic: something about singapore passports)
 * ask a question where you will need to know what a router is and what function it can provide
 * why would you choose a router as oppose to a switch when setting up network
 * dont talk about just wireless routers
 * nothing about VLANS but VPN like crazy
 * nothing about the TCP/IP model
 * just know TCP and IP being other protocols
 * asking between 2 algorithms and which is more efficient (count number of cycles?)
 * networking with the OSI model as a reference
 * when tracing bubble sort, each step is one whole parce not just one swap
 * 
 */
import java.util.*;

public class Q3Practical
{	
	public static int max(int[] a)
	{
		// REPLACE THE LINE BELOW WITH YOUR CODE
		int max = a[0];
		// Maximum: the code for your method (function) goes here
		for(int i = 0; i < a.length; i++)
		{
			if (a[i] > max)
			{
				max = a[i];
			}
		}
		return max;
	}
	
	public static int min(int[] a)
	{
		int min = a[0];
		// Minimum: the code for your method (function) goes here
		for(int i = 0; i < a.length; i++)
		{
			if (a[i] < min)
			{
				min = a[i];
			}
		}
		return min;
	}
	
	public static double average(int[] a)
	{
		// REPLACE THE LINE BELOW WITH YOUR CODE
		double average = 0.0;
		// Average: the code for your method (function) goes here
		for (int i = 0; i < a.length; i++)
		{
			average = average + a[i];
		}
		return average/a.length;
	}
	
	public static int above(int[] a)
	{
		// REPLACE THE LINE BELOW WITH YOUR CODE
		int counter = 0;
		int temp = 0;
		double avg = 0.0;
	
		for (int i = 0; i < a.length; i++)
		{
			avg = avg + a[i];
		}
		avg = avg/a.length;
		
		for (int i = 0; i < a.length; i++)
		{
			temp = a[i];
			if (temp > avg)
			{
				counter = counter + 1;
			}
		}
		return counter;
		
	}
	
	public static int below(int[] a)
	{
		// REPLACE THE LINE BELOW WITH YOUR CODE
		int counter = 0;
		int temp = 0;
		double avg = 0.0;
	
		for (int i = 0; i < a.length; i++)
		{
			avg = avg + a[i];
		}
		avg = avg/a.length;
		
		for (int i = 0; i < a.length; i++)
		{
			temp = a[i];
			if (temp < avg)
			{
				counter = counter + 1;
			}
		}
		return counter;
	}
	
	public static boolean isUnique(int[] a)
	{
		// REPLACE THE LINE BELOW WITH YOUR CODE
		
		for (int i = 0; i < a.length; i++)
		{
			for(int j = 0; j < a.length; j++)
			{
				if(a[i] == a[j])
				{
					return true;
				}
			}
		}
		return false;
	}
	
	public static void printArray(int[] a)
	{
		// YOUR CODE GOES HERE
		for(int i = 0; i < a.length; i++)
		{
			if( i > 0)
			{
				System.out.print(", ");
			}
			System.out.print(a[i]);
		}
	}
	
	public static void largest(int[] a, int howMany)
	{
		// YOUR CODE GOES HERE
		
		int largest = a[0];
		int temp = a[0];
		// Maximum: the code for your method (function) goes here
		for(int i = 0; i < a.length; i++)
		{
			if (a[i] > temp)
			{
				temp = a[i];
			}
		}
		// making new variable, where temp is maximum
		System.out.println(temp);
		
		int max = a[0];
		for (int j = 1; j < howMany; j++)
		{
			for (int i = 0; i < a.length; i++)
			{
				if (a[i] == temp)
				{
					break;
				}
				else
				{
					if(a[i] > largest)
					{
						largest = a[i];
					}	
				}
			}
			temp = largest;
			System.out.println(largest);
		}
		
	}
	
	public static void smallest(int[] a, int howMany)
	{
		// YOUR CODE GOES HERE
		int smallest = a[0];
		int temp = a[0];
		// Maximum: the code for your method (function) goes here
		for(int i = 0; i < a.length; i++)
		{
			if (a[i] > temp)
			{
				temp = a[i];
			}
		}
		// making new variable, where temp is maximum
		System.out.println(temp);
		
		int max = a[0];
		for (int j = 1; j < howMany; j++)
		{
			for (int i = 0; i < a.length; i++)
			{
				if (a[i] == temp)
				{
					break;
				}
				else
				{
					if(a[i] < smallest)
					{
						smallest = a[i];
					}	
				}
			}
			temp = smallest;
			System.out.println(smallest);
		}
	}	
	
	
	public static void main (String[] args)
	{	// DO NOT CHANGE THE LINE BELOW v
		final int[] numbers = { 163, 491, 211, 5, 509, 17, 313, 197, 7, 31, 97, 4, 131, 223, 463, 331, 107, 59, 293, 337, 461, 191, 233, 277, 71, 109, 241, 61, 29, 503, 367, 449, 89, 431, 389, 139, 269, 263, 47, 349, 257, 67, 2, 11, 251, 227, 457, 193, 383, 359, 379, 83, 173, 409, 239, 151, 311, 13, 113, 443, 419, 281, 181, 487, 53, 103, 179, 43, 479, 149, 199, 19, 283, 307, 23, 439, 271, 373, 167, 73, 421, 101, 401, 37, 353, 521, 433, 41, 523, 499, 347, 127, 157, 3, 79, 467, 229, 397, 137, 317 };
		// DO NOT CHANGE THE LINE ABOVE ^
		
		// OUTPUT YOUR NAME HERE
		System.out.println("Naael Mufti " + numbers.length);
		System.out.print("Amount of numbers (100): ");
		// OUTPUT THE AMOUNT OF NUMBERS IN THE ARRAY HERE -- DON'T JUST output(100)
		
		System.out.println();
		printArray(numbers);
		System.out.println();
		System.out.println( "Min            (2) = " + min(numbers) );
		System.out.println( "Max          (523) = " + max(numbers) );
		System.out.println( "Average   (235.96) = " + average(numbers) );
		System.out.println( "Above average (48) = " + above(numbers));
		System.out.println( "Below average (52) = " + below(numbers) );
		System.out.println( "Array has only unique elements (true): " + isUnique(numbers) );
		System.out.println();
		System.out.print( "How many largest and smallest numbers to find (2~20)? " );
		
		// INPUT HOWMANY BELOW, AND VALIDATE THE INPUT PROPERLY
		int howMany = inputInt("How many largest and smallest numbers to find in the array: ");
		while (howMany > 20 || howMany < 1)
		{
			howMany = inputInt("Error- enter a number between 1 and 20: ");
		}
		
		
		largest(numbers, howMany);
		System.out.println();
		smallest(numbers, howMany);
		// the end.
	}
	
	/*****************************************************************************
	 * ALL IBIO methods are below, you may use them if you want.				 *
	 * Because they are already inside our clas, there is no need to prefix IBIO.*
	 * before the name of the method.											 *
	 ****************************************************************************/
	 
	static void output (String info)
	{	System.out.println(info);	}
	
	static void out (String info)
	{	System.out.print(info);	}
	
	static void output (char info)
	{	System.out.println(info);	}
	
	static void out (char info)
	{	System.out.print(info);	}
	
	static void output (byte info)
	{	System.out.println(info);	}
	
	static void output (int info)
	{	System.out.println(info);	}
	
	static void out (int info)
	{	System.out.print(info);	}
	
	static void output (long info)
	{	System.out.println(info);	}
	
	static void out (long info)
	{	System.out.print(info);	}
	
	static void output (double info)
	{	System.out.println(info);	}
	
	static void output (boolean info)
	{	System.out.println(info);	}
	
	static String input(String prompt)
	{	String	inputLine = "";
		System.out.print(prompt);
		try
		{	inputLine = (new java.io.BufferedReader(
							new java.io.InputStreamReader(System.in))).readLine();}
		catch (Exception e)
		{	String	err = e.toString();
			System.out.println(err);
			inputLine = "";
		}
		return	inputLine;
	}
		
	static String inputString(String prompt)
	{	return	input(prompt);	}

	static String input()
	{	return	input("");	}


	static char inputChar(String prompt)
	{	char	result = (char) 0;
		try
		{	result = input(prompt).charAt(0);}
		catch (Exception e)	{	result = (char) 0;}
		return	result;
	}

	static byte inputByte(String prompt)
	{	byte	result = 0;
		try
		{	result = Byte.valueOf(input(prompt).trim()).byteValue() ;	}
		catch (Exception e)	{	result = 0;}
		return	result;
	}

	static byte inputByte()
	{	return	inputByte("");	}

	static int inputInt(String prompt)
	{	int	result = 0;
		try
		{	result = Integer.valueOf(input(prompt).trim()).intValue() ;	}
		catch (Exception e)	{	System.out.println(">>> error in input"); result = 0;}
		return	result;
	}

	static int inputInt()
	{	return	inputInt("");
	}
	
	static long inputLong(String prompt)
	{	long	result = 0;
		try
		{	result = Long.valueOf(input(prompt).trim()).longValue() ;	}
		catch (Exception e)	{	result = 0;}
		return	result;
	}

	static long inputLong()
	{	return	inputLong("");	}
	
	static double inputDouble(String prompt)
	{	double	result = 0;
		try
		{	result = Double.valueOf(input(prompt).trim()).doubleValue() ;	}
		catch (Exception e)	{	result = 0;}
		return	result;
	}

	static double inputDouble()
	{	return	inputDouble("");	}
	
	static boolean inputBoolean(String prompt)
	{	boolean	result = false;
		try
		{	result = Boolean.valueOf(input(prompt).trim()).booleanValue() ;	}
		catch (Exception e)	{	result = false;}
		return	result;
	}

	static boolean inputBoolean()
	{	return	inputBoolean("");
	}
	
}

