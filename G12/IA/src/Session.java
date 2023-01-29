import java.io.*;
import java.util.ArrayList;

class Session
{
    private String date;
    private ArrayList<Exercise> exercises;

    public Session(String date, ArrayList<Exercise> exercises)
    {
        this.date = date;
        this.exercises = exercises;
    }

    public String getDate()
    {
        return date;
    }

    public ArrayList<Exercise> getExercises()
    {
        return exercises;
    }

    public static void addSession()
    {
        String date = IBIO.inputString("Enter a date: ");

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

        Session session = new Session(date, new ArrayList<Exercise>());
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

    public static void exportSessions() throws IOException
    {
        File sessionsFile = new File("GymSessions.csv");
        FileWriter fw = new FileWriter(sessionsFile);
        PrintWriter export = new PrintWriter(fw);
        export.print("Date, Exercise, Muscle Group, Weight, Sets, Reps \n");
        for (Session i : GymTracker.sessions)
        {
            export.print("\n");
            for (Exercise s : i.getExercises())
            {
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

    public static void loadSessions(String fileName)
    {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null)
            {
                String[] values = line.split(",");
                String date = (values[0]);
                int exerciseId = Integer.parseInt(values[1]);
                int muscleGroup = Integer.parseInt(values[2]);
                int sets = Integer.parseInt(values[3]);
                int reps = Integer.parseInt(values[4]);
                double weight = Integer.parseInt(values[5]);
                GymTracker.sessions.add(new Session(date, new ArrayList<Exercise>()));
            }
        } catch (FileNotFoundException e)
        {
            System.out.println("File not found: " + fileName);
        } catch (IOException e)
        {
            System.out.println("Error reading file: " + fileName);
        } catch (Exception e)
        {
            System.out.println("Error parsing line in file: " + fileName);
        }
    }

    @Override
    public String toString()
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