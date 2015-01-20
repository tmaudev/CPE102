/**
 * Test Driver
 *
 * @author Tyler Mau
 * @version Lab Quiz 2
 */

public class TestDriver
{
   public static void main(String[] args)
   {
      FourNumberLock lock = new FourNumberLock(1,2,3,4);
      boolean test = lock.equals(new FourNumberLock(2,2,3,4));
      System.out.println(test);
   }
}
