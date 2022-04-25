/* Sorting algorithms assignment
 * 
 * Student Name: 
 * 
 * 
 * Please read https://en.wikipedia.org/wiki/Insertion_sort
 */
public class SortingSkeleton
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
	{
		// your code goes here - sort the array a using bubble sort
	}

	public static void selection(int[] a)
	{
		// your code goes here - sort the array a using selection sort
	}

	// https://youtu.be/JU767SDMDvA
	public static void simpleInsertion(int[] a)
	{
		for(int i = 1; i < a.length; i++) // traverse the array
		{
			int j = i; // j=temporary index to sort items; starts from 2nd element in the array; you may say this is the index of the key or element being compared
			while(j > 0 && a[j-1] > a[j]) // stop at j=1 ...
			{	// ... comparing key to the element to its left
				// if they are out of order, swap them until they are
				int temp = a[j];
				a[j] = a[j-1];
				a[j-1] = temp;
				j--;
				System.out.print(">>> ");
				printArray(a);
			}
		}
	}

	// https://youtu.be/OGzPmgsI-pQ
	public static void insertion(int[] a)
	{
		for (int i = 1; i < a.length; i++)
		{	int key = a[i]; // element being compared
			int j = i - 1;  // index of element before the key
			/* Move elements of array to make room to insert 
			they key in its right place */
			while (j >= 0 && a[j] > key)
			{	a[j + 1] = a[j]; 
				j = j - 1;
				System.out.print(">> "); printArray(a);
			} 
			a[j + 1] = key; // place the key in the right place
			printArray(a); System.out.println();
		} 
	}

	// No need to modify the main method.
	public static void main(String[] args)
	{
		int[] original = { 7,9,6,8,1,3,5,2,4 };
		int[] array = clone(original);
		System.out.println("Original array");
		printArray(original);

		System.out.println("\nBubble sort");
		bubble( array );
		printArray(array);
		System.out.println();

		System.out.println("\nSelection sort");
		array = clone(original);
		selection( array );
		printArray(array);

		System.out.println("\nSimple Insertion sort");
		array = clone(original);
		simpleInsertion( array );
		printArray(array);

		System.out.println("\nInsertion sort");
		array = clone(original);
		insertion( array );
		printArray(array);

	}
}
