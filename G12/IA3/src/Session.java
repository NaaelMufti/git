import java.io.Serializable;
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