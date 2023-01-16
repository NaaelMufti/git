import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;
import java.io.PrintWriter;

public class GymTracker {
    // HashMap to store exercises and their details
    static HashMap<String, Exercise> exercises = new HashMap<String, Exercise>();
    // ArrayList to store workout sessions
    static ArrayList<Session> sessions = new ArrayList<Session>();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            // Menu options
            System.out.println("1. Add exercise");
            System.out.println("2. Add session");
            System.out.println("3. View exercises");
            System.out.println("4. View sessions");
            System.out.println("5. Search exercises by muscle group");
            System.out.println("6. Export sessions");
            System.out.println("7. Exit");

            System.out.print("Enter choice: ");
            choice = input.nextInt();
            input.nextLine();

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
                    exportSessions();
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 7);
    }

    public static void addExercise() {
        System.out.print("Enter exercise name: ");
        String name = input.nextLine();
        System.out.print("Enter muscle group: ");
        String muscleGroup = input.nextLine();
        System.out.print("Enter weight/resistance used: ");
        double weight = input.nextDouble();
        System.out.print("Enter number of sets: ");
        int sets = input.nextInt();
        System.out.print("Enter number of repetitions: ");
        int reps = input.nextInt();
        input.nextLine();

        Exercise exercise = new Exercise(name, muscleGroup, weight, sets, reps);
        exercises.put(name, exercise);
        System.out.println("Exercise added successfully!");
    }

    public static void addSession() {
        System.out.print("Enter date (dd/mm/yyyy): ");
        String date = input.nextLine();
        ArrayList<Exercise> sessionExercises = new ArrayList<Exercise>();

        String exerciseName;
        do {
            System.out.print("Enter exercise name (or 'done' to finish): ");
            exerciseName = input.nextLine();
            if (!exerciseName.equalsIgnoreCase("done")) {
                Exercise exercise = exercises.get(exerciseName);
                if (exercise == null) {
                    System.out.println("Exercise not found. Please add the exercise first.");
                } else {
                    sessionExercises.add(exercise);
                }
            }
        } while (!exerciseName.equalsIgnoreCase("done"));

        Session session = new Session(date, sessionExercises);
        sessions.add(session);
        System.out.println("Session added successfully!");
    }

    public static void viewExercises() {
        if (exercises.isEmpty()) {
            System.out.println("No exercises found.");
        } else {
            for (Exercise exercise : exercises.values()) {
                System.out.println(exercise);
            }
        }
    }

    public static void viewSessions() {
        if (sessions.isEmpty()) {
            System.out.println("No sessions found.");
        } else {
            for (Session session : sessions) {
                System.out.println(session);
            }
        }
    }

    public static void searchExercises() {
        System.out.print("Enter muscle group: ");
        String muscleGroup = input.nextLine();
        boolean found = false;
        for (Exercise exercise : exercises.values()) {
            if (exercise.getMuscleGroup().equalsIgnoreCase(muscleGroup)) {
                System.out.println(exercise);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No exercises found for muscle group " + muscleGroup);
        }
    }

    public static void exportSessions() {
        if (sessions.isEmpty()) {
            System.out.println("No sessions found.");
        } else {
            System.out.print("Enter file name: ");
            String fileName = input.nextLine();
            try {
                PrintWriter writer = new PrintWriter(fileName + ".txt", "UTF-8");
                for (Session session : sessions) {
                    writer.println(session);
                }
                writer.close();
                System.out.println("Sessions exported successfully to " + fileName + ".txt");
            } catch (Exception e) {
                System.out.println("Error exporting sessions: " + e.getMessage());
            }
        }
    }
}

class Exercise {
    private String name;
    private String muscleGroup;
    private double weight;
    private int sets;
    private int reps;

    public Exercise(String name, String muscleGroup, double weight, int sets, int reps) {
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

    public String toString() {
        return name + " - " + muscleGroup + " - " + weight + " - " + sets + "x" + reps;
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

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(date + "\n");
        for (Exercise exercise : exercises) {
            sb.append(exercise.getName() + " - " + exercise.getSets() + "x" + exercise.getReps() + "\n");
        }
        return sb.toString();
    }
}


