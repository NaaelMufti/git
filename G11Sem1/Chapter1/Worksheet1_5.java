
public class Worksheet1_5
{
	
	public static void main (String[] args) 
	{
		int n = 20;
		int i = 0;
		int power = 1;
		
		while (i <= n)
		{
			IBIO.output(power);
			power = power * 2;
			i = i + 1;
		}
	}
}

