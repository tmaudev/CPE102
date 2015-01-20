/**
 * Stores values of various types into separate ArrayLists.
 *
 * @author Tyler Mau
 * @version Lab 05
 */

import java.util.ArrayList;

public class ArrayPractice
{
   private ArrayList<String> strList = new ArrayList<String>();
   private ArrayList<Integer> intList = new ArrayList<Integer>();
   private ArrayList<Double> doubleList = new ArrayList<Double>();
   private ArrayList<Boolean> booList = new ArrayList<Boolean>();

   public void add(int x)
   {
      intList.add(x);
   }

   public void add(double x)
   {
      doubleList.add(x);
   }

   public void add(String x)
   {
      strList.add(x);
   }

   public void add(boolean x)
   {
      booList.add(x);
   }

   public int minimumInt()
   {
      int i = 0;
      int min = intList.get(i);

      while(i < intList.size()-1)
      {
         if(min < intList.get(i+1))
         {
            i++;
         }
         else
         {
            min = intList.get(i);
            i++;
         }
      }
      return min;
   }

   public double averageDouble()
   {
      int i = 0;
      double total = 0, average;

      for(i=0; i<doubleList.size(); i++)
      {
         total += doubleList.get(i);
      }

      average = total/doubleList.size();
      return average;
   }

   public int numberOfTrues()
   {
      int i = 0;
      int num = 0;

      for(i=0; i<booList.size(); i++)
      {
         if(booList.get(i) == true)
         {
            num++;
         }
      }
      return num;
   }

   public int numberOfStrings()
   {
      return strList.size();
   }


}
