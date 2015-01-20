/**
 * Dictionary Class
 *
 * @author Tyler Mau
 * @version Program 05
 */

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;
import java.io.*;
import java.util.Random;

public class Dictionary implements Iterable<String>
{
   private ArrayList<String> dictionary = new ArrayList<String>();

   public Dictionary(String fileName, boolean sort) throws DictionaryException
   {
      int i = 0;
      try
      {
         File file = new File(fileName);
         Scanner scanner = new Scanner(file);
         while(scanner.hasNext())
         {
            dictionary.add(scanner.nextLine());
         }
         if(sort)
         {
            quickSort(0,dictionary.size()-1);
         }
      }
      catch(FileNotFoundException e)
      {
         throw new DictionaryException();
      }
   }

   public Iterator<String> iterator()
   {
      return dictionary.iterator();
   }

   public boolean lookUp(String word)
   {
      int min = 0;
      int max = dictionary.size();
      int index;

      while(max >= min)
      {
         index = min + ((max-min)/2);
         if(word.compareTo(dictionary.get(index)) < 0)
         {
            max = index - 1;
         }
         else if(word.compareTo(dictionary.get(index)) > 0)
         {
            min = index + 1;
         }
         else
         {
            return true;
         }
      }
      return false;
   }

   public void write(String fileName) throws DictionaryException
   {
      try
      {
         PrintStream write = new PrintStream(new FileOutputStream(fileName));
         int i = 0;
         for(i=0; i<dictionary.size(); i++)
         {
            write.println(dictionary.get(i));
         }
      }
      catch(FileNotFoundException e)
      {
         throw new DictionaryException();
      }
   }

   private void quickSort(int start, int end)
   {
      Random generator = new Random();
      int pivotIndex = generator.nextInt(end-start) + start;
      String pivot = dictionary.get(pivotIndex);
      int i, j;

      swap(pivotIndex,end);
      j = start;
      i = j + 1;

      while(i <= end && j < end)
      {
         //Finds Partition Progress
         while(pivot.compareTo(dictionary.get(j)) > 0)
         {
            j++;
         }

         if(pivot.compareTo(dictionary.get(i)) > 0)
         {
            swap(i,j);
         }
         i++;
      }
      swap(j,end);

      if(j > start + 99)
      {
         quickSort(start,j);
      }
      else
      {
         insertionSort(start,j);
      }
      if(j < end - 99)
      {
         quickSort(j + 1, end);
      }
      else
      {
         insertionSort(j + 1, end);
      }
   }

   private void swap(int index1, int index2)
   {
      String temp;

      temp = dictionary.get(index1);
      dictionary.set(index1, dictionary.get(index2));
      dictionary.set(index2, temp);
   }

   private void insertionSort(int start, int end)
   {
      int i, j;
      String word;

      for(i=start+1; i<=end; i++)
      {
         word = dictionary.get(i);
         j = i;
         while((j>start) && (word.compareTo(dictionary.get(j-1)) < 0))
         {
            dictionary.set(j,dictionary.get(j-1));
            j--;
         }
         dictionary.set(j,word);
      }
   }
}
