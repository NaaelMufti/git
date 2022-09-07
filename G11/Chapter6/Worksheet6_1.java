
public class Worksheet6_1
{
	


	public static String stars(int howmany)
	{
		String s = ""; // initialise String s to empty
		for(int i = 0; i < howmany; i++)
		{
			s = s + "*";
		}
		return s;
	}
	
	
	public static void main (String[] args)
	{
		int num = IBIO.inputInt("enter number of lines ");
		String line = stars(num);
		for (int i = 0; i < num; i++)
		{
			IBIO.output(line);
		}
	}
}

