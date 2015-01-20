/**
 * Circle Shape
 *
 * @author Tyler Mau
 * @version Program 03
 */

import java.awt.*;

public class Circle extends Ellipse
{
   public Circle(double radius, Point position, Color color, boolean filled)
   {
      super(radius,radius,position,color,filled);
   }

   public double getRadius()
   {
      return super.getSemiMajorAxis();
   }

   public void setRadius(double radius)
   {
      if(radius > super.getSemiMajorAxis())
      {
         super.setSemiMajorAxis(radius);
         super.setSemiMinorAxis(radius);
      }
      else
      {
         super.setSemiMinorAxis(radius);
         super.setSemiMajorAxis(radius);
      }
   }

   public void setSemiMajorAxis(double radius)
   {
      if(radius > super.getSemiMajorAxis())
      {
         super.setSemiMajorAxis(radius);
         super.setSemiMinorAxis(radius);
      }
      else
      {
         super.setSemiMinorAxis(radius);
         super.setSemiMajorAxis(radius);
      }
   }

   public void setSemiMinorAxis(double radius)
   {
      if(radius > super.getSemiMajorAxis())
      {
         super.setSemiMajorAxis(radius);
         super.setSemiMinorAxis(radius);
      }
      else
      {
         super.setSemiMinorAxis(radius);
         super.setSemiMajorAxis(radius);
      }
   }
/*
   public boolean equals(Object other)
   {
      if(other == null)
      {
         return false;
      }
      if(this.getClass() != other.getClass())
      {
         return false;
      }
      Circle circle = (Circle)other;
      if(this.radius == circle.radius && this.position.equals(circle.position))
      {
         if(this.color.equals(circle.color) && this.filled == circle.filled)
         {
            return true;
         }
      }
      return false;
   }*/
}
