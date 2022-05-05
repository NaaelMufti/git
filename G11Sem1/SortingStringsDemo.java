
public class SortingStringsDemo 
{
	
	public static void main (String[] args) 
	{
		String[] original = { "Abe", "Bob", "Gale", "Ed", "Faye", "Ives", "Chuck", "Abe", "Gale", "Anne", "Gale" };
		printArray(original);
		String[] second = clone(original);
		printArray(second);
		
		bubbleSort(second);
		printArray(second);
		
		int location = linearSearch(original, "Bob");
		System.out.println(location);
		
		selectionSort(original);
		printArray(original);
		
		String key = "Ed";
		int loc = linearSearch(original, key);
		System.out.println(loc);
	}
	
	public static void printArray(String[] array)
	{
		for( String e: array )
		{	System.out.print( e + " " );
		}
		System.out.println();
	}
	
	public static String[] clone(String[] array) // returns a copy of array
	{
		if(array.length == 0) return null;
		String[] copy = new String[array.length];
		for(int i = 0; i < array.length; i++)
		{
			copy[i] = array[i];
		}
		return copy;
	}
	
	public static void bubbleSort(String[] a)
	{	int i = a.length-1; // index of last element in array
		boolean swapped = true; // flag to indicate when a swap is made
		while(swapped==true && i >= 1)// while a swap happens and...
		{	// ..there are elements to compare
			swapped = false; // assume no swaps are needed before
			for(int j = 0; j < i; j++) // each pass
			{	// start from first element until the last unsorted one
				if( a[j].compareTo(a[j+1]) < 0) // if adjacent elements are
				{	String temp = a[j];// not in order,
					a[j] = a[j+1];  // swap them; use < for descending; > for ascending
					a[j+1] = temp;  // signal that we made a swap
					swapped = true; // so we do another pass
				} // if no swap is made in a pass, we are done sorting!
			} // end for (pass)
			i--; // the last i-th item in the array is in its place
		} //while// by the end of the pass, so we skip it
	}
	
	/*
	public static void bubble(String[] a)
	{	int c = 0;
		for(int i = 0; i < a.length; i++)
		{	for(int j = 0; j < a.length - 1; j++)
			{	// if=comparisons
				c++;
				if(a[j] > a[j+1])
				{	// swap elements not in order (ascending)
					String temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					//System.out.print("\t>>> ");	printArray(a); // shows swaps in array
				}
			}
			//System.out.print("\t>>> "); printArray(a); // shows swaps in array
		}
		//System.out.println("Comparisons: " + c);
	}
	*/
	
	public static int linearSearch(String[] array, String key)
	{	
		int c = 0;
		int loc = -1;	// not found
		for(int i = 0; i < array.length; i++)
		{
			c++;
			if(key == array[i])
			{
				loc = i;
				break;
			}
		}
		return loc; // returns index, if position to location + 1
	}
	/*
	public static void selection(String[] a)
	{
		String min, temp;
		//int c = 0;
		for ( int j = 0; j < a.length - 1; j++ )
		{
			min = j;   // initialize index of element to sort
			for(int i = j + 1; i < a.length; i ++)   // locate smallest element in unsorted part of the array
			{
				//c++;
				if( a[i].compareTo(a[min]) < 0 )
				{	min = i;
				}
			}
			temp = a[ min ];   //swap smallest found with element in position i
			a[ min ] = a[ j ];
			a[ j ] = temp;
			// System.out.print("\t>>> "); printArray(a);
		}
		// System.out.println("Comparisons: " + c); 
	}
	*/
	
	public static void selectionSort( String[] array )
	{
    
		// Find the string reference that should go in each cell of
		// the array, from cell 0 to the end
		for ( int j=0; j < array.length-1; j++ )
		{
		// Find min: the index of the string reference that should go into cell j.
		// Look through the unsorted strings (those at j or higher) for the one that is first in lexicographic order
			int min = j;
			for ( int k=j+1; k < array.length; k++ )
			{
				if ( array[k].compareTo( array[min] ) < 0 ) 
				{ 
				min = k;
				}
			}
			
			String temp = array[j];
			array[j] = array[min];
			array[min] = temp;
		}
	}
	
	public static int binarySearch(String[] array, String key)
	{
		//int c = 0;
		int location = -1;	// not found
		int lower = 0;		// index of lowest element to check
		int upper = array.length - 1; // index of last element to check
		// System.out.println("\tlower index: " + lower + " upper index: " + upper + " midpoint: "+ (lower+upper)/2 );
		while( lower <= upper )
		{	//c++;
			int mid = (lower + upper) / 2;
			if( array[mid] == key )
			{	location = mid;
				break; // key found, exit while loop/stop searching
			} else if( key.compareTo(array[mid]) < 0)
			{	upper = mid - 1;
			} else if( key.compareTo(array[mid]) > 0) // this could also be a plain else
			{	lower = mid + 1;
			}
			// System.out.println("\tl: " + lower + " u: " + upper + " m: "+ mid);
		}
		//System.out.println("Comparisons: " + c);
		return location;
	}
}

