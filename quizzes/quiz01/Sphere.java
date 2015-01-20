/**
 * @author Tyler Mau
 * @version Lab Quiz 1
 */

public class Sphere
{
   private double radius;

   public Sphere()
   {
      radius = 1.0;
   }
   public Sphere(double radius)
   {
      this.radius = radius;
   }

   public boolean equals(Sphere sphere)
   {
      if(sphere.radius == this.radius)
      {
         return true;
      }
      return false;
   }

   public double getRadius()
   {
      return radius;
   }

   public double getDiameter()
   {
      return radius * 2;
   }

   public double getSurfaceArea()
   {
      double SA = (double)4 * Math.PI * radius * radius;
      return SA;
   }

   public double getVolume()
   {
      double Vol = ((double)4/3) * Math.PI * radius * radius * radius;
      return Vol;
   }

   public String toString()
   {
      return "The Sphere class is mutable!";
   }
}
