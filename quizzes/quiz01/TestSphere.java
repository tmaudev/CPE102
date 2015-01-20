/**
 * Test for Sphere
 *
 * @author Tyler Mau
 * @version Lab Quiz 1
 */

public class TestSphere
{
   public static void main(String[] args)
   {
      Sphere s = new Sphere();
      System.out.println(s.getRadius());
      System.out.println(s.getDiameter());
      System.out.println(s.getSurfaceArea());
      System.out.println(s.getVolume());
      Sphere s2 = new Sphere(1.0);
      System.out.println(s.equals(s2));
      System.out.println(s.toString());
   }
}
