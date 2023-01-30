import java.io.*;
import java.util.ArrayList;
import java.io.Serializable;


class Session implements Serializable
{
    private Date date;
    private static ArrayList<Exercise> exercises;

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

        // instantiate outside of while loop
        int d;
        int m;

        while (true) // validate date entered is between 1 and 31
        {
            d = IBIO.inputInt("Enter the day of the month: ");
            if (d < 1 || d > 31) {
                System.out.println("Invalid day. Enter a value between 1 and 31.");
                continue;
            }
            break;
        }

        while (true) // validate month entered is between 1 and 12
        {
            m = IBIO.inputInt("Enter the month of the year (numeric): ");
            if (m < 1 || m > 12) {
                System.out.println("Invalid month. Enter a value between 1 and 12.");
                continue;
            }
            break;
        }

        int y = IBIO.inputInt("Enter the year (XXXX format): ");

        try {
            date.setDate(d,m,y);
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

            boolean found = false;
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
        for (Session session : GymTracker.sessions) {
            System.out.println(session);
        }
    }

    public static void saveSessions()
    {
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
            FileInputStream fileIn = new FileInputStream("GymSessions.ser");
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
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Date: " + date + "\n");
        for (Exercise exercise : exercises) {
            sb.append(exercise + "\n");
        }
        return sb.toString();
    }
}


    /*
    public static void saveSessions()
    {
        try {
            FileOutputStream fos = new FileOutputStream("GymSessions.csv");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(GymTracker.sessions);
            oos.close();
            fos.close();
            System.out.println("Sessions saved successfully.");
        } catch (IOException ioe)
        {
            ioe.printStackTrace();
        }

    }

    public static void loadSessions(String filename) throws IOException
    {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename)))
        {
            ArrayList<Session> sessions = (ArrayList<Session>) ois.readObject();
            System.out.println("Sessions loaded successfully.");
            GymTracker.main(null);
        } catch (ClassNotFoundException e)
        {
            System.out.println("Could not find class.");
        }
    }


     */



/*

import java.io.*;
import java.util.ArrayList;

class Session implements Serializable {
    private String date;
    private static ArrayList<Exercise> exercises;

    public Session(String date, ArrayList<Exercise> exercises) {
        this.date = date;
        this.exercises = exercises;
    }

    public String getDate() {
        return date;
    }

    public ArrayList<Exercise> getExercises() {
        return exercises;
    }

    public static void addSession()
    {

        String date = IBIO.inputString("Enter session date: ");

        ArrayList<Exercise> sessionExercises = new ArrayList<Exercise>();
        while (true)
        {

            String exerciseName = IBIO.inputString("Enter exercise name (or 'q' to finish): ");

            if (exerciseName.equalsIgnoreCase("q"))
            {
                break;
            }

            boolean found = false;
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
        for (Session session : GymTracker.sessions) {
            System.out.println(session);
        }
    }




    public static void saveSessions()
    {
        try {
            FileOutputStream fos = new FileOutputStream("GymSessions.csv");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(GymTracker.sessions);
            oos.close();
            fos.close();
            System.out.println("Sessions saved successfully.");
        } catch (IOException ioe)
        {
            ioe.printStackTrace();
        }

    }

    public static void loadSessions(String filename) throws IOException
    {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename)))
        {
            ArrayList<Session> sessions = (ArrayList<Session>) ois.readObject();
            System.out.println("Sessions loaded successfully.");
            GymTracker.main(null);
        } catch (ClassNotFoundException e)
        {
            System.out.println("Could not find class.");
        }
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Date: " + date + "\n");
        for (Exercise exercise : exercises) {
            sb.append(exercise + "\n");
        }
        return sb.toString();
    }
}

 */