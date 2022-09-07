
public class ArrayTest 
{
	
	public static void main (String[] args) 
	{
		int size = IBIO.inputInt("Enter size: ");
		int[] array = new int[size];
		
		for (int b = 0; b < size; b++)
		{
			array[b] = random();
		}
		
		printArrays(array);
	}
	
	public static void printArrays(int[] c) // c is name of array // 
	{
		for (int a = 0; a < c.length; a++)
		{
			System.out.println(a + ": " + c[a]);
		}
	}
	
	static int random()
	{
		double xx = Math.random() * 6; //Math.random - decimal
		int yy = (int)(xx + 1); //change to number 1 to 6
		return(yy);
	}
}

/*
 * public static void main (String[] args) 
	{
		int[ ] num = new int[100];
		for (int i = 0; i<100; i++)
		{
				num[i] = random();
		}
		for (int n = 1; n<=6; n++)
		{	for (int i = 0; i<100; i++)
			{
				if (num[i] == n)
				{
					System.out.print(n);
				}
			}
			System.out.println("");
		}
	}
	static int random()
	{
		double xx = Math.random() * 6;
		int yy = (int)(xx+1);
		return yy;
	}
 */

