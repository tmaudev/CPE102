/**
 * Test Driver for Dictionary
 *
 * @author Tyler Mau
 * @version Program 05
 */

import java.io.*;

public class TestDriver
{
   public static void main(String[] args) throws DictionaryException
   {
      Dictionary dictionary = new Dictionary("fullOrderedDict.txt", false);
      dictionary.write("Dictionary.txt");
      boolean test = dictionary.lookUp("TESTFAIL");
      System.out.println(test);
   }
}
