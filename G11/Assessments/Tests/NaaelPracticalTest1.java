
public class NaaelPracticalTest1 {
	
	public static void main (String[] args) 
	{
		IBIO.output("Naael Mufti");
		long fact = 1;
		int s=0;
		int n = 0;
		int t=n;
		for (int v=1; v<=20; v++)//repeat forever until correct//
		{
			n=IBIO.inputInt("Enter an integer between 1 and 20: ");
			if (n<1 || n>20)
			{
				IBIO.output("Error-number out of range");
			}
			else
			{
				break; //break for loop//
			}
		}
        for(int i = 1; i <= n; i++)
        {
            fact = fact * i;
        }
        if(n<=10)
        {
			IBIO.out(n+"! = ");
			for(t=n; t>1; t--) //countdown displayed on one line//
			{
				IBIO.out(t+" x ");
			}
			IBIO.out("1 = "+fact);
		}
		else
		{
			IBIO.out(n+"! = "+fact);//only for greater then 10//
		}
        for(s=0; fact>0; fact=(fact/10))//divide by 10 for each place//
        {
			s=s+1;
		}
		        IBIO.output(" digits: " + s);
	}
}

/*
 * Naael Mufti
Enter an integer between 1 and 20: 7
7! = 7 x 6 x 5 x 4 x 3 x 2 x 1 = 5040 digits: 4
* 
* Naael Mufti
Enter an integer between 1 and 20: 12
12! = 479001600 digits: 9
 */

