
public class Worksheet7_1 {
	
	public static String pad(int n, int width)
	{
		String st = "" + n; // make string of number
		while (st.length() < width) //st.length () = number of characters
		{
			st = " " + st; // add spaces behind number
		}
		return st;
	}
	
	public static void main (String[] args) 
	{
		final int WIDTH = 10; //final means constant (can't be modified) all caps means constant
		for(int i = 1; i < 20; i++)
		{
			//IBIO.output(i + " " + (i*i) + " " + (i*i*i));
			String s = pad(i, WIDTH) + pad(i*i, WIDTH) + pad(i*i*i, WIDTH);
			IBIO.output(s);
		}
	}
}

