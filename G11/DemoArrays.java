import java.util.Arrays; //this line makes System.out.println(Arrays.toString(nums)) work //

public class DemoArrays 
{
	static final int SIZE = 5;
	
	public static void printArray(double[] a)
	{
		for(int i = 0; i < a.length; i++)
		{
			System.out.println(i + ": " + a[i]);
		}
	}
	
	
	/* Enhanced for loop - doesn't use index
	 * public static void printArray(double[] arrayofdoubles)
	{
		for(double x : arrayofdoubles)
		{
			System.out.println(x); 
		}
	}
	*/
	
	public static void main (String[] args) 
	{
		double[] nums = new double[SIZE]; //SIZE is number of elements/
		double[] whatever = { 1.1, 2.2, 3.3, 4.4 };
		
		System.out.println(whatever.length);
		printArray(whatever);
		System.out.println("-------------------------");
		
		System.out.println(nums);
		System.out.println("-------------------------");
		
		printArray(nums);
		System.out.println("-------------------------");
		
		System.out.println(Arrays.toString(nums)); // NOT ACCEPTED BY IB //
		System.out.println("-------------------------");
	}
}

