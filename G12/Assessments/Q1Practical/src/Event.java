public class Event
{
    private Date eventDate;

    private Time eventTime;

    private String eventLocation;

    private String eventTitle;

    public Event(String eventTitle, String eventLocation, Date eventDate, Time eventTime) // constructor
    {
        this.eventDate = eventDate;
        this.eventTime = eventTime;
        this.eventLocation = eventLocation;
        this.eventTitle = eventTitle;
    }

    public Date getEventDate()
    {
        return eventDate;
    }

    public void setEventDate(Date eventDate)
    {
        this.eventDate = eventDate;
    }

    public Time getEventTime()
    {
        return eventTime;
    }

    public void setEventTime(Time eventTime)
    {
        this.eventTime = eventTime;
    }

    public String getEventLocation()
    {
        return eventLocation;
    }

    public void setEventLocation(String eventLocation)
    {
        this.eventLocation = eventLocation;
    }

    public String getEventTitle()
    {
        return eventTitle;
    }

    public void setEventTitle(String eventTitle)
    {
        this.eventTitle = eventTitle;
    }

    @Override
    public String toString()
    {
        return "Event{" +
                "eventDate=" + eventDate +
                ", eventTime=" + eventTime +
                ", eventLocation='" + eventLocation + '\'' +
                ", eventTitle='" + eventTitle + '\'' +
                '}';
    }
}
