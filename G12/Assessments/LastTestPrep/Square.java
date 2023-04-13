public class Square extends Shape
{
    private double side;

    public Square(String name, double side)
    {
        super(name);
        this.setSide(side);
    }

    public double getSide()
    {
        return side;
    }

    public void setSide(double side)
    {
        this.side = side;
    }

    public double getArea()
    {
        return side * side;
    }

    @Override
    public String toString()
    {
        return super.toString() + " side=" + side + " Area = " + getArea();
    }

    public static void main(String[] args)
    {
        Square s = new Square("S", 3);
        System.out.println(s);
    }
}