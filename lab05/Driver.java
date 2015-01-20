/**
 *
 * Driver for array practice.
 *
 * @author Tyler Mau
 * @version Lab 05
 */

import java.util.Scanner;

public class Driver
{
   public static void main(String[] args)
   {
      boolean quit = false;
      Scanner scanner = new Scanner(System.in);
      ArrayPractice array = new ArrayPractice();

      while(!(quit))
      {
         if(scanner.hasNext("quit"))
         {
            quit = true;
         }
         else if(scanner.hasNextInt())
         {
            array.add(scanner.nextInt());
         }
         else if(scanner.hasNextDouble())
         {
            array.add(scanner.nextDouble());
         }
         else if(scanner.hasNextBoolean())
         {
            array.add(scanner.nextBoolean());
         }
         else
         {
            array.add(scanner.next());
         }
      }
      scanner.close();

      System.out.println();
      System.out.println("Minimum Integer: " + array.minimumInt());
      System.out.println("Average of Doubles: " + array.averageDouble());
      System.out.println("Number of Trues: " + array.numberOfTrues());
      System.out.println("Number of Strings: " + array.numberOfStrings());
      System.out.println();
   }
}
