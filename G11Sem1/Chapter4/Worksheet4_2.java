public class Worksheet4_2 
{
	
	public static void main (String[] args) {
		int total=0;
		int num;
		
		for (int i=1; i<=1000; i++)
		{
			int mod = i%3;
			num = 0;
			switch(mod)
			{
				case 0:
					num = i*-5;
					break;
				case 1:
					num = i*7;
					break;
				case 2:
					num = i*2;
					break;
			}
			total = total + num;
		}
		
		IBIO.output(total);
	}
}
