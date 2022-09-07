
public class Worksheet4_1
{
	
	public static void main (String[] args)
	{
		int num1 = IBIO.inputInt("Enter a number: ");
		int num2 = IBIO.inputInt("Enter another number: ");
		int ans;
		int math; 
		
		do
		{
			IBIO.output("Press:  [1] for addition");
			IBIO.output("        [2] for multiplication");
			IBIO.output("        [3] for quit");
			
			math = IBIO.inputInt(": ");
			
			switch (math)
			{
				case 1:
					ans = num1 + num2;
					IBIO.output(ans);
					break;
				case 2:
					ans = num1 * num2;
					IBIO.output(ans);
					break;
				case 3:
					break;
				default:
					IBIO.output("Error - Number should be 1, 2 or 3");
			}
		}while (math != 3);
	}
}

 
