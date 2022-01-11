
public class WhileExample1
{
	
	public static void main (String[] args)
	{
		int x = IBIO.inputInt("Enter a positive number: ");
		while(x < 1)
		{
			x = IBIO.inputInt("Error - enter a positive number: ");
		}
		IBIO.output("Number input: " + x);
		
		IBIO.output("-----------------------------------------");
		
		do
		{	x = IBIO.inputInt("Enter a positive number: ");
			if(x < 1)
			{	IBIO.out("Error - ");
			}
		} while(x < 1);
		IBIO.output("Number input: " + x);
		
		IBIO.output("-----------------------------------------");
		
		do
		{	x = IBIO.inputInt("Enter a positive number: ");
		} while(x < 1);
		IBIO.output("Number input: " + x);
	}
}
