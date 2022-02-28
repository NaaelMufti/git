/*
 * ArrayDemo.java
 * Array of Strings
 */


public class DemoArrayStrings 
{
	
	public static void listArray(String[] a)
	{
		for(int index = 0; index < a.length; index++)
		{
			if(a[index] != null)
			{
			System.out.println(index + " : " + a[index]);
			}
		}
	}
	
	public static void printArray(String[] a)
	{
		for(int index = 0; index < a.length; index++)
		{
			if(a[index] != null)
			{
				System.out.print( a[index] );
				if( index < a.length-1 )
				{	 System.out.print(", ");
				}
			}
		}
		System.out.println();
	}
	
	public static boolean checkEqual(String[] a, String[] b)
	{
		if(a.length != b.length)
		{
			return false;
		}
		
		for(int i = 0; i < a.length; i++)
		{
			if(a[i] != b[i])
			{
				return false;
			}
		}
		
		return true;
	}
	
	public static void main (String[] args) 
	{
		String[] array; // declaration, not initialisation//	
			
		int size = IBIO.inputInt("Enter array size = ");
		array = new String[size]; //initialisation//
		
		printArray(array);
		for(int i = 0; i < array.length; i++)
		{
			array[i] = IBIO.input("enter a string ");
		}
		printArray(array);
		
		String[] a2 = { "", "Joe", null, "Anne", }; 
		String[] b = a2;
		
		System.out.println("-----------------------");
		System.out.println(a2.equals(b));
		System.out.println(a2 == b); // only works because index are the same, but if put data manually then false //
		
		System.out.println(a2);
		System.out.println(b);
		
		System.out.println("-----------------------");
		printArray(a2);
		System.out.println("-----------------------");
		listArray(a2);
		System.out.println("-----------------------");

		
		System.out.println( a2[0].equals(a2[2]) ); // only works because it bases it off "", if did null first then error//
		System.out.println("-----------------------");
		System.out.println( "Hola" == "Hola");
		
		System.out.println("-----------------------");
		String h1 = ("Hola");
		String h2 = new String("Hola");
		System.out.println(h1 == h2); // have to use .equals for Strings//
		System.out.println(h1.equals(h2));

		System.out.println("-----------------------");
		String[] b2 = { "Pepe", "Joe", "Maria", "Anne", }; 
		String[] b3 = { "Pepe", "Joe", "Maria", "Anne", };
		
		System.out.println("Looking at function to check if contents are equal (java equals):");
		System.out.println(b2.equals(b3));
		System.out.println();
		
		System.out.println("Looking at function to check if contents are equal (==):");
		System.out.println(b2 == b3);
		System.out.println();
		
		System.out.println("Looking at function to check if contents are equal (checkEqual):");
		System.out.println(checkEqual(b2, b3));
	}
}

