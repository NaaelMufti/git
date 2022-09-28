public class Tester
{
    public static void main(String[] args)
    {
        Square s = new Square('S', 5.5);
        System.out.println("Name of Square: " + s.name);
        System.out.println("Side Length: " + s.side);
        System.out.println("Area: " + s.getArea());
        System.out.println("Perimeter: " + s.getPer());
    }
}
