public class Vehicle
{
    // abstraction
    // data hiding and encapsulation
    // encapsulation = attributes & methods in their own class
    private String make;
    private String model;

    // constructors (overloaded)
    public Vehicle ()
    {

    }

    // custom constructor
    public Vehicle(String make, String model)
    {
        this.make = make;
        this.model = model;
    }

    // accessor
    public String getMake()
    {
        return make;
    }

    // mutator
    public void setMake(String make)
    {
        this.make = make;
    }

    // accessor
    public String getModel()
    {
        return model;
    }

    // mutator
    public void setModel(String model)
    {
        this.model = model;
    }

    @Override
    public String toString()
    {
        return "Vehicle{" + "make='" + make + '\'' + ", model='" + model + '\'' + '}';
    }

    // polymorphism, too
    public boolean equals(Vehicle two)
    {
        return this.make.equalsIgnoreCase(two.make) &&
                this.model.equalsIgnoreCase(two.model);
    }

    /*
    public static void main(String[] args)
    {
        Vehicle carLuigi = new Vehicle("Subaru", "WRX");

        System.out.println("To String testing:");
        System.out.println(carLuigi);
        System.out.println("");

        System.out.println("Setters and Getters Testing");
        carLuigi.setMake("Mazda");
        carLuigi.setModel("RX7FC3S");
        System.out.println(carLuigi.getMake());
        System.out.println(carLuigi.getModel());
    }
     */
}
