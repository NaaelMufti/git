public abstract class Shape
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

    public abstract double getArea();

    public abstract double compareTo(Shape s); // since abstract no need { }

    @Override
    public String toString()
    {
        return name;
    }
}

