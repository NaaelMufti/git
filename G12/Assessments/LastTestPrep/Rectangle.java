public class Rectangle extends Shape
{
    private double side1;
    private double side2;

    public Rectangle(String name, double side1, double side2)
    {
        super(name);
        this.setSide1(side1);
        this.setSide2(side2);
    }

    public double getSide1()
    {
        return side1;
    }

    public void setSide1(double side1)
    {
        this.side1 = side1;
    }

    public double getSide2()
    {
        return side2;
    }

    public void setSide2(double side2)
    {
        this.side2 = side2;
    }

    public double getArea()
    {
        return side1 * side2;
    }

    public String toString()
    {
        return super.toString() + " side1 = " + side1
                + " side2 = " + side2 + " Area = " + getArea();
    }

    public static void main(String[] args)
    {
        Rectangle r = new Rectangle("R", 5,3);
        System.out.println(r);
    }
}