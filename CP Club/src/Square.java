public class Square
{
    char name;
    double side;

    public Square(char n, double s)
    {
        name = n;
        side = s;
    }

    public double getArea()
    {
        double Area = side * side;
        return Area;
    }

    public double getPer()
    {
        double Per = side * 4;
        return Per;
    }
}
