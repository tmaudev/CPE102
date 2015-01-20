/**
 * Stores values of various types into a single ArrayList using objects.
 *
 * @author Tyler Mau
 * @version Lab 06
 */

import java.util.ArrayList;

public class ArrayPractice
{
   private ArrayList<Object> objList = new ArrayList<Object>();

   public void add(int x)
   {
      Integer i = new Integer(x);
      objList.add(i);
   }

   public void add(double x)
   {
      Double d = new Double(x);
      objList.add(d);
   }

   public void add(String x)
   {
      String s = x;
      objList.add(s);
   }

   public void add(boolean x)
   {
      Boolean b = new Boolean(x);
      objList.add(b);
   }

   public int minimumInt()
   {
      int i = 0;
      int min, index = 0;

      while(!(objList.get(i) instanceof Integer))
      {
         index++;
         i++;
      }
      Object obj = objList.get(index);
      min = ((Integer)obj).intValue();
      for(i=index; i<objList.size(); i++)
      {
         if(objList.get(i) instanceof Integer)
         {
            if(min > (Integer)objList.get(i))
            {
               min = (Integer)objList.get(i);
            }
         }
      }
      return min;
   }

   public double averageDouble()
   {
      int i = 0, num = 0;;
      double total = 0.0, average;

      for(i=0; i<objList.size(); i++)
      {
         if(objList.get(i) instanceof Double)
         {
            Object obj = objList.get(i);
            total += ((Double)obj);
            num++;
         }
      }
      average = total/num;
      return average;
   }

   public int numberOfTrues()
   {
      int i = 0;
      int num = 0;

      for(i=0; i<objList.size(); i++)
      {
         if(objList.get(i) instanceof Boolean)
         {
            if(((Boolean)objList.get(i)) == true)
            {
               num++;
            }
         }
      }
      return num;
   }

   public int numberOfStrings()
   {
      int i = 0;
      int strNum = 0;;
      for(i=0; i<objList.size(); i++)
      {
         if(objList.get(i) instanceof String)
         {
            strNum++;
         }
      }
      return strNum;
   }

}
