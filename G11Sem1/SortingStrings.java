/* Sorting algorithms 
 * 
 * Please read sorting_algos_SL.pdf and convert the pseudocode algorithms
 * into Java methods
 * 
 * Also check https://visualgo.net/en/sorting 
 */
import java.util.Scanner;

public class SortingStrings
{
	public static void printArray(int[] array)
	{
		for( int e: array )
		{	System.out.print( e + " " );
		}
		System.out.println();
	}
	
	public static int[] clone(int[] array) // returns a copy of array
	{
		if(array.length == 0) return null;
		int[] copy = new int[array.length];
		for(int i = 0; i < array.length; i++)
		{
			copy[i] = array[i];
		}
		return copy;
	}

	static void bubble(int[] a)
	{	int c = 0;
		for(int i = 0; i < a.length; i++)
		{	for(int j = 0; j < a.length - 1; j++)
			{	// if=comparisons
				c++;
				if(a[j] > a[j+1])
				{	// swap elements not in order (ascending)
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					System.out.print("\t>>> ");	printArray(a); // shows swaps in array
				}
			}
			System.out.print("\t>>> "); printArray(a); // shows swaps in array
		}
		System.out.println("Comparisons: " + c);
	}
	
	static void betterBubble(int[] a)
	{	int c = 0;
		for(int i = 0; i < a.length; i++)
		{	// avoid checking sorted end of the array
			for(int j = 0; j < a.length - i - 1; j++)
			{	c++;
				if(a[j] > a[j+1])
				{	int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					System.out.print("\t>>> "); printArray(a);
				}
			}
			
		}
		System.out.println("Comparisons: " + c);
	}
	
	static void bestBubble(int[] a)
	{	int c = 0;
		boolean swapped = true;
		for(int i = 0; i < a.length && swapped; i++)
		{	swapped = false;
			// avoid checking sorted end of the array
			for(int j = 0; j < a.length - i - 1; j++)
			{	c++;
				if(a[j] > a[j+1])
				{	int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					swapped = true;
					System.out.print("\t>>> "); printArray(a);
				}
			}
		}
		System.out.println("Comparisons: " + c);
	}

	// https://www.tutorialspoint.com/data_structures_algorithms/selection_sort_algorithm.htm
	public static void selection(int[] a)
	{
		int min, temp;
		int c = 0;
		for ( int i = 0; i < a.length - 1; i++ )
		{
			min = i;   // initialize index of element to sort
			for(int j = i + 1; j < a.length; j ++)   // locate smallest element in unsorted part of the array
			{
				c++;
				if( a[ j ] < a[ min ] )
				{	min = j;
				}
			}
			temp = a[ min ];   //swap smallest found with element in position i
			a[ min ] = a[ i ];
			a[ i ] = temp;
			System.out.print("\t>>> "); printArray(a);
		}
		System.out.println("Comparisons: " + c);
	}

	// a couple of ways to visualise the insertion sort:
	// https://youtu.be/OGzPmgsI-pQ
	// https://youtu.be/JU767SDMDvA
	public static void insertionSort(int[] array)
	{	int c = 0;
		int len = array.length;
		for(int i = 1; i < array.length; i++)
		{
			int temp = array[i];
			int j = i-1;
			while(j >= 0 && array[j] > temp)
			{	c++;
				array[j+1] = array[j];
				j--;
			}
			array[j+1] = temp;
			System.out.print("\t>>> ");	printArray(array);
		}
		System.out.println("Comparisons: " + c);
	}
	
	public static int linearSearch(int[] array, int key)
	{	int c = 0;
		int location = -1;	// not found
		for(int i = 0; i < array.length; i++)
		{
			c++;
			if(key == array[i])
			{
				location = i;
				break;
			}
		}
		System.out.println("Comparisons: " + c);
		return location;
	}

	// https://www.tutorialspoint.com/data_structures_algorithms/binary_search_algorithm.htm
	public static int binarySearch(int[] array, int key)
	{
		int c = 0;
		int location = -1;	// not found
		int lower = 0;		// index of lowest element to check
		int upper = array.length - 1; // index of last element to check
		System.out.println("\tlower index: " + lower + " upper index: " + upper + " midpoint: "+ (lower+upper)/2 );
		while( lower <= upper )
		{	c++;
			int mid = (lower + upper) / 2;
			if( array[mid] == key )
			{	location = mid;
				break; // key found, exit while loop/stop searching
			} else if( key < array[mid] )
			{	upper = mid - 1;
			} else if( key > array[mid] ) // this could also be a plain else
			{	lower = mid + 1;
			}
			System.out.println("\tl: " + lower + " u: " + upper + " m: "+ mid);
		}
		System.out.println("Comparisons: " + c);
		return location;
	}

	// No need to modify the main method.
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		String[] original = { kevin, john, bill, jack, sharma, mufti, kabir};
		String[] array = clone(original);
		System.out.println("Original array");
		printArray(original);

		System.out.println("\nBubble sort");
		bubble( array );
		printArray(array);
		System.out.println();
		
		System.out.println("\nOptimised Bubble sort");
		array = clone(original); // reset array to original positions to test next sorting algo.
		betterBubble( array );
		printArray(array);
		System.out.println();
		
		System.out.println("\nEarly exit optimised Bubble sort"); 
		array = clone(original);
		bestBubble( array );
		printArray(array);
		System.out.println();

		System.out.println("\nSelection sort");
		array = clone(original);
		selection( array );
		printArray(array);

		System.out.println("\nInsertion sort");
		insertionSort( array );
		printArray(array);

		System.out.print("\nSearching algorithms\nEnter element to search for: ");
		int key = input.nextString();
		System.out.println("\nLinear search");
		int location = linearSearch(array, key);
		if(location == -1)
		{
			System.out.println(key + " not found.");
		} else {
			System.out.println(key + " found @ index " + location);
		}
		
		System.out.println("\nBinary search");
		int index = binarySearch(array, key);
		if(index == -1)
		{
			System.out.println(key + " not found.");
		} else {
			System.out.println(key + " found @ index " + index);
		}
	}
}
