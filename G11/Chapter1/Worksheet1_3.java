
public class Worksheet1_3
{
	
	public static void main (String[] args) 
	{
		int num = 1;
		int square = 0;
		int cube = 0;
		
		for(int a=0; a < 10; a++)
		{
			IBIO.out(num);
			for (int i = 0; i < 1; i++)
			{
				square = num * num;
			}
			IBIO.out("  " + square);
			
			for (int i = 0; i < 1; i++)
			{
				cube = num * num * num;
			}
			IBIO.output("  " + cube);
			num = num + 1;
		}
	}
}

