import java.util.Date;

public class AnimalTesting
{
    public static void main(String[] args)
    {
        Animal fido = new Animal("Joe", 2020);
        System.out.println(fido); // toString testing
        System.out.println("--------------------------------------------------");
        fido.setName("Fido");
        fido.setYearOfBirth(2019);
        System.out.println(fido);
        System.out.println(fido.getName() + "\t" +
                fido.getYearOfBirth());
        System.out.println("--------------------------------------------------");

        Dog pluto = new Dog("Pluto", 2012, 20);
        pluto.setAgeInDogYears(40);
        System.out.println(pluto);
        System.out.println(pluto.getName() + "'s age: " + pluto.getAgeInDogYears());
        System.out.println("--------------------------------------------------");

        Dog killer = new Dog("Cujo", 2018);
        System.out.println(killer);
        System.out.println("--------------------------------------------------");

        Cat garfield = new Cat("Garfield", 2017, "long");
        System.out.println(garfield);
        System.out.println("--------------------------------------------------");
    }
}
