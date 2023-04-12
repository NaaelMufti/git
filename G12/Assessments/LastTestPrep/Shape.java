public class Shape
{
    private String name;

    public Shape(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public double getArea()
    {
        return 0;
    }

    public double compareTo(Shape s)
    {
        return this.getArea() - s.getArea();
    }

    @Override
    public String toString()
    {
        return name;
    }
}

