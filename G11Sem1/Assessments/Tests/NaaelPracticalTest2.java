
public class NaaelPracticalTest2 {
	
	public static void main (String[] args) 
	{
		IBIO.output("Naael Mufti");
		int power = 1; 
		int b;
		do
		{
			b=IBIO.inputInt("Enter the base: ");
			while(b > 10)
			{
				b=IBIO.inputInt("Enter number <= 10: "); 
			}
			if (b == 0)
			{
				System.exit(0);
			}
			int e=IBIO.inputInt("Enter the exponent: ");
			while(e > 10)
			{
				e=IBIO.inputInt("Enter number <= 10: "); 
			}
			double exp=e;
			if(e<0)
			{
				e=-e;
			}
			for (power=1; e!=0; e--)
			{
				power*=b;
			}
			if (exp>0)
			{
				IBIO.output(b + " to the power of " + exp +" = "+ power);
			} else
			{
				IBIO.output(b + " to the power of " + exp + " = ");
				IBIO.output("  1  ");
				IBIO.output("-----  = " + 1.0/power);
					if (power < 10)
					{
						IBIO.out(" ");
					}
					if (power < 100)
					{
						IBIO.out(" ");
					}
					if (power < 1000)
					{
						IBIO.out(" ");
					}
				IBIO.output(power);
				//IBIO.output("1/" + power + " = ");//
			}
		} while(b!=0);
	}
}
/* if (e < 0)
			{
				IBIO.output("Warning: exponent should be positive");
				System.exit(0);
			}
*/
