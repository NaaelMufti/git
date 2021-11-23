

public class formatting {
	
	public static void main (String[] args) 
	{
		int x=IBIO.inputInt("Enter a number: ");
			if (x < 10)
			{
				IBIO.out(" ");
			}
			if (x < 100)
			{
				IBIO.out(" ");
			}
			IBIO.output(x);
		int a=IBIO.inputInt("Enter a number: ");
			if (a < 10)
			{
				IBIO.out(" ");
			}
			if (a < 100)
			{
				IBIO.out(" ");
			}
			IBIO.output(a);
		int n=IBIO.inputInt("Enter a number: ");
			if (n < 10)
			{
				IBIO.out(" ");
			}
			if (n < 100)
			{
				IBIO.out(" ");
			}
			IBIO.output(n);
	}
}

		/* outputs spacing so it is alligned right
		 * for numbers less then 10 it works under both x<100 and x<10 
		 * if with is assumed, then put that amount of spaces or width - digits
		 * for centre, padding = (80 - digits)/2
		 */
