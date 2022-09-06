import java.util.Date;

public class AnimalTesting
{
    public static void main(String[] args)
    {
        Animal fido = new Animal("Joe", 2020);
        System.out.println(fido); // toString testing
        fido.setName("Fido");
        fido.setYearOfBirth(2019);
        System.out.println(fido);
        System.out.println(fido.getName() + "\t" +
                fido.getYearOfBirth());

        Dog pluto = new Dog("Pluto", 2012, 20);
        pluto.setAgeInDogYears(40);
        System.out.println(pluto);
        System.out.println(pluto.getName() + "'s age: " + pluto.getAgeInDogYears());

        Dog killer = new Dog("Cujo", 2018);
        System.out.println(killer);
    }
}
