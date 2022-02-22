
public class Password 
{
	
	public static void main (String[] args) 
	{
		String pass = "zed";
		String ans = "";
		
		char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		
		
		for (int b = 0; b < pass.length(); b++)
		{
			for (int a= 0; a < alphabet.length; a++)
			{
				if(pass.charAt(b) == alphabet[a])
				{
					System.out.print(alphabet[a]);
					break;
				}
			}
		}
		
	}
}

 
