public class Time
{
    private int hours;
    private int minutes;

    public Time()
    {   this.hours = 0;
        this.minutes = 0;
    }

    public Time(int m)
    {   this.hours = 0;
        this.setMinutes(m);
    }

    public Time(int h, int m)
    {   this.setHours(h);
        this.setMinutes(m);
    }

    public int getHours()
    {
        return hours;
    }

    public void setHours(int hours)
    {
        this.hours = hours;
    }

    public int getMinutes()
    {
        return minutes;
    }

    public void setMinutes(int minutes)
    {
        this.minutes = minutes;
    }

    public int toMinutes()
    {
        return this.getHours()*60 + this.getMinutes();
    }

    public boolean equals(Time another)
    {   boolean result = false;
        if(this.toMinutes() == another.toMinutes())
        {   result = true;
        }
        return result;
    }

    public int compareTo(Time another)
    {
        return this.toMinutes() - another.toMinutes();
    }

    public String toString()
    {
        String out = "";
        if(this.getHours() < 10)
        {
            out = "0" + out;
        }
        out = (out + this.getHours() + ":");
        if(this.getMinutes() < 10)
        {
            out = "0" + out;
        }
        out = (out + this.getMinutes());
        return out;
    }
    
}
