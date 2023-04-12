/************************************
 *	IB COLLECTIONS DEMO
 *	Core CS Textbook Pages:
 * 		218, 258, 263
 *  Topics:	4.2.2, 4.3.12, 4.3.13
 ***********************************/
import java.util.*;

public class IBCollectionDemo
{
	
	public static void main (String[] args)
	{
		IBCollection<String> list = new IBCollection<>();
		list.addItem("Joe");
		list.addItem("Adam");
		list.addItem("James");
		list.addItem("Bob");
		System.out.println("Collections SL Demo");
		System.out.println(list + "\n");
		
		list.resetNext();
		int size = 0;
		
		while( list.hasNext() )
		{	System.out.println( list.getNext() );
			size++;
		}
		System.out.println(size);
		String[] names = new String[size];
		list.resetNext();
		for(int i = 0; i < size; i++)
		{	names[i] = list.getNext();
		}
		System.out.println("Collection to array");
		// don't use this shortcut in exams, use a loop to traverse
		// through the array. Useful to show you that the Arrays class
		// has a static toString method to print an array, though!
		System.out.println( Arrays.toString(names) );
	}
}

