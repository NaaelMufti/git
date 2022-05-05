/* 
 * Searching and Sorting algorithms 
 * Quarter 4 test
 * Tomorrow we take over Google
 * 
 */

public class Q4Test
{
	public static void printArray(String[] array)
	{
		System.out.print(array[0]);
		
		for(int i = 1; i < array.length; i++)
		{
			System.out.print( ", " + array[i]);
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

	
	public static void bubble(String[] a)
	{	int i = a.length-1; // index of last element in array
		boolean swapped = true; // flag to indicate when a swap is made
		while(swapped==true && i >= 1)// while a swap happens and...
		{	// ..there are elements to compare
			swapped = false; // assume no swaps are needed before
			for(int j = 0; j < i; j++) // each pass
			{	// start from first element until the last unsorted one
				if( a[j].compareTo(a[j+1]) > 0) // if adjacent elements are
				{	String temp = a[j];// not in order,
					a[j] = a[j+1];  // swap them; use < for descending; > for ascending
					a[j+1] = temp;  // signal that we made a swap
					swapped = true; // so we do another pass
				} // if no swap is made in a pass, we are done sorting!
			} // end for (pass)
			i--; // the last i-th item in the array is in its place
		} //while// by the end of the pass, so we skip it
	}
	
	public static void selection(String[] a)
	{
		for ( int j=0; j < a.length-1; j++ )
		{
		// Find min: the index of the string reference that should go into cell j.
		// Look through the unsorted strings (those at j or higher) for the one that is first in lexicographic order
			int min = j;
			for ( int k=j+1; k < a.length; k++ )
			{
				if ( a[k].compareTo( a[min] ) > 0 ) 
				{ 
				min = k;
				}
			}
			
			String temp = a[j];
			a[j] = a[min];
			a[min] = temp;
		}
	}
	
	public static int linearSearch(String[] array, String key)
	{
		int location = -1;
		// your code goes here
		return location;
	}

	public static int binarySearch(String[] array, String key)
	{
		int location = -1;	// not found
		// your code goes here
		return location;
	}

	public static boolean isSortedAsc(String[] array)
	{
		// your code goes here, you may want/need to modify the line below, too
		return true;
	}
	
	public static boolean isSortedDesc(String[] array)
	{
		// your code goes here, you may want/need to modify the line below, too
		return true;
	}

	public static String sortedMode(String[] array)
	{
		String bSorted = "unsorted";
		// your code goes here
		return bSorted;
	}
	
	public static void main(String[] args)
	{
		System.out.println("Naael Mufti");
		
		// DO NOT MODIFY THE CODE BELOW THIS COMMENT!!! ////// POLICE LINE DO NOT CROSS //////////////////////////////////////////////////////////////////////
		String[] original = { "dulcie","ernest","vasilis","juanita","saraann","torin","mathian","stanly","georgetta","dalis","taddeo","haroun","clyde","wake","hilary","mallory","prinz","carolin","barton","garnette","hanson","reina","bernice","carmela","drusie","ermentrude","abbey","lene","casey","kahaleel","glennie","kim","afton","wenda","prince","maddalena","nickey","elijah","ashlin","dex","morrie","alvin","jammal","andrej","liza","benedikt","hillard","manon","robby","cari","jilly","carlyn","isa","reg","lincoln","basilio","avivah","jamie","chandal","bourke","heloise","midge","fernandina","gasper","sterling","jemmy","rosco","ardella","curcio","kitti","jamey","alejandrina","kimmie","hervey","hurley","joice","gisele","isac","armin","drusie","edyth","carlie","con","neddie","augustine","loraine","sloan","tilda","meggy","walther","averyl","marshall","meridel","tanny","merry","sibilla","carin","linnie","edy","clayson","zelig","imogene","amandie" };
		String[] b = clone(original);
		String[] s = clone(original);
		System.out.println( "The orginal array is " + sortedMode(original) );
		
		System.out.println("\nBubble sort on array b");
		bubble( b );
		System.out.println( "Array b is sorted in " + sortedMode(b) + " order." );
		
		
		System.out.println("\nSelection sort on array s");
		s = clone(original);
		selection( s );
		System.out.println( "Array s is sorted in " + sortedMode(s) + " order."  );

		System.out.print("\nSearching algorithms\n> Strings to search for: ");
		String[] searches = { "kaori", "benedikt", "dulcie", "amandie", "kitti" };
		int[] locationsL = { -1,45,0,102,69 };
		int[] locationsB = { -1,14,33,4,65 };
		printArray(searches);
		System.out.println();

		for(int i = 0; i < searches.length; i++)
		{
			int linear = linearSearch(original, searches[i]);
			System.out.printf("Linear search for %s (%d): %d\n", searches[i], locationsL[i], linear);
			int binary = binarySearch(b, searches[i]);
			System.out.printf("Binary search for %s (%d): %d\n", searches[i], locationsB[i], binary);
		}
		System.out.println( "\nbinarySearch(original, \"chandal\") [-2 or 24] = " + binarySearch(s, "chandal") );
	}
	
}
