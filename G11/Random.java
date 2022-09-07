
public class Random 
{
	
	public static void main (String[] args) 
	{
		for(int i = 0; i < 10; i++)
		{
			IBIO.output(Math.random());
			IBIO.output(Math.random()*6);
			IBIO.output("--------");
		}
		IBIO.output("END");
	}
}

