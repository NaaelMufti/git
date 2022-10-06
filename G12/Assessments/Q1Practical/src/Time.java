public class Time
{
    private int hours;
    private int minutes;

    public Time()
    {   this.hours = 0;
        this.minutes = 0;
    }

    public Time(int m)
    {
        this.hours = 0;
        this.setMinutes(Math.abs(m));
    }

    public Time(int h, int m)
    {   this.setHours(Math.abs(h));
        this.setMinutes(Math.abs(m));
    }

    public int getHours()
    {
        return hours;
    }


    public void setHours(int hours)
    {
        Math.abs(hours);
        if (hours > 23)
        {
            hours = hours % 24;
        }
        this.hours = hours;
    }

    public int getMinutes()
    {
        return minutes;
    }

    public void setMinutes(int minutes)
    {
        Math.abs(minutes);
        int tempHours = hours;
        if (minutes >= 60)
        {
            tempHours = tempHours + (minutes / 60);
            minutes = (minutes % 60);
        }
        this.minutes = minutes;
        this.setHours(tempHours);
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

    /*
    could do equals like this:
    public boolean equals (Time another)
    {
        return this.toMinutes() == another.toMinutes();
    }
     */
    public int compareTo(Time another)
    {
        return this.toMinutes() - another.toMinutes();
    }

    public String toString()
    {
        String out = "";
        if(this.getHours() < 10)
        {
            out = out + "0";
        }
        out = (out + this.getHours() + ":");
        if(this.getMinutes() < 10)
        {
            out = out + "0";
        }
        out = (out + this.getMinutes());
        return out;
    }

}
