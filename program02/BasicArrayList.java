/**
 * Creates an array of Object references.
 *
 * @author Tyler Mau
 * @version Program 02
 */

import java.util.NoSuchElementException;

public class BasicArrayList implements BasicList
{
   private int size;
   private Object[] array;
   public static final int DEFAULT_CAPACITY = 10;

   public BasicArrayList()
   {
      array = new Object[DEFAULT_CAPACITY];
      size = 0;
      int i = 0;
   }

   public BasicArrayList(int capacity)
   {
      int i = 0;
      size = 0;
      if(capacity >= DEFAULT_CAPACITY)
      {
         array = new Object[capacity];
      }
      else
      {
         array = new Object[DEFAULT_CAPACITY];
      }
   }

   public void add(int index, Object element)
   {
      Object[] tempArray;
      int arrSize = size;

      if(index < 0 || index > size)
      {
         throw new IndexOutOfBoundsException();
      }
      if(size != array.length)
      {
         tempArray = new Object[array.length];
      }
      else
      {
         tempArray = new Object[array.length * 2];
      }

      int i = 0;
      for(i=0; i<index; i++)
      {
         tempArray[i] = array[i];
      }

      tempArray[index] = element;

      for(i=index; i<size; i++)
      {
         tempArray[i+1] = array[i];
      }

      array = tempArray;

      size++;
   }

   public void add(Object element)
   {
      int i = 0;
      if(size == array.length)
      {
         Object[] tempArray = new Object[array.length * 2];

         for(i=0; i<size; i++)
         {
            tempArray[i] = array[i];
         }
         array = tempArray;
         array[array.length/2] = element;
      }
      else
      {
         array[size] = element;
      }

      size++;
   }
   public void clear()
   {
      array = new Object[DEFAULT_CAPACITY];
      size = 0;
   }
   public boolean contains(Object element)
   {
      int i = 0;
      for(i=0; i<size; i++)
      {
         if(array[i].equals(element))
         {
            return true;
         }
      }
      return false;
   }
   public Object get(int index)
   {
      if(index < 0 || index >= size)
      {
         throw new IndexOutOfBoundsException();
      }
      return array[index];
   }
   public int indexOf(Object element)
   {
      int i = 0;
      for(i=0; i<size; i++)
      {
         if(array[i].equals(element))
         {
            return i;
         }
      }
      throw new NoSuchElementException();
   }
   public Object remove(int index)
   {
      if(index < 0 || index >= size)
      {
         throw new IndexOutOfBoundsException();
      }
      Object oldElement = new Object();
      Object[] tempArray = new Object[array.length];
      int i = 0;
      for(i=0; i<array.length; i++)
      {
         tempArray[i] = array[i];
      }
      oldElement = array[index];

      for(i=index; i<array.length-1; i++)
      {
         array[i] = tempArray[i+1];
      }
      size--;
      return oldElement;
   }
   public Object set(int index, Object element)
   {
      if(index < 0 || index >= size)
      {
         throw new IndexOutOfBoundsException();
      }
      Object oldElement = array[index];
      array[index] = element;
      return oldElement;
   }
   public int size()
   {
      return size;
   }
   public void trimToSize()
   {
      int i = 0;
      Object[] tempArray = new Object[size];
      if(size > DEFAULT_CAPACITY)
      {
         for(i=0; i<size; i++)
         {
            tempArray[i] = array[i];
         }
         array = tempArray;
      }
      else
      {
         for(i=0; i<size; i++)
         {
            tempArray[i] = array[i];
         }
         array = new Object[DEFAULT_CAPACITY];
         for(i=0; i<size; i++)
         {
            array[i] = tempArray[i];
         }
      }
   }
   public int capacity()
   {
      return array.length;
   }
   public Object[] unusualMethodForTestDriverOnly()
   {
      return array;
   }
}
