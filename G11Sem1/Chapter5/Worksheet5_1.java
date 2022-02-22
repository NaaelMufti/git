
public class Worksheet5_1 
{
	
	public static void main (String[] args) 
	{
		double sum = 0;
		double term = 1;
		
		for (int i =1; i<=100; i++)
		{
			term = term/5;
			sum = sum + term;
		}
		
		IBIO.output(sum);
	}
}
