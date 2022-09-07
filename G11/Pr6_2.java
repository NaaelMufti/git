
public class Pr6_2 
{	
	public static void main (String[] args) 
	{
		int lines = IBIO.inputInt("Enter number of lines: ");
		
		for (int i = 1; i<=lines; i++)
		{
			IBIO.output(star(i));
		}
		
		
		for (int i = (lines-1); i>=1; i--)
		{
			IBIO.output(star(i));
		}
		
	}
	static String star(int n)
	{ 
		String output = "";
		for (int i = 1; i<=n; i++)
		{
			output = output + "*";
		}
		return output;
	}
}
