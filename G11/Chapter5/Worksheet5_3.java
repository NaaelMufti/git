
public class Worksheet5_3
{
	
	public static void main (String[] args) 
	{
		double num = 1;
		double pi = 0;
		double sign = 1;
		
		for (int i = 1; i<=10000; i++)
		{
			num = sign/((2*i)-1);
			pi = pi + num;
			sign = sign * -1;
		}
		
		pi = 4 * pi;
		IBIO.output("Pi is approximately " + pi);
	}
}
