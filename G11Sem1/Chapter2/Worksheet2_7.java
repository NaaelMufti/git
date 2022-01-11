
public class Worksheet2_7
{

	public static void main (String[] args)
	{
		for(int i = 1; i <= 100; i++)
		{
			if(i % 2 != 0 && i % 3 != 0)
			//if( !(i % 2 == 0 || i % 3 == 0) )
			{	IBIO.out(i + " ");
			}
		}
	}
}
