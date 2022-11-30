public class ZooTest
{
    public static void main(String[] args)
    {
        Animal myAnimal = new Cat("whiskers", 2020, "long");
        Zoo ofs = new Zoo("OFS");
        ofs.add(myAnimal);
        System.out.println(ofs);
    }
}
