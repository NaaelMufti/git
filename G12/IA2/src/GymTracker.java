import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;
import java.io.*;

public class GymTracker {
    static ArrayList<Exercise> exercises = new ArrayList<Exercise>();
    static ArrayList<Session> sessions = new ArrayList<Session>();

    static Scanner input = new Scanner(System.in);


    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Exercise");
            System.out.println("2. Add Session");
            System.out.println("3. View Exercises");
            System.out.println("4. View Sessions");
            System.out.println("5. Search Exercises");
            System.out.println("6. Sort Exercises");
            System.out.println("7. Export Sessions");
            System.out.println("8. Load Sessions");
            System.out.println("9. Exit");

            int choice = input.nextInt();

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
                    break;
                case 9:
                    input.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }

    public static void addExercise() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter exercise name: ");
        String name = input.nextLine();

        System.out.print("Enter muscle group: ");
        String muscleGroup = input.nextLine();

        System.out.print("Enter weight/resistance: ");
        double weight = input.nextDouble();

        System.out.print("Enter number of sets: ");
        int sets = input.nextInt();

        System.out.print("Enter number of reps: ");
        int reps = input.nextInt();

        Exercise exercise = new Exercise(name, muscleGroup, weight, sets, reps);
        exercises.add(exercise);

        System.out.println("Exercise added successfully.");
    }

    public static void addSession() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter session date: ");
        String date = input.nextLine();

        ArrayList<Exercise> sessionExercises = new ArrayList<Exercise>();
        while (true) {
            System.out.print("Enter exercise name (or 'q' to finish): ");
            String exerciseName = input.nextLine();

            if (exerciseName.equalsIgnoreCase("q")) {
                break;
            }

            boolean found = false;
            for (Exercise exercise : exercises) {
                if (exercise.getName().equalsIgnoreCase(exerciseName)) {
                    sessionExercises.add(exercise);
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Exercise not found. Please try again.");
            }
        }
        Session session = new Session(date, new ArrayList<Exercise>());
        sessions.add(session);
        System.out.println("Session added successfully.");
    }

    public static void viewExercises() {
        for (Exercise exercise : exercises) {
            System.out.println(exercise);
        }
    }

    public static void viewSessions() {
        for (Session session : sessions) {
            System.out.println(session);
        }
    }

    public static void searchExercises() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter exercise name: ");
        String name = input.nextLine();

        for (Exercise exercise : exercises) {
            if (exercise.getName().contains(name)) {
                System.out.println(exercise);
            }
        }
    }

    public static void sortExercises() {
        exercises.sort((e1, e2) -> e1.getMuscleGroup().compareTo(e2.getMuscleGroup()));
        System.out.println("Exercises sorted by muscle group.");
    }

    public static void exportSessions() throws IOException {
        System.out.println("Exporting Sessions...");
        File sessionsFile = new File("GymSessions.csv");
        FileWriter fw = new FileWriter(sessionsFile);
        PrintWriter export = new PrintWriter(fw);
        export.print("Date, Exercise, Muscle Group, Weight, Sets, Reps \n");
        for (Session i : sessions) {
            export.print("\n");
            for (Exercise s : i.getExercises()) {
                export.print(i.getDate() + ",");
                export.print(s.getName() + ",");
                export.print(s.getMuscleGroup() + ",");
                export.print(s.getWeight() + ",");
                export.print(s.getSets() + ",");
                export.print(s.getReps() + ",");
                export.print("\n");
            }
        }
        export.close();
        System.out.println("Sessions Exported.");
    }
    public static void loadSessions(String fileName) throws FileNotFoundException {
        ArrayList<Session> sessions = new ArrayList<>();
        Scanner sc = new Scanner(new File("GymSessions.csv"));
        sc.nextLine();
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] parts = line.split(",");
            String date = parts[0];
            ArrayList<Exercise> exercises = new ArrayList<>();
            for (int i = 1; i < parts.length; i += 5) {
                String exerciseName = parts[i];
                String muscleGroup = parts[i + 1];
                double weight = Double.parseDouble(parts[i + 2]);
                int sets = Integer.parseInt(parts[i + 3]);
                int reps = Integer.parseInt(parts[i + 4]);
                Exercise exercise = new Exercise(exerciseName, muscleGroup, weight, sets, reps);
                exercises.add(exercise);
            }
            Session session = new Session(date, exercises);
            sessions.add(session);
        }
        sc.close();
        System.out.println("Sessions have been successfully loaded.");
    }
}

class Exercise {
    private String name;
    private String muscleGroup;
    private double weight;
    private int sets;
    private int reps;


    public Exercise(String name, String muscleGroup, double weight, int sets, int reps)
    {
        this.name = name;
        this.muscleGroup = muscleGroup;
        this.weight = weight;
        this.sets = sets;
        this.reps = reps;

    }

    public String getName() {
        return name;
    }

    public String getMuscleGroup() {
        return muscleGroup;
    }

    public double getWeight() {
        return weight;
    }

    public int getSets() {
        return sets;
    }

    public int getReps() {
        return reps;
    }



    @Override
    public String toString() {
        return "Name: " + name + ", Muscle Group: " + muscleGroup + ", Weight: " + weight + ", Sets: " + sets + ", Reps: " + reps;
    }
}

class Session {
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