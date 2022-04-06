/*
 *	Practical Test #2 IB Computer Science MDV: Arrays, statistics
 */
import java.util.*;
import java.io.*;

public class PracticeArrayTest
{
	// Array size:
	public static int size(double[] array)
	{
		int result = array.length; // modify
		return result;
	}
	//------------------------------------------------------------------

	public static double min(double[] array)
	{
		double min = array[0];
		// Minimum: the code for your method (function) goes here
		for(int i = 0; i < array.length; i++)
		{
			if (array[i] < min)
			{
				min = array[i];
			}
		}
		return min;
	}
	//------------------------------------------------------------------
	
	public static double max(double[] array)
	{
		double max = array[0];
		// Maximum: the code for your method (function) goes here
		for(int i = 0; i < array.length; i++)
		{
			if (array[i] > max)
			{
				max = array[i];
			}
		}
		return max;
	}
	//------------------------------------------------------------------
	
	public static double secmax(double[] array)
	{
		double secmax = array[0];
		
		double max2 = array[0];
		for(int i = 0; i < array.length; i++)
		{
			if (array[i] > max2)
			{
				max2 = array[i];
			}
		}
		
		
		for (int i = 0; i < array.length; i++)
		{
			if (array[i] == max2)
			{
				secmax = secmax;
			}
			else
			{
				if(array[i] > secmax)
				{
					secmax = array[i];
				}
			}
		}
		
		return secmax;
	}
	//------------------------------------------------------------------
	
	public static double thirdmax(double[] array)
	{
		double thirdmax = array[0];
		
		double maxtemp2 = array[0];
		double maxtemp1 = array[0];
		for(int i = 0; i < array.length; i++)
		{
			if (array[i] > maxtemp1)
			{
				maxtemp1 = array[i];
			}
		}

		for (int i = 0; i < array.length; i++)
		{
			if (array[i] == maxtemp1)
			{
				maxtemp2 = maxtemp2;
			}
			else
			{
				if(array[i] > maxtemp2)
				{
					maxtemp2 = array[i];
				}
			}
		}
		
		for (int i = 0; i < array.length; i++)
		{
			if (array[i] == maxtemp1)
			{
				thirdmax = thirdmax;
			}
			else if (array[i] == maxtemp2)
			{
				thirdmax = thirdmax;
			} else
			{
				if (array[i] > thirdmax)
				{
					thirdmax = array[i];
				}
			}
		}
		return thirdmax;
		
	}
	//------------------------------------------------------------------
	public static double range(double[] array)
	{
		// Range: the code for your method (function) goes here
		double range = max(array) - min(array);
		return range;
	}
	//------------------------------------------------------------------

	public static double average(double[] array)
	{
		double average = 0.0;
		// Average: the code for your method (function) goes here
		for (int i = 0; i < array.length; i++)
		{
			average = average + array[i];
		}
		return average/array.length;
	}
	//------------------------------------------------------------------

	public static double median(double[] array)
	{
		double median = 0.0;
		Arrays.sort(array); //built in function to sort array
		// Median: the code for your method (function) goes here
		
		int midterm = size(array) / 2;
		if(array.length % 2 == 0)
		{
			median = (array[midterm-1]+array[midterm]) / 2;
		}else
		{
			median = array[midterm];
		}
		return median;
		
	}
	//------------------------------------------------------------------

	public static double mode(double[] array)
	{
		double mode = 0;
		double tempcount = 0;
		// Mode: the code for your method (function) goes here
		for(int a = 0; a < array.length; a++)
		{
			double counter = 0;
			for (int b = 0; b < array.length; b++)
			{
				if ( array[a] == array[b])
				{
					counter = counter + 1;
				}
			}
			if (counter > tempcount)
			{
				tempcount = counter;
				mode = array[a];
			}
		// should have something here, only works for first element 
		}
		return mode;
	}
	//------------------------------------------------------------------
	
	public static void printArray(double[] array)
	{
		for(int i = 0; i < array.length; i++)
		{
			System.out.println(array[i]);
		}
	}
	//------------------------------------------------------------------
	
	public static void printSeperators(double[] array)
	{
		for(int i = 0; i < array.length; i++)
		{
			if( i > 0)
			{
				System.out.print(" | ");
			}
			System.out.print(array[i]);
		}
	}
	//------------------------------------------------------------------

	public static void main (String args[]) throws IOException
	{
		System.out.println("Naael Mufti");
		System.out.println("Singapore Rainfall Statistics");
		System.out.println("\n*** Statistical Analysis of Data Sets ***\n");

		double rainfall[]    = load("rainfall.txt");	// load data from files
		double temperature[] = load("temperature.txt"); // into arrays

		System.out.println( "\nSingapore Rainfall Statistics" );
		System.out.println( "Measurements   : " + size(rainfall) );
		System.out.println( "Minimum   (0.2): " + min(rainfall) );
		System.out.println( "Maximum (765.9): " + max(rainfall) );
		System.out.println( "Secmax  (lmao): " + secmax(rainfall) );
		System.out.println( "Thirdmax (lmao lmao): " + thirdmax(rainfall));
		System.out.printf( "Range   (765.7): %.2f\n", range(rainfall) );
		System.out.printf( "Average(178.89): %.2f\n", average(rainfall) ); //could printf just to make 2dp like range
		System.out.println( "Mode    (127.2): " + mode(rainfall) );
		System.out.println( "Median  (159.7): " + median(rainfall) );

		System.out.println();
		
		System.out.println( "\nSingapore Temperature Statistics" );
		System.out.println( "Measurements   : " + size(temperature) );
		System.out.println( "Minimum  (25.4): " + min(temperature) );
		System.out.println( "Maximum  (29.5): " + max(temperature) );
		System.out.printf( "Range     (4.1): %.2f\n", range(temperature) );
		System.out.printf( "Average (27.62): %.2f\n", average(temperature) );
		System.out.println( "Mode     (27.3): " + mode(temperature) );
		System.out.println( "Median   (27.7): " + median(temperature) );

		System.out.println();
		System.out.println("---------------------------------");
		printSeperators(rainfall);
	}

	//------------------------------------------
	//- DO NOT MODIFY THE CODE BELOW THIS LINE -
	//------------------------------------------

    public static double[] load(String fileName) throws IOException
    {
        //System.out.println("<<< Loading data >>>");
        File file = new File(fileName);
        if (!file.exists())
        {
            System.out.println("ERROR - Data file not found. Download the file again.");
            return null;
        }
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr); //read mode
        String temp;
        int count = 0;
		double[] data = new double[countLines(fileName)];
		while ( br.ready() )
		{
            temp = br.readLine();
            data[count] = Double.parseDouble(temp);
            count++;
        }
        br.close();
        System.out.println(fileName + " file loaded.");// optional
        return data;
    }

    public static int countLines(String fileName) throws IOException
    {
        File file = new File(fileName);
        if ( !file.exists() )
        {
            System.out.println("ERROR - Data file not found. Download the file again.");
            return 0;
        }
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr); //read mode
        String temp;
        int count = 0;
		while ( br.ready() )
		{
			temp = br.readLine();
            count++;
        }
        br.close();
        return count;
    }


}


