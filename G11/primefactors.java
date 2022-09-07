
public class primefactors {
	
	public static void main (String[] args) 
	{
		int n = IBIO.inputInt("Enter: " );
		for(int i =2; i < n; i++)
		{
			if(n%i == 0)
			{
				IBIO.out( i + " ");
				n = n/i;
			}
		}
	}
}

