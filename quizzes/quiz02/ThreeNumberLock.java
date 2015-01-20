/**
 * @author Tyler Mau
 * @version Lab Quiz 2
 */

public class ThreeNumberLock
{
   private int num1;
   private int num2;
   private int num3;
   private boolean locked;

   public ThreeNumberLock(int num1, int num2, int num3)
   {
      if(num1<0 || num2<0 || num3<0 || num1>99 || num2>99 || num3>99)
      {
         throw new IllegalArgumentException();
      }
      this.num1 = num1;
      this.num2 = num2;
      this.num3 = num3;
      this.locked = false;
   }

   public boolean open(int num1, int num2, int num3)
   {
      if(this.num1==num1 && this.num2==num2 && this.num3==num3)
      {
         this.locked = true;
         return true;
      }
      return false;
   }

   public boolean isOpen()
   {
      return this.locked;
   }

   public void close()
   {
      this.locked = false;
   }

   public boolean equals(Object o)
   {
      if(o == null)
      {
         return false;
      }
      if(this.getClass() != o.getClass())
      {
         return false;
      }
      ThreeNumberLock other = (ThreeNumberLock)o;
      if(this.num1==other.num1 && this.num2==other.num2 && this.num3==other.num3)
      {
         return true;
      }
      return false;
   }

   public String toString()
   {
      return "The class is mutable!";
   }
}
