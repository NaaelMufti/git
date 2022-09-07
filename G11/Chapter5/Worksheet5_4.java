
public class Worksheet5_4
{
	
	public static void main (String[] args)
	{
		double num = 1;
		double den = 1;
		double increment = 1;
		double term = 0;
		double sum = 0;
		
		for(int i = 1; i <= 100; i++)
		{
			term = num / den;
			sum = sum + term;
			increment = increment + 2;
			num = num * i;
			den = den * increment;

		}
		System.out.println(sum * 2);
		
	}
}

