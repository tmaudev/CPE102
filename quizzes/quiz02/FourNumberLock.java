/**
 * @author Tyler Mau
 * @version Lab Quiz 2
 */

public class FourNumberLock extends ThreeNumberLock
{
   private int num4;

   public FourNumberLock(int num1, int num2, int num3, int num4)
   {
      super(num1,num2,num3);
      if(num4<0 || num4>99)
      {
         throw new IllegalArgumentException();
      }
      this.num4 = num4;
   }

   public boolean open(int num1, int num2, int num3, int num4)
   {
      if(this.num4 == num4)
      {
         return super.open(num1,num2,num3);
      }
      return false;
   }

   public boolean equals(Object o)
   {
      FourNumberLock other = (FourNumberLock)o;
      if(super.equals(other) && this.num4 == other.num4)
      {
         return true;
      }
      return false;
   }
}
