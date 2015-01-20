/**
 * Circle Shape
 *
 * @author Tyler Mau
 * @version Program 03
 */

import java.awt.*;

public class Circle implements Shape
{
   private double radius;
   private Point position;
   private Color color;
   private boolean filled;

   public Circle(double radius, Point position, Color color, boolean filled)
   {
      this.radius = radius;
      this.position = position;
      this.color = color;
      this.filled = filled;
   }

   public double getArea()
   {
      double area = Math.PI * radius * radius;
      return area;
   }

   public Color getColor()
   {
      return color;
   }

   public void setColor(Color color)
   {
      this.color = color;
   }

   public boolean getFilled()
   {
      return filled;
   }

   public void setFilled(boolean filled)
   {
      this.filled = filled;
   }

   public Point getPosition()
   {
      return position;
   }

   public void setPosition(Point position)
   {
      this.position = position;
   }

   public void move(Point delta)
   {
      position.translate((int)delta.getX(), (int)delta.getY());
   }

   public double getRadius()
   {
      return radius;
   }

   public void setRadius(double radius)
   {
      this.radius = radius;
   }

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
   }
}
