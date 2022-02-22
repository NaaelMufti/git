
public class fifteen {
	
	public static void main (String[] args) 
	{
		int n = IBIO.inputInt("n= ");
		int result = n;
		for(int i = 1; i < n; i++)
		{
			if(i%2 == 0)
			{
				result = result/i;
			}
			else
			{
				result = result*i;
			}
		}
		IBIO.output(result);
	}
}

