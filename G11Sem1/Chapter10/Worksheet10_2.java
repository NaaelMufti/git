
public class Worksheet10_2 
{
	
	public static void main (String[] args) 
	{
		String binary = IBIO.input("Enter a binary number: ");
		//System.out.println(isBinary(binary));
		if(isBinary(binary) == false)
		{
			System.out.println("Error, input was not a binary number.");
		} else
		{
			System.out.println( bin2dec(binary));
		}
	}

	public static boolean isBinary(String s)
	{
		char[] check = s.toCharArray();
		
		for(char c : check)
		{
			if(c!= '0' && c!= '1')
				{
					return false;
				}
		}
		return true;
	}
	
	public static int bin2dec(String binary)
	{
		char[] bin = binary.toCharArray();
		int result = 0;
		
		for(int i = binary.length() - 1; i >= 0; i--)
		{
			if(bin[i] == 1)
			{
				result = result + (int)Math.pow(2, bin.length - i);
			}
		}
		return result;
	}
}

