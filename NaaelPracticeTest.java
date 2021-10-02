/*

PrX.Y:
This  program  will  calculate  the  minimum,  maximum,  range,  and  
average  of  a  set  of  input numbers
  
*/

public class NaaelPracticeTest		// Replace "Template"with your specific class name
{
	public static void main(String[] args)
	{
		IBIO.output("Naael Mufti");
		int max = 0;
		int min = 0;
		int t = 0;
		double sum = 0;
		int n = IBIO.inputInt("How many numbers to process?: ");
		if (n<3)
		{
			IBIO.output("Input Error");
			System.exit(1); 
				/* instead could do this:
				 * if (n>=3) 
				 * {
				 * 	IBIO.output("End")
				 * }
				 */
		}
		for(int a=0; a < n; a++) //repeat n times//
		{
			int x = IBIO.inputInt("Enter a number: ");
			if(a==0)
			{
				max=x;
			}
			if(x > max)
			{
				max=x;
			}
			if(a==0)
			{
				min=x;
			}
			if(x < min)
			{
				min=x;
			}
			sum = sum+x;
		}
		IBIO.output("Maximum = " + max);
		IBIO.output("Minimum = " + min);
		IBIO.output("Range = " + (max-min)); 
		IBIO.output("Average = " + (sum/n));
		for(int i=2; i < max; i++)
		{
			if(i>max)
			{
				t = 1;
			}
				else{
					if(max % i == 0)
					{ 
						t = 2;
					}
						else{
							i=(i++);
							}
					}
		}
		if (t>=2)
		{
			IBIO.output("Is the maximum a prime? False");
		}
		else{
			IBIO.output("Is the maximum a prime? True");
		}
		IBIO.output("[End]");
		
	}
}


/*

Naael Mufti
How many numbers to process?: 7
Enter a number: 7
Enter a number: 5
Enter a number: 3
Enter a number: 2
Enter a number: 8
Enter a number: 9
Enter a number: 6
Maximum = 9
Minimum = 2
Range = 7
Average = 5.714285714285714
Is the maximum a prime? False
[End]

*/
