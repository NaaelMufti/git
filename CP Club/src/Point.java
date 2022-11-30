
public class Point
{
	char name;
	double x;
	double y;

	double d;
	
	// constructor
	public Point(char pointName, double coordX, double coordY)
	{	
		name = pointName;
		x = coordX;
		y = coordY;
	}
	
	public boolean equals(Point p2)
	{

		return x == p2.x && y == p2.y;
	}

	public double getX()
	{
		return x;
	}

	public double getY()
	{
		return y;
	}
	public double distance(Point p2)
	{
		d = Math.sqrt((this.getX() - p2.getX())*(this.getX() - p2.getX()) + (this.getY() - p2.getY())*(this.getY() - p2.getY()));
		return d;
	}

	public double distance() // distance from 0,0
	{
		d = Math.sqrt((this.getX() * this.getX()) + (this.getY() * this.getY()));
		return d;
	}

	public void printPoint()
	{
		System.out.println(name + "(" + x + "," + y + ")" );
	}
	
	public static void main (String[] args)
	{
		Point p = new Point('P', 2, -6);
		p.printPoint();
		Point q = new Point('Q', 7, 3);
		q.printPoint();
		Point r = new Point('R', 2, -6);
		r.printPoint();
		System.out.println( "P=Q? " + p.equals(q) );
		System.out.println( "P=R? " + p.equals(r) );
		System.out.println( "Distance between P and Q = " + p.distance(q) );
		System.out.println( "Distance of Q to origin (0,0) = " + q.distance() );
		
	}
}

