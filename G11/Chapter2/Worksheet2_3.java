
public class Worksheet2_3
{
	
	public static void main (String[] args) 
	{
		int n = IBIO.inputInt("Enter a number: ");
		int term;
		
		term = n % 2;
		
		if(term < 1)
		{
			IBIO.output("EVEN");
		} else
		{
			IBIO.output("ODD");
		}
	}
}

