import java.sql.SQLOutput;

public class CatTest
{
    public static void main(String[] args)
    {
        Cat whiskers = new Cat("whiskers", 2020, "long");
        System.out.println(whiskers);
        whiskers.setCoat("Short");
        System.out.println(whiskers.getCoat() );
        whiskers.talk();
        whiskers.eat();
    }
}
