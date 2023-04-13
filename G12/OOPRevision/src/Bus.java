public class Bus extends Vehicle // extends means inheritance
{
    private int passengers;

    public Bus()
    {

    }

    public Bus(String make, String model, int passengers)
    {
        super(make, model); // calls the superclass' constructors
        this.setPassengers(passengers);
    }


    public int getPassengers()
    {
        return passengers;
    }

    public void setPassengers(int passengers)
    {
        this.passengers = passengers;
    }

    @Override
    public String toString()
    {
        return "Bus{" + super.toString() + "passengers=" + passengers + '}';
        // have to add super.toString() cuz doesn't construct automatically
    }
}
