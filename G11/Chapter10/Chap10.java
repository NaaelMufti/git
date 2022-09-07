
public class Chap10 
{
	
	public static void main (String[] args) 
	{
		String s = IBIO.input("Enter your name: ");
		char[] x = s.toCharArray(); // makes string into array of characters //
		
		for (int i = 0; i < s.length(); i++)
		{
			System.out.print(x[i]);
		}
		
	}
}

