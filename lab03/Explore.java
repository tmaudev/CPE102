/**
 * Uses Object class constructor to create an object reference.
 * The reference is then set to the address of an object instance.
 *
 * @author Tyler Mau
 * @version Lab 03
 */

public class Explore
{
   public static void main(String[] args)
   {
      Object ref;
      ref = new MyClass();
      System.out.println(ref.toString());
   }
}
