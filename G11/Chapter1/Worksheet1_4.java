
public class Worksheet1_4 
{
	
	public static void main (String[] args) 
	{
		int add = 1;
		int term = 1;
		
		for(int i = 1; i<100; i++)
		{
			add = add + 1;
			term = term + add;
			IBIO.out(term + " ");
		}
	}
}

