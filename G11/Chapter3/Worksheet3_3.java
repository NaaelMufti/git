
public class Worksheet3_3
{
	
	public static void main (String[] args)
	{
		int sum = 0;
		int n = IBIO.inputInt("Enter a number: ");
		do 
		{
			int digit = n % 10;
			sum = sum + (digit*digit*digit);
			n = n/10;
		} while ( n!=0);  
		IBIO.output(sum);
	}
}

