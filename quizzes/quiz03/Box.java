/**
 * @author Tyler Mau
 * @version Lab Quiz 3
 */

import java.util.ArrayList;
import java.io.*;

public class Box
{
   private double length, width, height, weight;

   public Box(double length, double width, double height, double weight)
   {
      this.length = length;
      this.width = width;
      this.height = height;
      this.weight = weight;
   }

   public double getLength()
   {
      return length;
   }

   public double getWidth()
   {
      return width;
   }

   public double getHeight()
   {
      return height;
   }

   public double getWeight()
   {
      return weight;
   }

   public double getVolume()
   {
      return length*width*height;
   }

   public double getMaxDimension()
   {
      if(length>=width && length>=height)
      {
         return length;
      }
      else if(width>=length && width>=height)
      {
         return width;
      }
      return height;
   }

   public boolean equals(Object o)
   {
      if(o==null)
      {
         return false;
      }
      if(this.getClass() != o.getClass())
      {
         return false;
      }
      Box other = (Box)o;
      if(this.length == other.getLength() &&
         this.width == other.getWidth() &&
         this.height == other.getHeight() &&
         this.weight == other.getWeight())
      {
         return true;
      }
      return false;
   }

   public static void write(String fileName, ArrayList<Box> list) throws IOException
   {
      try
      {
         FileOutputStream o = new FileOutputStream(fileName);
         DataOutputStream output = new DataOutputStream(o);
         int i = 0;
         for(i=0; i<list.size(); i++)
         {
            output.writeDouble(list.get(i).getLength());
            output.writeDouble(list.get(i).getWidth());
            output.writeDouble(list.get(i).getHeight());
            output.writeDouble(list.get(i).getWeight());
         }
      }
      catch(IOException e)
      {
      }
   }

   public static ArrayList<Box> read(String fileName) throws IOException
   {
      ArrayList<Box> list = new ArrayList<Box>();
      try
      {
         FileInputStream in = new FileInputStream(fileName);
         DataInputStream input = new DataInputStream(in);
         double l,w,h,wt;
         while(true)
         {
            try
            {
               l = input.readDouble();
               w = input.readDouble();
               h = input.readDouble();
               wt = input.readDouble();
               list.add(new Box(l,w,h,wt));
            }
            catch(EOFException e)
            {
               break;
            }
         }
      }
      catch(IOException e)
      {
      }
      return list;
   }
}
