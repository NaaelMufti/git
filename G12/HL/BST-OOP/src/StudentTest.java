import java.io.*;
import java.util.*;

public class StudentTest
{
    public static BNode treeID;
    public static BNode treeName;

    public static void insertByID(BNode node, Student data)
    {

    }

    public static void insertByName(BNode node, Student data)
    {

    }

    public static void preOrder(BNode node)
    {

    }

    public static void inOrder(BNode node)
    {

    }

    public static void postOrder(BNode node)
    {

    }

    public static void descending(BNode node)
    {

    }


    public static void main (String args[]) throws IOException
    {
        System.out.println();
        load();  // load student list from disk and insert by ID
        System.out.println();
        load2(); // load student list from disk and insert by name
        System.out.println("\nBST by ID ========");
        System.out.println("*pre-order:");
        //preOrder(treeID);
        System.out.println("\n*in-order:");
        //inOrder(treeID);
        System.out.println("\n*post-order:");
        //postOrder(treeID);
        System.out.println("\n*descending order:");
        //descending(treeID);

        System.out.println("\nBST by Name ======");
        System.out.println("*pre-order:");
        //preOrder(treeName);
        System.out.println("\n*in-order:");
        //inOrder(treeName);
        System.out.println("\n*post-order:");
        //postOrder(treeName);
        System.out.println("\n*descending order:");
        //descending(treeName);
    }


    public static void load() throws IOException
    {
        int id;
        String name;
        Student newNode;
        File file = new File("student_data.txt");
        Scanner in = new Scanner(file);
        while( in.hasNext() )
        {	String temp = in.nextLine();
            String[]line = temp.split(",");
            id = Integer.parseInt(line[0]);
            name = line[1];
            newNode = new Student(id, name);
            insertByID(treeID, newNode);
        } // end while
        in.close();
        //System.out.println("Data loaded from file.\n");
    }

    public static void load2() throws IOException
    {
        int id;
        String name;
        Student newNode;
        File file = new File("student_data.txt");
        Scanner in = new Scanner(file);
        while( in.hasNext() )
        {	String temp = in.nextLine();
            String[]line = temp.split(",");
            id = Integer.parseInt(line[0]);
            name = line[1];
            newNode = new Student(id, name);
            insertByName(treeName, newNode);
        } // end while
        in.close();
        //System.out.println("Data loaded from file.\n");
    }

}
