
public class Worksheet5_2
{
	
	public static void main (String[] args) 
	{
		double term = 1;
		double sum = 0;
		
		for (int i = 1; i<=100; i++)
		{
			term = 1;
			term = term/(i*i);
			sum = sum + term;
		}
		
		IBIO.output("Total is " + sum);
	}
}
