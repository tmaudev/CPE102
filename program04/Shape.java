/**
 * Shape Interface
 *
 * @author Tyler Mau
 * @version Program 03
 */

import java.awt.*;

public abstract class Shape implements Comparable<Shape>
{
   private Color color;
   private boolean filled;

   public Shape(Color color, boolean filled)
   {
      this.color = color;
      this.filled = filled;
   }

   public int compareTo(Shape o)
   {
      String name1 = this.getClass().getName();
      String name2 = o.getClass().getName();
      int testClassName = name1.compareTo(name2);
      double testArea = this.getArea() - o.getArea();

      if(testClassName == 0)
      {
         if(testArea == 0)
         {
            return 0;
         }
         return (int)testArea;
      }
      return testClassName;
   }

   /**
    * Calculates the area of the shape.
    * @return The area of the shape.
    */
   public abstract double getArea();

   /**
    * Returns the color of the shape.
    * @return The color of the shape.
    */
   public Color getColor()
   {
      return color;
   }

   /**
    * Sets the color of the shape.
    * @param color The color of the shape.
    */
   public void setColor(Color color)
   {
      this.color = color;
   }

   /**
    * Checks if shape is filled. Returns true if filled, false if not.
    * @return Boolean value representing shape fill (true if filled, false if not).
    */
   public boolean getFilled()
   {
      return filled;
   }

   /**
    * Sets the shape to filled or not.
    * @param filled Boolean value - true if shape is filled, false if not.
    */
   public void setFilled(boolean filled)
   {
      this.filled = filled;
   }

   /**
    * Returns the position of the shape.
    * @return Point representing the position of the shape.
    */
   public abstract Point getPosition();

   /**
    * Sets the position of the shape.
    * @param position Point representing the position of the shape.
    */
   public abstract void setPosition(Point position);

   /**
    * Moves the shape by the x and y values of the Point parameter.
    * @param delta Point representing the change to be made to the shape's x and y location.
    */
   public abstract void move(Point delta);

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
      Shape other = (Shape)o;
      if(this.color.equals(other.color) && this.filled == other.filled)
      {
         return true;
      }
      return false;
   }
}
