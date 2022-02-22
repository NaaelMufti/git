
public class Worksheet4_3 
{
	public static void main(String args[])
	{
		int num = 0;
		int x = 0;
		int i = 1;
		int j = 1;

		do
		{   num = IBIO.inputInt("Enter a number<1000: ");
		} while (num>=1000);

		exit:
		for(i=1; i<=num; i++)
		{
			for(j=1; j<=num; j++)
			{	IBIO.output("first# " + i + "\tsecond# " + j);
				x = (i*i) + (j*j);
				if(x==num)
				{
					break exit;
				}
			}
		}

		if(x==num)
			IBIO.output(i + " and " + j + " squared and added together = " + num);
		else
			IBIO.output("Pair of numbers are impossible to find.\n");

	}
}
