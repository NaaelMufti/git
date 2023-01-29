import java.util.ArrayList;
import java.io.*;
import java.time.*;

public class GymTracker
{
    static ArrayList<Exercise> exercises = new ArrayList<Exercise>();
    static ArrayList<Session> sessions = new ArrayList<Session>();


    public static void main(String[] args) throws IOException
    {

        while (true)
        {
            System.out.println("1. Add Exercise");
            System.out.println("2. Add Session");
            System.out.println("3. View Exercises");
            System.out.println("4. View Sessions");
            System.out.println("5. Search Exercises");
            System.out.println("6. Sort Exercises");
            System.out.println("7. Export Sessions");
            System.out.println("8. Load Sessions");
            System.out.println("9. Exit");

            int choice = IBIO.inputInt();

            switch (choice)
            {
                case 1:
                    Exercise.addExercise();
                    break;
                case 2:
                    Session.addSession();
                    break;
                case 3:
                    Exercise.viewExercises();
                    break;
                case 4:
                    Session.viewSessions();
                    break;
                case 5:
                    Exercise.searchExercises();
                    break;
                case 6:
                    Exercise.sortExercises();
                    break;
                case 7:
                    Session.exportSessions();
                    break;
                case 8:
                    Session.loadSessions("GymSessions.csv");
                    break;
                case 9:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}

