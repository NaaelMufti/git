
import java.util.Scanner;

public class IntToBinRecursive
{

	public static void convert(int n)
	{
		if( n == 0)
		{	return;
		}
		convert(n/2);
		System.out.print(n%2);
	}

	public static void main(String[] args)
	{
		System.out.print("Enter an integer to convert to binary: ");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		System.out.print(n + " base 10 = ");
		convert( n );
		System.out.println(" base 2.");
		System.out.println();
	}

}
