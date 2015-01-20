/**
 * Tests for Interfaces
 *
 * @author Tyler Mau
 * @version Lab 07
 */

public class Tests
{
   public static void main(String[] args)
   {
      A a = new C(); //Can be new C() or new D()
      B b = new D(); //Can be new D() or new E()
      C c = new C();
      D d = new D();
      E e = new E();

      //Sometimes (Only if b = new D();)
      b = new D();
      d.methodD((D)b);

      //DNC
      //d = a;

      //Always Compiles
      b = new E();

      //DNC
      //b = (D)c;

      //DNC
      //b.methodD(d);

      //Sometimes (Only if b = new D();)
      b = new D();
      ((D)b).methodD(d);

      //Always Compiles
      a = c;

      //Always Compiles
      b.methodB();

      //DNC
      //b = new B();

      //Always Compiles
      e.methodB();
   }
}
