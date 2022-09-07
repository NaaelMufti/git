/*
 * Q4TestAnswer.java
 * 
 */


public class PracticeTestQ4
{
	/* Note: lastIndex may be replaced by array.length, but in such case
	 * ===== you have to make sure you are not processing an array element that is NULL
	 */
	static int lastIndex = 0;
	
	public static void printArray(String[] a)
	{	//				   lastIndex		
		for(int i = 0; i < a.length; i++)
		{
			if(a[i] != null)
			{	System.out.print( a[i] + "  ");
			}
		}
		System.out.println();
	}
	
	public static String[] clone(String[] a)
	{	String[] b = new String[a.length];
		for(int i = 0; i < a.length; i++)
		{	b[i] = a[i];
		}
		return b;
	}
	
	public static boolean isFull(String[] a)
	{
		return lastIndex == a.length;
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
	
	public static void selectionSort(String[] a)
	{	// for each element in the array...
		for (int i = 0; i < a.length - 1; i++)
		{	int index = i;
			// compare it to the rest of the elements in the array
			for (int j = i + 1; j < a.length; j++)
			{	// find the index of the smallest/smaller element
				if (a[j].compareToIgnoreCase(a[index]) < 0 )
				{	index = j;
				}
			}
			// and swap it
            String smaller = a[index];
            a[index] = a[i];
            a[i] = smaller;
        }
	}
	
	
	public static int search(String[] a, String data)
	{	
		for(int i = 0; i < a.length; i++)
		{
			if( a[i] != null)
			{
				if( a[i].equals(data) )
				{	return i;
				}
			}
		}
		return -1;
	}
	
	public static void remove(String[] a, int indexToRemove)
	{
		if(indexToRemove < 0 || indexToRemove > lastIndex)
		{	System.out.println("Error-Index to remove is out of bounds");
			return;
		}
		for(int i = indexToRemove; i < lastIndex-1; i++)
		{
			a[i] = a[i+1];
		}
		lastIndex--;
		for(int i = lastIndex; i < a.length; i++)
		{	a[i] = null;
		}
	}
	
	public static boolean isSortedAsc(String[] a)
	{
		for(int i = 0; i < lastIndex-1; i++)
		{
			if(a[i] != null && a[i+1] != null)
			{
				if(a[i].compareTo(a[i+1]) > 0)
				{	return false;
				}
			}
		}
		return true;
	}

	public static boolean isSortedDesc(String[] a)
	{
		for(int i = 0; i < lastIndex-1; i++)
		{
			if(a[i] != null && a[i+1] != null)
			{
				if(a[i].compareTo(a[i+1]) < 0)
				{	return false;
				}
			}
		}
		return true;
	}
	
	public static int isSorted(String[] a)
	{
		if( isSortedAsc(a) )
		{	return 1;
		}
		if( isSortedDesc(a) )
		{	return -1;
		}
		return 0;
	}
	
	public static void removeDuplicates(String[] a)
	{
		if( isSorted(a) != 1 )
		{	System.out.println("Error-Array not sorted in ascending order");
			return;
		}
		for(int i = 0; i < lastIndex; i++)
		{
			for(int j = 0; j < lastIndex; j++)
			{
				if(i != j && a[i].equals(a[j]))
				{	System.out.println("Removed: " + a[j]);
					remove(a, j);
				}
			}
		}
	}
	/*
	//simple and efficient (single loop), but only good to remove 2 (duplicates)
	public static void removeDuplicates(String[] a)
	{
		if( isSorted(a) != 1 )
		{	System.out.println("Error-Array not sorted in ascending order");
			return;
		}
		for(int i = 0; i < lastIndex-1; i++)
		{
			if(a[i].equals(a[i+1]))
			{	remove(a, i+1);
			}
		}
	}
	*/
	
	public static void insert(String[] a, String data, int index)
	{	lastIndex++;
		for(int i = lastIndex-1; i > index; i--)
		{	a[i] = a[i-1];
		}
		a[index] = data;
	}
	
	public static void insert(String[] a, String element)
	{
		if(isFull(a))
		{	System.out.println("Array full.");
			return;
		}
		if(isSorted(a) != 1)
		{	System.out.println("Array NOT sorted in ascending order.");
			return;
		}
		if( search(a, element) != -1 )
		{	System.out.println(element + " is already in the array");
			return;
		}
		if(element.compareToIgnoreCase(a[0]) < 0)
		{	insert(a, element, 0);
			return;
		}
		if(element.compareToIgnoreCase(a[lastIndex-1]) > 0)
		{	a[lastIndex] = element;
			lastIndex++;
			return;
		}
		int i = 0;
		while( i < lastIndex-1 && a[i].compareToIgnoreCase(element) < 0 )
		{	i++;
		}
		insert(a, element, i);
		
	}
	
	public static void main (String[] args)
	{
		String[] original = { "Abe", "Bob", "Gale", "Ed", "Faye", "Ives", "Chuck", "Abe", "Gale", "Anne", "Gale" }; // added a 3rd Gale to test duplicate removal algos
		String[] ascending  = clone(original);
		String[] descending = clone(original);
		selectionSort(ascending);
		bubbleSort(descending);
		lastIndex = original.length;
		printArray(original);
		printArray(ascending);
		printArray(descending);
		lastIndex = original.length;
		System.out.println();
		System.out.println("Looking for Lester [-1]: " + search(ascending, "Lester"));
		System.out.println("Looking for anne   [-1]: " + search(ascending, "anne"));
		System.out.println("Looking for Anne   [2] : " + search(ascending, "Anne"));
		System.out.println("\noriginal array sorted [0]: " + isSorted(original));
		System.out.println("ascending array sorted [1]: " + isSorted(ascending));
		System.out.println("descending array sorted [-1]: " + isSorted(descending));
		System.out.println("\nRemoving first element from descending array");
		lastIndex = descending.length;
		remove(descending, 0);
		printArray(descending);
		lastIndex = ascending.length;
		System.out.println("\nRemoving Chuck [4] element from ascending array");
		remove(ascending, 4);
		System.out.println("\nRemoving duplicates from the ascending array");
		removeDuplicates(ascending);
		printArray(ascending);
		System.out.println("\nRemoving duplicates from the original array? ");
		removeDuplicates(original);
		System.out.println();
		System.out.println("Inserting Ivo into descending");
		insert(descending, "Ivo");
		System.out.println("Inserting Ives into ascending");
		insert(ascending, "Ives");
		System.out.println("\nInserting James into ascending");
		insert(ascending, "James");
		printArray(ascending);
		System.out.println("Inserting Aaron into ascending");
		insert(ascending, "Aaron");
		printArray(ascending);
		System.out.println("Inserting Ernesto into ascending");
		insert(ascending, "Ernesto");
		printArray(ascending);
	}
}

