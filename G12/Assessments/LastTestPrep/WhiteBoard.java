import java.util.*;

public class WhiteBoard
{
    private ArrayList<Shape> shapes = new ArrayList<>();

    public WhiteBoard() { }

    public WhiteBoard(ArrayList<Shape> shapes)
    {
        this.shapes = shapes;
    }

    public int size()
    {
        return shapes.size();
    }

    public void add(Shape s)
    {
        shapes.add(s);
    }

    public Shape getLargest()
    {
        if(shapes.size() < 2)
            return null;
        Shape s = shapes.get(0);
        for(int i = 1; i < shapes.size(); i++)
        {
            if (shapes.get(i).getArea() > s.getArea())
                s = shapes.get(i);
        }
        return s;
    }

    @Override
    public String toString()
    {

        return "WhiteBoard{" +
                "shapes = " + shapes +
                '}';
    }

    public static void main(String[] args)
    {
        Rectangle r = new Rectangle("R", 5,3);
        System.out.println(r);
        Square s = new Square("S", 3);
        System.out.println(s);
        WhiteBoard board = new WhiteBoard();
        board.add(r);
        board.add(s);
        s = new Square("Q", 7);
        System.out.println(s);
        board.add(s);
        System.out.println(board);
        System.out.println(r.compareTo(s));
        System.out.println(board.getLargest() );
    }
}