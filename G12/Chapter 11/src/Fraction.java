/*
 * Fraction.java
 *
 * Only 1.1, remember the concepts
 * Software-as-a-Service (google)
 * create own tables (hodder textbook), pros and cons of implementation
 * advantages and disadvantages of SAS
 * pilot -> system finished, have marketting team test new system, then release out to organisation
 * steps of data migration -> plan, migrate, validate
 * use revision.doc file, only has systems life cycle tho
 * data migration
 * How you can prevent data loss, catastrophic accidental data loss,
 * Not ransomware, because that is just encrypting data and asking for ransom
 * consequences of data loss; time, money, lose customers because of data loss, reputation
 * diff between patches, upgrades, updates, releases
 * not gonna ask about releases
 * patch is small -> bug fixes and should be free
 * no 1.2
 * What is a constructor -> must have same name of class, no return value, instantiate and initialise,
 * No OOP in the test
 *
 * IA -> is technical documentation, comments things like that
 *
 * Semester Exam: Problem with inheritence is if error in super class, trickle down to subclasses
 * Paper 2, fill up with 1.2, nothing on networking, most of it on OOP
 * Possible question? : impact of open standards and protocols -> wouldn't have internet without it.
 * IT topics of ethical and social significance
 * Privacy and anonymity, difference between both
 */

import java.util.Scanner;

public class Fraction
{
    // attributes or instance variables/fields (data)
    private int num;    // private = you can't touch this!
    private int den;    // ...outside of the Fraction class.

    // empty constructor (no parameters/arguments)
    public Fraction()
    {
        this.num = 0;
        this.den = 1;
    } //empty constructor - no need to create empty fraction


    public Fraction(int num, int den) throws Exception // custom constructor
    {
        if (den == 0)
        {
            throw new Exception("Fraction denominator cannot be zero");
        }
        this.num = num;
        this.den = den;
        this.simplify();
    }
    // these constructors are overloaded

    // encapsulation examples
    // accessor method ('getter')
    public int getNum()
    {
        return this.num;
    }

    // mutator/modifier method ('setter')
    public void setNum(int num)
    {
        this.num = num;
    }

    public int getDen()
    {
        return this.den;
    }

    public void setDen(int den) throws Exception
    {
        if (den == 0)
        {
            throw new Exception("Fraction denominator cannot be zero");
        }
        this.den = den;
    }

	/*
	public void add(Fraction f)
	{
		int n = this.num * f.den;
		int d = this.den * f.num;
		int tn = n + d;
		int td = this.den * f.den;
		this.num = tn;
		this.den = td;
		this.simplify();
	}
	*/

	/*
	public void add(Fraction f, Fraction g) throws Exception
	{
		int n = f.num * g.den;
		int d = f.den * g.num;
		int tn = n + d;
		int td = f.den * g.den;
		this.setNum(tn);
		this.setDen(td);
		this.simplify();
	}
	*/

    public Fraction add(Fraction f, Fraction g) throws Exception
    {
        int n = this.num * g.den;
        int d = this.den * g.num;
        int tn = n + d;
        int td = this.den * g.den;
        Fraction result = new Fraction(tn, td);
        result.simplify();
        return result;
    }

	/*
    public Fraction add(Fraction f)
    {
        int n = this.num * f.den;
        int d = this.den * f.num;
        int tn = n + d;
        int td = this.den * f.den;
        Fraction result = new Fraction(tn, td);
        result.simplify();
        return result;
    }
    */

    // calculate the GCD to simplify a fraction
    private static int gcd(int n, int m)
    {
        if (n == m)
        {
            return n;
        } else
        {
            while (n != m)
            {
                if (n < m)
                    m = m - n;
                else
                    n = n - m;
            }
        }
        return n;
    }

    public void simplify() // simplify
    {
        int gcd = gcd(this.num, this.den);
        this.num = this.num / gcd;
        this.den = this.den / gcd;
    }

    public double toDecimal()
    {
        return (double) this.num / this.den;
    }

    public boolean equals(Fraction f)
    {
        return this.toDecimal() == f.toDecimal();
    }

    public double compareTo(Fraction f)
    {
        return this.toDecimal() - f.toDecimal();
    }

    // polymorphism -- overloading Object's toString()
    public String toString()
    {
        return this.num + "/" + this.den;
    }


}

