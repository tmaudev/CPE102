/*
 * Test Driven Development Practice
 *
 * @author Tyler Mau
 * @version Lab 04
 */

public class TestFraction
{
   public static void main(String[] args)
   {
      //The following are test values that will be altered to test different situations.
      //Later, functions will be called more than once to test more situations at the same time.
      int testNum = 1, testDen = 1;
      int testNum2 = 0, testDen2 = 1;
      int testNumMul = 0, testDenMul = 1;
      int testNumAdd = 0, testDenAdd = 1;
      int testNumSub = 0, testDenSub = 1;
      int testNumDiv = 0, testDenDiv = 1;
      int testNumEq = 0, testDenEq = 1;
      String testString = "Goodbye";

      testFraction1();
      testFraction2(testNum);
      testFraction3(testNum,testDen);
      testAdd(testNum,testNum2,testDen,testDen2,testNumAdd,testDenAdd);
      testDiv(testNum,testNum2,testDen,testDen2,testNumDiv,testDenDiv);
      testEquals(testNum,testDen,testNumEq,testDenEq);
      testGetDenominator(testNum,testDen);
      testGetNumerator(testNum);
      testMul(testNum,testNum2,testDen,testDen2,testDenMul,testNumMul);
      testSub(testNum,testNum2,testDen,testDen2,testDenSub,testNumSub);
      testToString(testNum,testDen,testString);
      testValue(testNum,testDen);

      System.out.println("Tests Complete.\n");
   }

   public static void testFraction1()
   {
      Fraction f1 = new Fraction();
      if(!(f1.getDenominator() == 1 && f1.getNumerator() == 0))
      {
         System.out.println("Error: Fraction1 not created correctly.");
      }
   }

   public static void testFraction2(int testNum)
   {
      Fraction f1 = new Fraction(testNum);
      if(!(f1.getDenominator() == 1 && f1.getNumerator() == testNum))
      {
         System.out.println("Error: Fraction1 not created correctly.");
      }
   }

   public static void testFraction3(int testNum, int testDen)
   {
      Fraction f1 = new Fraction(testNum,testDen);
      if(!(f1.getDenominator() == testDen && f1.getNumerator() == testNum))
      {
         System.out.println("Error: Fraction3 not created correctly.");
      }
   }

   public static void testAdd(int testNum,
                              int testNum2,
                              int testDen,
                              int testDen2,
                              int testNumAdd,
                              int testDenAdd)
   {
      Fraction f1 = new Fraction(testNum,testDen);
      Fraction f2 = new Fraction(testNum2,testDen2);
      Fraction f3 = new Fraction();
      f3 = f1.add(f2);
      if(!(f3.getDenominator() == testDenAdd && f3.getNumerator() == testNumAdd))
      {
         System.out.println("Error: add: Expected " + testNumAdd + "/" + testDenAdd +
                            ", found " + f3.getNumerator() + "/" + f3.getDenominator() + ".");
      }
   }

   public static void testDiv(int testNum,
                              int testNum2,
                              int testDen,
                              int testDen2,
                              int testNumDiv,
                              int testDenDiv)
   {
      Fraction f1 = new Fraction(testNum,testDen);
      Fraction f2 = new Fraction(testNum2,testDen2);
      Fraction f3 = new Fraction();
      f3 = f1.div(f2);
      if(!(f3.getDenominator() == testDenDiv && f3.getNumerator() == testNumDiv))
      {
         System.out.println("Error: div: Expected " + testNumDiv + "/" + testDenDiv +
                            ", found " + f3.getNumerator() + "/" + f3.getDenominator() + ".");
      }

   }

   public static void testEquals(int testNum, int testDen, int testNumEq, int testDenEq)
   {
      Fraction f1 = new Fraction(testNum,testDen);
      Fraction f2 = new Fraction(testNumEq,testDenEq);
      if(!(f1.equals(f2)))
      {
         System.out.println("Error: equals: Fractions are not equal.");
      }
   }

   public static void testGetDenominator(int testNum, int testDen)
   {
      Fraction f1 = new Fraction(testNum, testDen);
      if(!(f1.getDenominator() == testDen))
      {
         System.out.println("Error: getDenominator: Expected " + testDen +
                            ", found " + f1.getDenominator() + ".");
      }
   }

   public static void testGetNumerator(int testNum)
   {
      Fraction f1 = new Fraction(testNum);
      if(!(f1.getNumerator() == testNum))
      {
         System.out.println("Error: getNumerator: Expected " + testNum +
                            ", found " + f1.getNumerator() + ".");
      }
   }

   public static void testMul(int testNum,
                              int testNum2,
                              int testDen,
                              int testDen2,
                              int testDenMul,
                              int testNumMul)
   {
      Fraction f1 = new Fraction(testNum,testDen);
      Fraction f2 = new Fraction(testNum2,testDen2);
      Fraction f3 = new Fraction();
      f3 = f1.mul(f2);
      if(!(f3.getDenominator() == testDenMul && f3.getNumerator() == testNumMul))
      {
         System.out.println("Error: mul: Expected " + testNumMul + "/" + testDenMul +
                            ", found " + f3.getNumerator() + "/" + f3.getDenominator() + ".");
      }
   }

   public static void testSub(int testNum,
                              int testNum2,
                              int testDen,
                              int testDen2,
                              int testDenSub,
                              int testNumSub)
   {
      Fraction f1 = new Fraction(testNum,testDen);
      Fraction f2 = new Fraction(testNum2,testDen2);
      Fraction f3 = new Fraction();
      f3 = f1.sub(f2);
      if(!(f3.getDenominator() == testDenSub && f3.getNumerator() == testNumSub))
      {
         System.out.println("Error: sub: Expected " + testNumSub + "/" + testDenSub +
                            ", found " + f3.getNumerator() + "/" + f3.getDenominator() + ".");
      }
   }

   public static void testToString(int testNum, int testDen, String testString)
   {
      Fraction f1 = new Fraction(testNum,testDen);
      if(!(f1.toString() == testString))
      {
         System.out.println("Error: toString: Expected " + testString +
                            ", found " + f1.toString() + ".");
      }
   }

   public static void testValue(int testNum, int testDen)
   {
      Fraction f1 = new Fraction(testNum,testDen);
      double value = (double)testNum/testDen;
      if(!(f1.value() == value))
      {
         System.out.println("Error: value: Expected " + value + ", found " + f1.value() + ".");
      }
   }

}
