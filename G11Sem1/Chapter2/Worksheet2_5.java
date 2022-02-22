
public class Worksheet2_5 
{
	
	public static void main (String[] args) 
	{
		int mod = 1;
		
		for (int i = 1; i <= 100; i++)
		{
			mod = i % 2;
			
			if(mod > 0)
			{
				IBIO.out(i + " ");
			}
		}	
	}
}

