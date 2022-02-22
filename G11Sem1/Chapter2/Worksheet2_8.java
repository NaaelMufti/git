
public class Worksheet2_8
{
	
	public static void main (String[] args) 
	{
		long c = 0;
		
		for (long i = 1; i <= 1000000; i ++)
		{	
			if(i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0)
				c = c + 1;
		}
		
		IBIO.output(c);
	}
}

