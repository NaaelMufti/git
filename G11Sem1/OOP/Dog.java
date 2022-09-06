import java.util.Date;

public class Dog extends Animal
{
    private int ageInDogYears;

    public Dog(String name, int yearOfBirth, int ageInDogYears)
    {
        super(name, yearOfBirth);
        this.ageInDogYears = ageInDogYears;
    }

    public Dog(String name, int yearOfBirth)
    {
        super(name, yearOfBirth);
        this.setAgeInDogYears();
    }

    public int getAgeInDogYears()
    {
        return ageInDogYears;
    }

    public void setAgeInDogYears(int ageInDogYears)
    {
        this.ageInDogYears = Math.abs(ageInDogYears);
    }

    public void setAgeInDogYears()
    {
        this.ageInDogYears = this.calculateAgeInDogYears();
    }

    public int calculateAgeInDogYears()
    {
        Date currentDate = new Date(); // get current date
        int currentYear = currentDate.getYear() + 1900;
        //System.out.println(currentYear + " " + this.getYearOfBirth());
        return (currentYear-this.getYearOfBirth()) * 5;
    }

    @Override
    public String toString()
    {
        return super.toString() +
                " | ageInDogYears=" + ageInDogYears;
    }
}
