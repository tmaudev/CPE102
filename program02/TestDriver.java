/**
 * Test Driver for BasicArrayList
 *
 * @author Tyler Mau
 * @version Program 02
 */

public class TestDriver
{
   public static void main(String[] args)
   {
      BasicArrayList a = new BasicArrayList();
      testBasicArrayList();
      testAdd();
/*
      testCapacity();
      testClear();
      testContains();
      testGet();
      testIndexOf();
      testRemove();
      testSet();
      testSize();
      testTrimToSize();*/
   }

   public static void testBasicArrayList()
   {
      BasicArrayList a = new BasicArrayList();
      System.out.println(a.size());
   }

   public static void testAdd()
   {
      BasicArrayList a = new BasicArrayList();
      Integer i = 20;
      a.add(5, i);
      System.out.println(a.get(5));
   }
/*
   public void testCapacity()
   {
   }

   public void testClear()
   {
   }

   public void testContains()
   {
   }

   public void testGet()
   {
   }

   public void testIndexOf()
   {
   }

   public void testRemove()
   {
   }

   public void testSet()
   {
   }

   public void testSize()
   {
   }

   public void testTrimToSize()
   {
   }*/
}
