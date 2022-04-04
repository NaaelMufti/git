/*
 * Always use a.length feature
 * int[][] a
 * a.length -> rows
 * a[0].length -> columns
 * 
 */

public class DemoArray2D
{
	public static final int MAXROWS = 3;
	public static final int MAXCOLS = 5;
	
	public static void print2dArray(int[][] a)
	{
		for(int row = 0; row < a.length ; row++)
		{
			for(int col = 0; col < a[row].length; col++)
			{
				System.out.printf("%3d ", a[row][col]);
			}
			System.out.println();
		}
	}
	
	public static void print2dArray(double[][] a) // selects which method based on variable type
	{
		for(int row = 0; row < a.length ; row++)
		{
			for(int col = 0; col < a[row].length; col++)
			{
				System.out.print(a[row][col] + " ");
			}
			System.out.println();
		}
	}
	
	public static void main (String[] args) 
	{
		int [] [] a2d = 
		{
			{1, 2, 7, 5},
			{3, 4, 5, 9},
			{11, 13, 21, 41}
		};
		print2dArray(a2d);
		
		double[][] a2d2 = new double[MAXROWS][MAXCOLS];
		// print2dArray(a2d2); / this would just output 2D array with everything as 0.0 /
		for(int row = 0; row < a2d2.length; row++)
		{
			for(int col = 0; col < a2d2[row].length; col++)
			{
				a2d2[row][col] = IBIO.inputDouble("Input double for row " + (row + 1) + " column " + (col + 1) + ": ");
			}
		}
		print2dArray(a2d2);
	}
}

