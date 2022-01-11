/*
Write a program that allows the user to enter a number less than 1000. The program will search for two numbers that when squared and added together make the number that was input. The
program has two loops. One loop going from 1 to num and the second loop also goes from 1 to
num also. In the loop the program will square the numbers and then add them together to see if
they are the same as the input number. If they are then use the break statement to break out of
both loops. Your output will be the numbers or state that it is impossible.
*/

public class Pr4_3 // 4.3
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
