/**
 * Parses input from user and displays information.
 *
 * @author Tyler Mau
 * @version Lab 02 Part 2
 */

import java.util.Scanner;

public class InputParser
{
   //Main
   public static void main(String[] args)
   {
      int iSum = 0, count = 0;
      double dSum = 0.0;
      String  sCat = "";

      //Prompts user for number of values to parse
      System.out.print("\nHow many values would you like to parse? ");
      //Creates scanner reference variable object
      Scanner scanner = new Scanner(System.in);
      //Scans in integer value
      int numVal = scanner.nextInt();
      //Prompts user to enter the number of values specified
      System.out.println("\nPlease enter " + numVal + " number of values: \n");

      //Loops through specified number of values
      for(count=0; count<numVal; count++)
      {
         //Prints number for user visualization
         System.out.print((count + 1) + ": ");

         //Checks if value is an integer
         if(scanner.hasNextInt())
         {
            //Scans in integer
            int i = scanner.nextInt();
            System.out.print("Integer.\n\n");

            //Adds integer to sum of integers
            iSum += i;
         }
         //Checks if value is a double
         else if(scanner.hasNextDouble())
         {
            //Scans in double
            double d = scanner.nextDouble();
            System.out.print("Double.\n\n");

            //Adds double to sum of doubles
            dSum += d;
         }
         else
         {
            //Scans in string
            String s = scanner.next();
            System.out.print("String.\n\n");

            //Concatenates string to sum of strings
            sCat += s;
         }
      }

      //Prints out sums of integers, doubles, and strings
      System.out.print("Integer Sum: " + iSum + "\n");
      System.out.print("Double Sum: " + dSum + "\n");
      System.out.print("Concatenated String: " + sCat + "\n\n");

      //Closes scanner
      scanner.close();
   }
}
