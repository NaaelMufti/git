
public class PracticeTest2A
{
	
	public static void main (String[] args)
	{
		IBIO.output("Naael Mufti");
		long first  = 0;
		long second = 1;
		long term = 0;
		long maxTerm;
		double average = 0;
		do
		{	maxTerm = IBIO.inputInt("Calculate up to which term of the Fibonacci sequence? ");
			if(maxTerm < 0)
			{	IBIO.output("ERROR-input must be >= 0!");
			}
		} while( maxTerm < 0 );
		if( maxTerm <= 20 )
		{
			IBIO.out(first);
			if( maxTerm >= 1 )
			{	IBIO.out("; " + second);
			}
			if( maxTerm > 1 )
			{	for(int i = 2; i <= maxTerm; i++)
				{
					term = first + second;
					average = average + term;
					IBIO.out("; " + term );
					first = second;
					second = term;
				}
				IBIO.out("\n");
				IBIO.out(""+average/term);
			}
		} else {
			for(int i = 2; i <= maxTerm; i++)
			{
				term = first + second;
				average = average + term;
				first = second;
				second = term;
			}
			IBIO.output( term );
			IBIO.out(""+average / term);
		}
	}
}

