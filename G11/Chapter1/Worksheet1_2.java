
public class Worksheet1_2 
{
	
	public static void main (String[] args) 
	{
		int steps = IBIO.inputInt("Enter the amount of steps: ");
		int start = IBIO.inputInt("Enter the starting number: ");
		int inc = IBIO.inputInt("Enter the increment ");
		
		int fin = start + (steps-1)*(inc);
		
		for(int num=start; num<=fin; num = num+inc)
		{
			IBIO.output(num);
		}
	}
}

