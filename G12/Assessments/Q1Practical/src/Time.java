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
}
