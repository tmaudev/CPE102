/**
 * Provided basic compile test for Box quiz.
 *
 * Verifies that all expected methods are present and that they potentially
 * throw the expected exceptions.
 *
 * ************************************************************************
 * *** NOTE THAT THIS IS A COMPILE TEST ONLY - NO BEHAVIOR IS VERIFIED! ***
 * ************************************************************************
 *
 * @author Kurt Mammen
 * @version CPE 102 Lab Quiz 3
 */
import java.io.*;
import java.util.*;

public class BoxCompileTest
{
   public static void main(String[] args)
   {
      Box b = new Box(1.1, 2.2, 3.3, 4.4);

      b.getLength();
      b.getWidth();
      b.getHeight();
      b.getWeight();
      b.getVolume();
      b.getMaxDimension();
      b.equals(new Object());

      try
      {
         Box.read("SomeFile");
      }
      catch(FileNotFoundException e)
      {
      }
      catch(EOFException e)
      {
      }
      catch(IOException e)
      {
      }

      try
      {
         Box.write("SomeFile", new ArrayList<Box>());
      }
      catch(FileNotFoundException e)
      {
      }
      catch(IOException e)
      {
      }
   }
}
