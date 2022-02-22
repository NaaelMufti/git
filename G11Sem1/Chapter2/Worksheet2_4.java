
public class Worksheet2_4
{
	
	public static void main (String[] args) 
	{
		int num = 1;
		int cube = 0;
		
		for(int a=0; a < 10; a++)
		{
			if(num < 10)
			{
				IBIO.out(" " + num);
			}
			else
			{
				IBIO.out(num);
			}
			
			for (int i = 0; i < 1; i++)
			{
				cube = num * num * num;
			}
			
				if(cube < 10)
				{
					IBIO.output("    " + cube);
				}
				else if (cube < 100)
				{
					IBIO.output("   " + cube);
				}
				else if (cube < 1000)
				{
					IBIO.output("  " + cube);
				}
				else if (cube < 10000)
				{
					IBIO.output(" " + cube);
				}
			num = num + 1;
		}
	}
}

