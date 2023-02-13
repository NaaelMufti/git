import java.io.*;
import java.util.ArrayList;

class Session implements Serializable {
    private String date;
    private ArrayList<Exercise> exercises;

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
        try {
            FileInputStream fileIn = new FileInputStream("GymSessions.ser"); // change file name here
            ObjectInputStream in = new ObjectInputStream(fileIn);
            GymTracker.sessions = (ArrayList<Session>) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException i) {
            i.printStackTrace();
            return;
        } catch (ClassNotFoundException c) {
            System.out.println("Session class not found");
            c.printStackTrace();
            return;
        }
        System.out.println("Sessions Loaded");
        try
        {
            GymTracker.main(null); // call main method after loading the sessions
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
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