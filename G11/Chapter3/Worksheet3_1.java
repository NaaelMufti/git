
public class Worksheet3_1
{
	
	public static void main (String[] args)
	{
		int x;
		do
		{
			x = IBIO.inputInt("Enter a number: ");
		} while( x % 2 != 0 || x <= 0 || x >= 100 );
	}
}

