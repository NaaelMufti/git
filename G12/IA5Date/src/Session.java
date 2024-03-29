import java.io.*;
import java.util.ArrayList;

public class Session implements Serializable
{
    private Date date; // dependency with Date class
    private ArrayList<Exercise> exercises;

    public Session(Date date, ArrayList<Exercise> exercises)
    {
        this.date = date;
        this.exercises = exercises;
    }

    public Date getDate()
    {
        return date;
    }

    public ArrayList<Exercise> getExercises()
    {
        return exercises;
    }

    public static void addSession()
    {

        Date date = new Date(); // using Date data type from Date class
        // instantiate variables outside of while loop
        int day;
        int month;
        int year;

        while (true) // validate year is between 2022 and 2150
        {
            year = IBIO.inputInt("Enter the year (XXXX format): ");
            if (Date.isValidYear(year) == false)
            {
                System.out.println("Invalid year. Enter the year in the 4 digit format between 2000 and 2200. ");
                continue;
            }
            break;
        }

        while (true) // validate month entered is between 1 and 12
        {
            month = IBIO.inputInt("Enter the month of the year (numeric): ");
            if (Date.isValidMonth(month) == false)
            {
                System.out.println("Invalid month. Enter a value between 1 and 12.");
                continue;
            }
            break;
        }

        while (true) // validate date entered fits within each month's total number of days
        {
            day = IBIO.inputInt("Enter the day of the month: ");
            if (Date.isValidDay(day, month, year) == false)
            {
                System.out.println("Invalid day. Enter a value between 1 and " + Date.daysinMonth(month, year) + ".");
                continue;
            }
            break;
        }

        try // try catch for setting date for each session
        {
            date.setDate(day, month, year);
        } catch (Exception e)
        {
            throw new RuntimeException(e);
        }

        ArrayList<Exercise> sessionExercises = new ArrayList<Exercise>();

        while (true)
        {

            String exerciseName = IBIO.inputString("Enter exercise name (or '0' to finish): ");

            if (exerciseName.equalsIgnoreCase("0"))
            {
                break;
            }

            boolean found = false; // check if the exercise can be found
            for (Exercise exercise : GymTracker.exercises)
            {
                if (exercise.getName().equalsIgnoreCase(exerciseName))
                {
                    sessionExercises.add(exercise);
                    found = true;
                    break;
                }
            }
            if (!found)
            {
                System.out.println("Exercise not found. Please try again.");
            }
        }
        Session session = new Session(date, sessionExercises);
        GymTracker.sessions.add(session);
        System.out.println("Session added successfully.");
    }


    public static void viewSessions()
    {
        for (Session session : GymTracker.sessions)
        {
            System.out.println(session);
        }
    }

    public static void saveSessions() // serialization
    {
        // you can change the file name here AND in the loadSessions method if you want to change the name of the file
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("GymSessions.ser")))
        {
            oos.writeObject(GymTracker.sessions);
            System.out.println("Sessions saved successfully.");
        } catch (Exception e) {
            System.out.println("Error saving sessions.");
            e.printStackTrace();
        }
    }

    public static void loadSessions()
    {
        try
        {
            FileInputStream fileIn = new FileInputStream("GymSessions.ser"); // change file name here
            ObjectInputStream in = new ObjectInputStream(fileIn);
            GymTracker.sessions = (ArrayList<Session>) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException i)
        {
            i.printStackTrace();
            return;
        } catch (ClassNotFoundException c)
        {
            System.out.println("Session class not found");
            c.printStackTrace();
            return;
        }
        System.out.println("Sessions Loaded");
        try
        {
            GymTracker.main(null); // call main method after loading the sessions
        } catch (IOException e)
        {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() // polymorphism
    {
        StringBuilder sb = new StringBuilder();
        sb.append("Date: " + date + "\n");
        for (Exercise exercise : exercises)
        {
            sb.append(exercise + "\n");
        }
        return sb.toString();
    }
}