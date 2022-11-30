import java.util.Scanner;

public class Quadratic
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter value of a: ");
        double a = in.nextInt();
        System.out.println("Enter value of b: ");
        double b = in.nextInt();
        System.out.println("Enter value of c: ");
        double c = in.nextInt();
        double disc = (b*b)-(4*a*c);

        if (disc > 0)
        {
            double negB = (-1*b);
            double root = Math.sqrt((b*b)-(4*a*c));
            double denom = (2*a);
            double ans1 = (negB + root)/denom;
            double ans2 = (negB - root)/denom;
            System.out.println("There are 2 real solutions: " + ans1 + " , " + ans2);
        }
        if (disc == 0)
        {
            double negB = (-1*b);
            double denom = (2*a);
            double ans = negB/denom;
            System.out.println("There is 1 real solution: " + ans);
        }
        if (disc < 0)
        {
            double negB = (-1*b);
            double denom = (2*a);
            double root = Math.sqrt(Math.abs((b*b)-(4*a*c)));
            String rt = Double.toString(root);
            rt = negB/denom + " ± (" + rt + "i)/" + denom;
            System.out.println(rt);
        }
    }
}
