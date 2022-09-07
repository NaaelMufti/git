
// extra example with prime numbers //

public class Worksheet8A
{
	
	public static void main( String args[])
	{
		for (int i = 1; i < 10; i++)
		{	for (int j = 1; j < 10; j++)
			{
				if(i <= j) //to exclude duplicates //
				{
					if ( good(i,j) )
					{	IBIO.output( i + " " + j + " " + (i+j) );
					}
				}
			}
		}
	}
	
	public static boolean isPrime(int n)
	{
		if(n < 2)
		{	return false;
		}
		for(int i = 2; i <= Math.sqrt(n); i++)
		{
			if(n % i == 0)
			{	return false;
			}
		}
		return true;
	}
	
	// method to test for the property that we are looking for
	public static boolean good(int a, int b)
	{	// two numbers added together equal a prime
		int x = a + b;
		return isPrime(x);
	}
}

