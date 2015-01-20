/**
 * Ellipse Shape
 *
 * @author Tyler Mau
 * @version Program 04
 */

import java.awt.*;

public class Ellipse extends Shape
{
   private double semiMajorAxis;
   private double semiMinorAxis;
   private Point position;

   public Ellipse(double semiMajorAxis,
                  double semiMinorAxis,
                  Point position,
                  Color color,
                  boolean filled)
   {
      super(color,filled);
      this.semiMajorAxis = semiMajorAxis;
      this.semiMinorAxis = semiMinorAxis;
      this.position = new Point(position);
   }

   public double getSemiMajorAxis()
   {
      return this.semiMajorAxis;
   }

   public void setSemiMajorAxis(double semiMajorAxis)
   {
      double temp;
      this.semiMajorAxis = semiMajorAxis;
      if(this.semiMajorAxis < this.semiMinorAxis)
      {
         temp = semiMajorAxis;
         this.semiMajorAxis = this.semiMinorAxis;
         this.semiMinorAxis = temp;
      }
   }

   public double getSemiMinorAxis()
   {
      return this.semiMinorAxis;
   }

   public void setSemiMinorAxis(double semiMinorAxis)
   {
      double temp;
      this.semiMinorAxis = semiMinorAxis;
      if(this.semiMajorAxis < this.semiMinorAxis)
      {
         temp = semiMajorAxis;
         this.semiMajorAxis = this.semiMinorAxis;
         this.semiMinorAxis = temp;
      }

   }

   public double getArea()
   {
      return Math.PI * semiMajorAxis * semiMinorAxis;
   }

   public Point getPosition()
   {
      return new Point(position);
   }

   public void setPosition(Point position)
   {
      this.position = new Point(position);
   }

   public void move(Point delta)
   {
      this.position.translate((int)delta.getX(), (int)delta.getY());
   }

   public boolean equals(Object o)
   {
      if(!super.equals(o))
      {
         return false;
      }
      Ellipse other = (Ellipse)o;
      if(this.position.equals(other.getPosition()) &&
         this.semiMajorAxis == other.getSemiMajorAxis() &&
            this.semiMinorAxis == other.getSemiMinorAxis())
      {
         return true;
      }
      return false;
   }
}
