
public class Worksheet1_6 
{
	
	public static void main (String[] args) 
	{
		int n = IBIO.inputInt("Calculate up to which term: ");
		int first = 0;
		int second = 1;
		int term; 
		
		IBIO.out(first + " " + second);
		for (int i = 2; i <n; i++)
		{
			term = first + second;
			IBIO.out(" " + term);
			first = second;
			second = term;
		}
	}
}

