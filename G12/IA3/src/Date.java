/*
 * Date class
 * by mdv 2016, 2019, 2020
 * Ideas taken from
 * http://www.java2s.com/Tutorial/Java/0040__Data-Type/Getcurrentdateyearandmonth.htm
 * http://www.sunshine2k.de/articles/coding/datediffindays/calcdiffofdatesindates.html
 */


import java.io.Serializable;
import java.util.*;

public class Date implements Serializable
{

    private int day;
    private int month;
    private int year;

    public Date()
    {
        Calendar now = Calendar.getInstance();
        day = now.get(Calendar.DATE);
        month = now.get(Calendar.MONTH) + 1;
        year = now.get(Calendar.YEAR);
    }

    public Date(int d, int m, int y) throws Exception
    {
        if (!isValidDate(d, m, y))
        {
            throw new Exception("Invalid date");
        } else
        {
            day = d;
            month = m;
            year = y;
        }
    }

    public Date(String dateString) throws Exception
    {
        int d = 0, m = 0, y = 0;
        dateString = dateString.replace('/', ' ');
        Scanner scanner = new Scanner(dateString);
        try
        {
            d = scanner.nextInt();
            m = scanner.nextInt();
            y = scanner.nextInt();
            scanner.close();
        } catch (Exception e)
        {
            throw new Exception("Invalid date format");
        }
        if (isValidDate(d, m, y))
        {
            day = d;
            month = m;
            year = y;
        } else
        {
            throw new Exception("Invalid date");
        }
    }

    public int getDay()
    {
        return day;
    }

    public int getMonth()
    {
        return month;
    }

    public int getYear()
    {
        return year;
    }

    public void setDay(int d) throws Exception
    {
        int m = this.getMonth(); // to abbreviate the if statements
        int y = this.getYear();
        if (d < 1 || d > 31)
        {
            throw new Exception("Invalid day");
        }
        if (m == 4 && d > 30 || m == 6 && d > 30 || m == 9 && d > 30 || m == 11 && d > 30)
        {
            throw new Exception("Invalid day for month");
        }
        day = d;
    }

    public void setMonth(int m) throws Exception
    {
        if (!isValidMonth(m))
        {
            throw new Exception("Invalid month");
        } else
        {
            month = m;
        }
    }

    public void setYear(int y) throws Exception
    {
        if (!isValidYear(y))
        {
            throw new Exception("Invalid year");
        } else
        {
            year = y;
        }
    }

    public void setDate(int d, int m, int y) throws Exception
    {
        this.setDay(d);
        this.setMonth(m);
        this.setYear(y);
    }

    public String toString()
    {
        String output = day + "/" + month + "/" + year;
        return output;
    }

    public static Date stringToDate(String dateString) throws Exception
    {
        Date date = new Date(dateString);
        return date;
    }

    public static boolean isValidMonth(int month)
    {
        return (month >= 1 && month <= 12);
    }

    public static boolean isValidYear(int year)
    {
        return (year >= 2000 && year <= 2200); // reasonable range of years from past, and future years
    }


    public static int daysinMonth(int month, int year)
    {
        if (month == 1)
        {
            return 31;
        } else if (month == 2)
        {
            return 29; // taking into account leap years
        } else if (month == 3)
        {
            return 31;
        } else if (month == 4)
        {
            return 30;
        } else if (month == 5)
        {
            return 31;
        } else if (month == 6)
        {
            return 30;
        } else if (month == 7)
        {
            return 31;
        } else if (month == 8)
        {
            return 31;
        } else if (month == 9)
        {
            return 30;
        } else if (month == 10)
        {
            return 31;
        } else if (month == 11)
        {
            return 30;
        } else if (month == 12)
        {
            return 31;
        } else
        {
            return -1; // invalid DOTM
        }
    }

    public static Date getCurrentDate() throws Exception
    {
        Calendar now = Calendar.getInstance();
        int d = now.get(Calendar.DATE);
        int m = now.get(Calendar.MONTH) + 1;
        int y = now.get(Calendar.YEAR);
        Date today = new Date(d, m, y);
        return today;
    }

    public static boolean isValidDay(int day, int month, int year) // if day matches with month total
    {
        return (day >= 1 && day <= daysinMonth(month, year));
    }

    public static boolean isValidDate(int day, int month, int year)
    {
        return (isValidYear(year) && isValidMonth(month) && isValidDay(day, month, year));
    }




}
