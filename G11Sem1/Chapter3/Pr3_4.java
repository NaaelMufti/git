public class Pr3_4
{
	
	public static void main (String[] args)
	{
		int n = 3; //IBIO.inputInt("Number? ");
		int x = n;
		int steps = 0;
		IBIO.output( x );
		while( x > 1 )
		{
			if(x % 2 == 0)
			{	x = x / 2;
			} else
			{	x = 3 * x + 1;
			}
			IBIO.output(">>>" + x);
			steps++;
		}
		IBIO.output("Steps: " + steps);
	}
}

/*
Number? 3
>>>10
>>>5
>>>16
>>>8
>>>4
>>>2
>>>1
Steps: 7
*/
