
public class fourteen {
	
	public static void main (String[] args) 
	{
		int z = IBIO.inputInt("z: ");
		int x = IBIO.inputInt("x: ");
		while (x<5)
		{
			z = z+x;
			x=x+1;
		}
		IBIO.output(x + " " + z);
	}
}

