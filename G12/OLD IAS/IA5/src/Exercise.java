import java.io.Serializable;
import java.util.Scanner;

class Exercise implements Serializable {
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

    public static void addExercise()
    {

        String name = IBIO.inputString("Enter exercise name: ");
        String muscleGroup = IBIO.inputString("Enter muscle group: ");
        double weight = IBIO.inputDouble("Enter weight/resistance: ");
        int sets = IBIO.inputInt("Enter number of sets: ");
        int reps = IBIO.inputInt("Enter number of reps: ");

        Exercise exercise = new Exercise(name, muscleGroup, weight, sets, reps);
        GymTracker.exercises.add(exercise);

        System.out.println("Exercise added successfully.");
    }

    public static void viewExercises()
    {
        for (Exercise exercise : GymTracker.exercises) {
            System.out.println(exercise);
        }
    }

    public static void searchExercises()
    {
        Scanner input = new Scanner(System.in);
        String name = IBIO.inputString("Enter exercise name: ");

        for (Exercise exercise : GymTracker.exercises)
        {
            if (exercise.getName().contains(name))
            {
                System.out.println(exercise);
            }
        }
    }

    public static void sortExercises()
    {
        int n = GymTracker.exercises.size();
        for (int i = 0; i < n-1; i++)
        {
            int minIndex = i;
            for (int j = i + 1; j < n; j++)
            {
                if (GymTracker.exercises.get(j).getMuscleGroup().compareTo(GymTracker.exercises.get(minIndex).getMuscleGroup()) < 0)
                {
                    minIndex = j;
                }
            }
            Exercise temp = GymTracker.exercises.get(minIndex);
            GymTracker.exercises.set(minIndex, GymTracker.exercises.get(i));
            GymTracker.exercises.set(i, temp);
        }
        System.out.println("Exercises sorted by muscle group.");
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Muscle Group: " + muscleGroup + ", Weight: " + weight + ", Sets: " + sets + ", Reps: " + reps;
    }
}
