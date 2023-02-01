import java.io.Serializable;

public class Exercise implements Serializable
{
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

    // getters
    public String getName()
    {
        return name;
    }

    public String getMuscleGroup()
    {
        return muscleGroup;
    }

    public double getWeight()
    {
        return weight;
    }

    public int getSets()
    {
        return sets;
    }

    public int getReps()
    {
        return reps;
    }

    public static void addExercise()
    {
        // initialize variables outside of loops
        String name = "";
        String muscleGroup = "";
        double weight;
        int sets;
        int reps;

        while (name.equals("")) // input validation -> presence check
        {
            name = IBIO.inputString("Enter exercise name: ");
            if (name.equals(""))
                System.out.println("Exercise name cannot be empty. Please enter a valid exercise name.");
        }

        while (muscleGroup.equals("")) // input validation -> presence check
        {
            muscleGroup = IBIO.inputString("Enter muscle group: ");
            if (muscleGroup.equals(""))
                System.out.println("Muscle group cannot be empty. Please enter a valid muscle group.");
        }

        while (true) // validate weight is between 1 and 1000
        {
            weight = IBIO.inputDouble("Enter weight/resistance (kg): ");
            if (weight < 1 || weight >= 1000)
            {
                System.out.println("Invalid weight. Enter a number between 1 and 1000 for the weight.");
                continue;
            }
            break;
        }

        while (true) // validate sets is between 1 and 15
        {
            sets = IBIO.inputInt("Enter number of sets: ");
            if (sets < 1)
            {
                System.out.println("Invalid number of sets. Enter an integer between 1 and 15");
                continue;
            }
            else if (sets > 15)
            {
                System.out.println("A number of sets this high is unhealthy and could lead to injury, please use between 1 and 15 sets");
                continue;
            }
            break;
        }

        while (true) // validate reps is between 1 and 25
        {
            reps = IBIO.inputInt("Enter number of reps: ");
            if (reps < 1)
            {
                System.out.println("Invalid number of reps. Enter a number between 1 and 25");
                continue;
            }
            else if (reps > 25)
            {
                System.out.println("A number of reps this high is unhealthy and could lead to injury, please use between 1 and 25 reps");
                continue;
            }
            break;
        }


        Exercise exercise = new Exercise(name, muscleGroup, weight, sets, reps);
        GymTracker.exercises.add(exercise);

        System.out.println("Exercise added successfully.");
    }

    public static void viewExercises()
    {
        for (Exercise exercise : GymTracker.exercises)
        {
            System.out.println(exercise);
        }
    }

    public static void searchExercises() // searching for exercise using binary search
    {
        String searchTerm = IBIO.inputString("Enter the name of the exercise to search for: ");
        int low = 0;
        int high = GymTracker.exercises.size() - 1;
        int mid;
        boolean found = false;

        while (low <= high)
        {
            mid = (low + high) / 2;
            int compareResult = searchTerm.compareTo(GymTracker.exercises.get(mid).getName());
            if (compareResult == 0)
            {
                found = true;
                System.out.println("Exercise found: " + GymTracker.exercises.get(mid));
                break;
            }
            else if (compareResult < 0)
            {
                high = mid - 1;
            }
            else
            {
                low = mid + 1;
            }
        }
        if (!found)
        {
            System.out.println("Exercise not found.");
        }
    }

    public static void sortExercises() // sort using Selection Sort
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
            Exercise temp = GymTracker.exercises.get(minIndex); // temporary variable used to swap exercises
            GymTracker.exercises.set(minIndex, GymTracker.exercises.get(i));
            GymTracker.exercises.set(i, temp);
        }
        System.out.println("Exercises sorted by muscle group.");
    }

    @Override
    public String toString() // simple polymorphism
    {
        return "Name: " + name + ", Muscle Group: " + muscleGroup + ", Weight: " + weight + ", Sets: " + sets + ", Reps: " + reps;
    }
}

