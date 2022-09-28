import java.util.Scanner;

/*
If method A has to call exception
And method B calls method A
method B must also have throws Exception and with same type of Exception
*/
public class FractionTest
{

    public static Fraction enter() throws Exception// this'd be better off in the test class, though...
    {
        String strFraction = IBIO.input("Enter fraction (a/b format): ");
        strFraction = strFraction.replace("/", " "); // Changes slash to space
        Scanner parse = new Scanner(strFraction); // to parse fraction
        int num = parse.nextInt(); // so we can extract the numerator &
        int den = parse.nextInt(); // denominator; also this.num & this.den
        Fraction f = new Fraction(num, den);
        f.simplify(); // <<< uncomment after you complete problem
        return f;
    }

    // Test class for quick testing and demo purposes only
    public static void main(String[] args) throws Exception // has throw Exception cuz of above //
    {
        Fraction f = new Fraction(1,1);
        Fraction g = new Fraction(); // initialise g outside of while(true)
        System.out.println( f );
        f.setNum(3);
        f.setDen(4);

        while (true)
        {
            try {
                g = enter();
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println( "Numerator input = " + f.getNum() +
                "\t Denominator input =" + f.getDen() );
        System.out.println( "f = " + f );
        System.out.println( "g = " + g );
        // f.add(g);
        Fraction sum = new Fraction();
        sum.add(f,g); // here you add g to f, changing f
        // Fraction sum = Fraction.add(f, g); // the sum of f+g gets stored into sum
        System.out.print(f + " + " + g + " = " + sum + " = ");
        System.out.println(sum.toDecimal());
        System.out.println("sum.equals(h) = " + f.equals(g));
        System.out.println("f.compareTo(g) = " + f.compareTo(g));
    }
}

