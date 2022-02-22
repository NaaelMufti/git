
public class Ch9 
{
	public static int random(int max)
	{
		double r = Math.random() * max;
		int yy = (int)(r + 1);
		return yy;
	}
	
	public static void main (String[] args) 
	{
		final int MAXROLLS = 100; //final means constant //
		final int MAXSIDES = 6;
		
		int[] rolls = new int[100];
		
		for (int i = 0; i < rolls.length; i++) //could use MAXROLLS instead of rolls.length//
		{
			/*
			 * double xx = Math.random() * 6; \\ generates random number between 0 and 5 //
			 * rolls[i] = (int)(xx + 1); //cast to integer, add 1 because goes from 0 - 5.99
			*/
			rolls[i] = random(MAXSIDES);
		}
		for (int i = 0; i < rolls.length; i++)
		{
			IBIO.output(i + ": " + rolls[i]);
		}
	}
}

