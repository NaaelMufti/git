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


public class Fraction
{
	// attibutes or instance variables/fields (data)
	private int num;	// private = you can't touch this!
	private int den;	// ...outside of the Fraction class.
	
	// empty constructor (no parameters/arguments)
	public Fraction()
	{
		this.num = 0;
		this.den = 1;
	} // empty constructor
	
	public Fraction(int num, int den) // custom constructor
	{
		this.num = num;
		this.den = den;
	}
	// these constructors are overloaded
	
	// encapsulation examples
	// accessor method ('getter')
	public int getNum()
	{	return this.num;
	}
	
	// mutator/modifier method ('setter')
	public void setNum(int num)
	{
		this.num = num;
	}
	
	public int getDen()
	{	return this.den;
	}
	
	public void setDen(int den)
	{	this.den = den;
	}
	
	// polymorphism -- overloading Object's toString()
	public String toString()
	{
		return this.num + "/" + this.den;
	}
	


}

