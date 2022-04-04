
public class StringEx 
{
	
	public static void main (String[] args) 
	{
		int num = IBIO.inputInt("Enter a number of lines: ");
		String aa = stars(num);
		
		for (int i = 0; i < num; i++)
		{
			IBIO.output(aa);
		}
	}
	
	static String stars(int n)
		{
			String xx = "";
			for (int i = 0; i < n; i++)
			{
				xx = xx + "*";
			}
			return xx;
		}
}

