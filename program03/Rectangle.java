/**
 * Rectangle Shape
 *
 * @author Tyler Mau
 * @version Program 03
 */

import java.awt.*;

public class Rectangle implements Shape
{
   private int width;
   private int height;
   private Point position;
   private boolean filled;
   private Color color;

   public Rectangle(int width, int height, Point position, Color color, boolean filled)
   {
      this.width = width;
      this.height = height;
      this.position = position;
      this.color = color;
      this.filled = filled;
   }

   public double getArea()
   {
      double area = width * height;
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

   public int getWidth()
   {
      return width;
   }

   public void setWidth(int width)
   {
      this.width = width;
   }

   public int getHeight()
   {
      return height;
   }

   public void setHeight(int height)
   {
      this.height = height;
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
      Rectangle rec = (Rectangle)other;
      if(this.width == rec.width && this.height == rec.height)
      {
         if(this.color.equals(rec.color) && this.filled == rec.filled)
         {
            if(this.position.equals(rec.position))
            {
               return true;
            }
         }
      }
      return false;
   }
}
