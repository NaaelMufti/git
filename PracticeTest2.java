
public class PracticeTest2 
{
	
	public static void main (String[] args) 
	{
		IBIO.output("Naael Mufti");
		long first = 0;
		long second = 1;
		long term;
		long n;
		long maxterm;
		
		do
		{ n= IBIO.inputInt("Calculate up to which term? "); 
			//must declare variables outside of loop//
			if(n < 0)
			{	IBIO.output("Error- input must be positive");
			}
		} while (n < 0);
		maxterm = n;
		if(n <=20)
		{
			if(n == 0)
			{
				IBIO.out(first);
			}
			if(n == 1)
			{
				IBIO.out(first + "; " + second);
			}
			if(n >=2)
			{
				IBIO.out(first + "; " + second);
			
				for (int i = 2; i<=n; i++)
				{
					term = first + second;
					IBIO.out("; " + term);
					first = second; 
					second = term;
				}
			}
		}else
		{
			for (int a = 2; a<=n; a++)
				{
					maxterm = first + second;
					first = second; 
					second = maxterm;
				}
				IBIO.out(maxterm);
		}
	}
}

