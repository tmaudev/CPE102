/**
 * Fraction class creates fractions and applys mathematical functions.
 * Also has methods that obtain fraction information.
 *
 * @author Tyler Mau
 * @version Program 01
 */

public class Fraction
{
   private int numerator, denominator;

   public Fraction()
   {
      this.numerator = 0;
      this.denominator = 1;
   }

   public Fraction(int numerator)
   {
      this.numerator = numerator;
      this.denominator = 1;
   }

   public Fraction(int numerator, int denominator)
   {
      int x,i;
      if(denominator <= 0)
      {
         throw new IllegalArgumentException();
      }

      int tempNumerator = numerator;
      if(numerator < 0)
      {
         tempNumerator = numerator * -1;
      }

      if(tempNumerator > denominator)
      {
         x = tempNumerator;
      }
      else
      {
         x = denominator;
      }

      for(i=x; i>0; i--)
      {
         if((numerator % i == 0) && (denominator % i == 0))
         {
            numerator = numerator / i;
            denominator = denominator / i;
            break;
         }
      }
      this.numerator = numerator;
      this.denominator = denominator;
   }

   public Fraction add(Fraction other)
   {
      int num,den;
      if(this.denominator == other.denominator)
      {
          num = this.numerator + other.numerator;
          den = this.denominator;
      }
      else
      {
         num = (this.numerator * other.denominator) + (this.denominator * other.numerator);
         den = this.denominator * other.denominator;
      }
      Fraction f1 = new Fraction(num,den);
      return f1;
   }

   public Fraction div(Fraction other)
   {
      int num,den;
      num = this.numerator * other.denominator;
      den = this.denominator * other.numerator;
      if(den < 0)
      {
         den = den * -1;
         num = num * -1;
      }
      Fraction f1 = new Fraction(num,den);
      return f1;
   }

   public boolean equals(Fraction other)
   {
      if((this.numerator == other.numerator) && (this.denominator == other.denominator))
      {
         return true;
      }
      return false;
   }

   public int getDenominator()
   {
      return this.denominator;
   }

   public int getNumerator()
   {
      return this.numerator;
   }

   public Fraction mul(Fraction other)
   {
      int num,den;
      num = this.numerator * other.numerator;
      den = this.denominator * other.denominator;
      Fraction f1 = new Fraction(num,den);
      return f1;
   }

   public Fraction sub(Fraction other)
   {
      int num,den;
      if(this.denominator == other.denominator)
      {
         num = this.numerator - other.numerator;
         den = this.denominator;
      }
      else
      {
         num = (this.numerator * other.denominator) - (this.denominator * other.numerator);
         den = this.denominator * other.denominator;
      }
      Fraction f1 = new Fraction(num,den);
      return f1;
   }

   public java.lang.String toString()
   {
      String fraction = "";
      if(this.denominator == 1)
      {
         fraction = "" + this.numerator;
      }
      else
      {
         fraction = "" + this.numerator + "/" + this.denominator;
      }
      return fraction;
   }

   public double value()
   {
      double val = (double)this.numerator / (double)this.denominator;
      return val;
   }
}
