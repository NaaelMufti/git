
import java.util.Scanner;

public class RecCircleTest
{
	static final double scaleX = 100;
	static final double scaleY = 100;
	static final double middleX = scaleX / 2;
	static final double middleY = scaleY / 2;
	
    /* From StdDraw, you will use:
     * StdDraw.circle(x,y,r);
     *  which draws a circle of radius r, centered on (x, y).
     * @param x the x-coordinate of the centre of the circle
     * @param y the y-coordinate of the centre of the circle
     * @param r the radius of the circle
     * @throws IllegalArgumentException if the radius of the circle is negative
     */
	
	/* Part 1: finish this recursive method that will draw
	 * concentric circles using recursion and StdDraw.circle(x,y,r);
	 * the circles shoud be drawn from smallest to largest radius
	 */
	public static void circlere(double radius) throws InterruptedException
	// expanding circle
	{// YOUR MASTERPIECE CODE GOES HERE!
		if (radius == 0)
			return;
		else 
			circlere(radius - 1);
			Thread.sleep(1000);
			StdDraw.circle(middleX, middleY, radius);
		
		/* if(radius == 0)		// stop when radius reaches 0
		{	return;
		} else
		{	circlere(radius-1); // call the method with a smaller radius
		} */
	}

	/* Part 2: this recursive method draws
	 * concentric circles using recursion and StdDraw.circle(x,y,r);
	 * the circles shoud be drawn from largest to smallest radius
	 */
	public static void circlers(double radius) throws InterruptedException
	// shrinking circle
	{
		StdDraw.circle(middleX, middleY, radius); // draw circle in the middle of the screen
		Thread.sleep(1000); // wait a second
		if(radius == 0)		// stop when radius reaches 0
		{	return;
		} else
		{	circlers(radius-1); // call the method with a smaller radius
		}
	}

	public static void main(String[] args) throws InterruptedException
	{
		StdDraw.setXscale(0, scaleX);
		StdDraw.setYscale(0, scaleY);
		double maxRadius = 0;
		
		if( scaleX == scaleY )
			maxRadius = scaleX;
		else if( scaleX > scaleY )
			maxRadius = scaleX / 2;
		else
			maxRadius = scaleY / 2;
			
		System.out.print("Enter a radius (1-" + maxRadius + "): ");
		Scanner in = new Scanner(System.in);
		double r = in.nextDouble();
		in.close();

		// Expanding/growing concentric circles - uncomment the next 4 lines below to test
		StdDraw.setPenColor(StdDraw.BLUE);
		circlere( r );
		
		Thread.sleep(3000);
		StdDraw.clear();
		
		// Shrinking concentric circles
		StdDraw.setPenColor(StdDraw.MAGENTA);
		circlers( r );

	}
	
}
