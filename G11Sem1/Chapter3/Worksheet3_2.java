
public class Worksheet3_2
{
	
	public static void main (String[] args)
	{
		int i = 1;
		int x;
		do
		{
		x = IBIO.inputInt("Enter a number: ");
		} while (x <= 1);
		
		do
		{ i++;
		} while (x % i != 0);
		
		if (i < x)
		{
		IBIO.output(x + " is divisible by " + i);
		} else
		{
			IBIO.output("Prime");
		}
	}
}

