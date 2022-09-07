
public class ExamCheck11 {
	
	public static void main (String[] args) 
	{
		double N = IBIO.inputDouble("Enter a number: ");
		int c = 0;
		while (N >= 1)
		{
			N = N/2;
			c = c+1;
		}
		IBIO.output(c);
	}
}

