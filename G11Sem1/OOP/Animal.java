public class Animal
{
    private String name;
    private int yearOfBirth;

    public Animal() { }

    public Animal(String name, int yearOfBirth)
    {   this.setName(name);
        this.setYearOfBirth(yearOfBirth);
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


}
