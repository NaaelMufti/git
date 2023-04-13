import java.util.Arrays;

public class Parking
{
    // aggregation
    private static final int MAXLOTS = 100;
    private Vehicle[] vehicles = new Vehicle[MAXLOTS]; // new array
    private String address;
    private int parked;

    public Parking(Vehicle[] vehicles, String address)
    {
        this.vehicles = vehicles;
        this.address = address;
    }

    public Parking(String address)
    {
        this.address = address;

        for(int i = 0; i < MAXLOTS; i++) // do this if needs to initialise
        {
            //Vehicle temp = new Vehicle("empty", "empty"); can do this instead of...
            vehicles[i] = null;
        }
    }

    // to do: setters & getters, toString()

    public Vehicle[] getVehicles()
    {
        return vehicles;
    }
    // overloading
    public Vehicle getVehicles(int index)
    {
        return vehicles[index];
    }

    public void setVehicles(Vehicle[] vehicles)
    {
        this.vehicles = vehicles;
    }

    // overloading
    public void setVehicles(Vehicle vehicle, int index)
    {
        this.vehicles[index] = vehicle;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    @Override
    public String toString()
    {
        String output = "Address: " + this.address;
        for(Vehicle v : vehicles)
        {
            output = output + v.toString();
        }
        return output;
    }

    public static void main(String[] args)
    {

    }
}
