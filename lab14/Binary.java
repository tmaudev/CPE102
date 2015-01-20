/**
 * Binary Input and Output
 *
 * @author Tyler Mau
 * @version Lab 14
 */

import java.util.ArrayList;
import java.io.*;

public class Binary
{
   public static void main(String[] args)
   {
      try
      {
         FileInputStream in = new FileInputStream("file.bin");
         DataInputStream input = new DataInputStream(in);
         System.out.println(input.readInt());
      }
      catch(IOException e)
      {
      }
   }
   public static void write(String fileName, ArrayList<Object> list)
   {
   }
}
