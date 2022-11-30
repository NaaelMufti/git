import java.util.Arrays;

public class Zoo
{
    private String zooName;
    private Animal[] animals; // association
    private int lastIndex;

    public Zoo(String zooName, Animal[] animals)
    {
        this.zooName = zooName;
        this.animals = animals;
        for(Animal a : animals)
        {
            if(a != null)
            {
                lastIndex++;
            }
        }
    }

    public Zoo(String zooName)
    {
        this.zooName = zooName;
        this.lastIndex = 0;
    }

    public Zoo(Animal[] animals)
    {
        this.animals = animals;
    }

    public String getZooName()
    {
        return zooName;
    }

    public void setZooName(String zooName)
    {
        this.zooName = zooName;
    }

    public Animal[] getAnimals() // access to the whole array, but can't access individual one
    {
        return animals;
    }

    public Animal getAnimal(int index) //gets one animal from teh array
    {
        if (index >= 0 && index < animals.length && animals[index] != null)
        {
            return animals[index];
        }
        else
        {
            System.out.println("getAnimal(index) error in index");
        }
        return null;
    }

    public void setAnimals(Animal[] animals)
    {
        this.animals = animals;
    }

    public void setAnimal(int index, Animal animal) // Capital A is data type, animal is variable
    {
        if(index >= 0 && index < animals.length)
        {
            this.animals[index] = animal;
        }
        else
        {
            System.out.println("setAnimals(index, animal) error in Index");
        }
    }

    public int getLastIndex() // for saving an array need to save number of populated stuff in array
    {
        return lastIndex;
    }

    public boolean add(Animal newAnimal) // never delete anyone, instead add attribute like "boolean: alive" etc //
    {
        if(animals[lastIndex] == null)
        {
            animals[lastIndex] = newAnimal;
            lastIndex++;
            return true;
        }
        else
        {
            return false;
        }
    }


    @Override
    public String toString() // outputs the whole array, but lose control of formatting
    {
        return "Zoo{" +
                "zooName='" + zooName + '\'' +
                ", animals=" + Arrays.toString(animals) +
                '}';
    }

}

