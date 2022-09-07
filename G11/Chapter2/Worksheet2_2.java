
public class Worksheet2_2
{
	
	public static void main (String[] args) 
	{
		int n = IBIO.inputInt("Enter a number: ");
		int term;
		
		term = n % 2;
		
		if(term < 1)
		{
			IBIO.output("EVEN");
		}
		if(term > 0)
		{
			IBIO.output("ODD");
		}
	}
}

