/*
 * Q3PT.java
 * 
 * Java programming practical test
 * Topic: Arrays, intermediate algorithms, problem solving
 * 
 */
import java.util.*;

public class Q3PT
{	
	public static int max(int[] a)
	{
		int max = a[0];
		for(int i = 1; i < a.length; i++)
		{	int c = a[i];
			if(c > max)
			{	max = c;
			}
		}
		return max;
	}
	
	public static int min(int[] a)
	{
		int min = a[0];
		for(int i = 1; i < a.length; i++)
		{	int c = a[i];
			if(c < min)
			{	min = c;
			}
		}
		return min;
	}
	
	public static double average(int[] a)
	{
		double avg = 0;
		for(int i = 0; i < a.length; i++)
		{	avg = avg + a[i];
		}
		return avg/a.length;
	}
	
	public static int above(int[] a)
	{
		int above = 0;
		double avg = average(a);
		for(int i = 0; i < a.length; i++)
		{
			if(a[i] > avg)
			{	above++;
			}
		}
		return above;
	}
	
	public static int below(int[] a)
	{
		int below = 0;
		double avg = average(a);
		for(int i = 0; i < a.length; i++)
		{	
			if(a[i] < avg)
			{	below++;
			}
		}
		return below;
	}
	
	public static boolean isUnique(int[] a)
	{
		for(int i = 0; i < a.length; i++)
		{	for(int j = 1; j < a.length; j++)
			{	if(a[i] == a[j] && i != j)
				{	return false;
				}
			}
		}
		return true;
	}
	
	public static void printArray(int[] a)
	{
		for( int i = 0; i < a.length; i++ )
		{	System.out.print(a[i]);
			if(i < a.length - 1)
			{	System.out.print(", ");
			}
		}
		System.out.println();
	}
	
	public static void largest(int[] a, int howMany)
	{
		int large1 = max(a); // first maximum
		int large2;
		System.out.print(large1 + " ");
		for(int i = 0; i < howMany-1; i++)
		{	large2 = a[0];
			for(int j = 1; j < a.length; j++)
			{	if(a[j] > large2 && a[j] < large1)
				{	large2 = a[j];
				}
			}
			System.out.print(large2 + " ");
			large1 = large2;
		}
	}
	
	public static void smallest(int[] a, int howMany)
	{
		int small1 = min(a); // first minimum
		int small2;
		System.out.print(small1 + " ");
		for(int i = 0; i < howMany-1; i++)
		{	small2 = a[0];
			for(int j = 1; j < a.length; j++)
			{	if(a[j] < small2 && a[j] > small1)
				{	small2 = a[j];
				}
			}
			System.out.print(small2 + " ");
			small1 = small2;
		}
	}
	
	public static void main (String[] args)
	{	// DO NOT CHANGE THE LINE BELOW
		final int[] numbers = { 163, 491, 211, 5, 509, 17, 313, 197, 7, 31, 97, 4, 131, 223, 463, 331, 107, 59, 293, 337, 461, 191, 233, 277, 71, 109, 241, 61, 29, 503, 367, 449, 89, 431, 389, 139, 269, 263, 47, 349, 257, 67, 2, 11, 251, 227, 457, 193, 383, 359, 379, 83, 173, 409, 239, 151, 311, 13, 113, 443, 419, 281, 181, 487, 53, 103, 179, 43, 479, 149, 199, 19, 283, 307, 23, 439, 271, 373, 167, 73, 421, 101, 401, 37, 353, 521, 433, 41, 523, 499, 347, 127, 157, 3, 79, 467, 229, 397, 137, 317 };
		// DO NOT CHANGE THE LINE ABOVE
		System.out.println("Amount of numbers (100): "  + numbers.length);
		printArray(numbers);
		System.out.println( "Min     = " + min(numbers) );
		System.out.println( "Max     = " + max(numbers) );
		System.out.println( "Average = " + average(numbers) );
		System.out.println( "Above average = " + above(numbers) );
		System.out.println( "Below average = " + below(numbers) );
		System.out.println( "Array has only unique elements: " + isUnique(numbers) );
		Scanner in = new Scanner(System.in);
		System.out.print( "How many largest and smallest numbers to find (2~20)? " );
		int howMany = in.nextInt();
		while(howMany < 2 || howMany > 20)
		{	System.out.print( "Error-How many largest and smallest numbers to find (1~50)? " );
			howMany = in.nextInt();
		}
		largest(numbers, howMany);
		System.out.println();
		smallest(numbers, howMany);
	}
	
	
}

/*

name
Amount of numbers: 100
163, 491, 211, 5, 509, 17, 313, 197, 7, 31, 97, 4, 131, 223, 463, 331, 107, 59, 293, 337,
461, 191, 233, 277, 71, 109, 241, 61, 29, 503, 367, 449, 89, 431, 389, 139, 269, 263, 47,
349, 257, 67, 2, 11, 251, 227, 457, 193, 383, 359, 379, 83, 173, 409, 239, 151, 311, 13, 1
13, 443, 419, 281, 181, 487, 53, 103, 179, 43, 479, 149, 199, 19, 283, 307, 23, 439, 271,
373, 167, 73, 421, 101, 401, 37, 353, 521, 433, 41, 523, 499, 347, 127, 157, 3, 79, 467, 2
29, 397, 137, 317
Min     = 2
Max     = 523
Average = 235.96
Above average = 48
Below average = 52
Array has only unique elements: true
How many largest and smallest numbers to find (2~20)? 1
Error-How many largest and smallest numbers to find (1~50)? 21
Error-How many largest and smallest numbers to find (1~50)? 20
523 521 509 503 499 491 487 479 467 463 461 457 449 443 439 433 431 421 419 409
2 3 4 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67

*/
