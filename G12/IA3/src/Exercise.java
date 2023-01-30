import java.io.Serializable;

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

    @Override
    public String toString() {
        return "Name: " + name + ", Muscle Group: " + muscleGroup + ", Weight: " + weight + ", Sets: " + sets + ", Reps: " + reps;
    }
}

