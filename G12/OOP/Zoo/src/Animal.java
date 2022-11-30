public class Animal
{
    private String name;
    private int yearOfBirth;
    private boolean isAlive;

    public Animal() { }

    public Animal(String name, int yearOfBirth)
    {   this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    public String getName()
    {   return name;
    }

    public void setName(String name) {   this.name = name; }

    public int getYearOfBirth()
    {   return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth)
    {   this.yearOfBirth = yearOfBirth;
    }


    @Override
    public String toString()
    {   return this.getClass() +
            " | Name: " + name +
            " | year of birth: " + yearOfBirth;
    }

    public void talk()
    {
        System.out.println("Animals don't talk!");
    }

    public void eat()
    {
        System.out.println("This animal starves");
    }
}
