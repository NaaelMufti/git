
public class WhileCh3 {
	
	public static void main (String[] args) 
	{
		int i = 1;
		int x = IBIO.inputInt("Enter a number: ");
		while(x < 1)
		{
			x = IBIO.inputInt("Error - number too small: ");
		}
		
		do 
		{
			i++;
		} while (x % i != 0);
		
		if ( i == x)
		{
			IBIO.output(x + " is prime");
		} else // or could do system.exit//
		{
			IBIO.output(x + " is divisible by " + i);
		}
		
	}
}
