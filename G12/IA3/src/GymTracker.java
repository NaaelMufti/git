import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;
import java.io.*;

public class GymTracker implements Serializable {
    static ArrayList<Exercise> exercises = new ArrayList<Exercise>();
    static ArrayList<Session> sessions = new ArrayList<Session>();

    public static void main(String[] args) throws IOException, ClassNotFoundException {


        while (true) {
            System.out.println("1. Add Exercise");
            System.out.println("2. Add Session");
            System.out.println("3. View Exercises");
            System.out.println("4. View Sessions");
            System.out.println("5. Search Exercises");
            System.out.println("6. Sort Exercises");
            System.out.println("7. Save Sessions");
            System.out.println("8. Load Sessions");
            System.out.println("9. Exit");

            int choice = IBIO.inputInt();

            switch (choice) {
                case 1:
                    addExercise();
                    break;
                case 2:
                    addSession();
                    break;
                case 3:
                    viewExercises();
                    break;
                case 4:
                    viewSessions();
                    break;
                case 5:
                    searchExercises();
                    break;
                case 6:
                    sortExercises();
                    break;
                case 7:
                    exportSessions();
                    break;
                case 8:
                    loadSessions("GymSessions.csv");
                case 9:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }

    public static void addExercise()
    {

        String name = IBIO.inputString("Enter exercise name: ");
        String muscleGroup = IBIO.inputString("Enter muscle group: ");
        double weight = IBIO.inputDouble("Enter weight/resistance: ");
        int sets = IBIO.inputInt("Enter number of sets: ");
        int reps = IBIO.inputInt("Enter number of reps: ");

        Exercise exercise = new Exercise(name, muscleGroup, weight, sets, reps);
        exercises.add(exercise);

        System.out.println("Exercise added successfully.");
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
            for (Exercise exercise : exercises)
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
        sessions.add(session);
        System.out.println("Session added successfully.");
    }

    public static void viewExercises()
    {
        for (Exercise exercise : exercises) {
            System.out.println(exercise);
        }
    }

    public static void viewSessions()
    {
        for (Session session : sessions) {
            System.out.println(session);
        }
    }

    public static void searchExercises()
    {
        Scanner input = new Scanner(System.in);
        String name = IBIO.inputString("Enter exercise name: ");

        for (Exercise exercise : exercises)
        {
            if (exercise.getName().contains(name))
            {
                System.out.println(exercise);
            }
        }
    }

    public static void sortExercises()
    {
        int n = exercises.size();
        for (int i = 0; i < n-1; i++)
        {
            int minIndex = i;
            for (int j = i + 1; j < n; j++)
            {
                if (exercises.get(j).getMuscleGroup().compareTo(exercises.get(minIndex).getMuscleGroup()) < 0)
                {
                    minIndex = j;
                }
            }
            Exercise temp = exercises.get(minIndex);
            exercises.set(minIndex, exercises.get(i));
            exercises.set(i, temp);
        }
        System.out.println("Exercises sorted by muscle group.");
    }


    public static void exportSessions()
    {
        try {
            FileOutputStream fos = new FileOutputStream("GymSessions.csv");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(sessions);
            oos.close();
            fos.close();
        } catch (IOException ioe)
        {
            ioe.printStackTrace();
        }
    }

    public static void loadSessions(String filename) throws IOException
    {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename)))
        {
            sessions = (ArrayList<Session>) ois.readObject();
            System.out.println("Sessions loaded successfully.");
            main(null);
        } catch (ClassNotFoundException e)
        {
            System.out.println("Could not find class.");
        }
    }
}

