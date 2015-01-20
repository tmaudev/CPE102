/**
 * Gives and receives polygon information.
 *
 * @author Tyler Mau
 * @version Program 03
 */

import java.awt.*;

public class ConvexPolygon implements Shape
{
   private Point[] vertices;
   private Color color;
   private boolean filled;

   public ConvexPolygon(Point[] vertices, Color color, boolean filled)
   {
      this.vertices = vertices;
      this.color = color;
      this.filled = filled;
   }

   public double getArea()
   {
      double area1 = 0, area2 = 0, area = 0;
      int i = 0;
      for(i=0; i<vertices.length-1; i++)
      {
         area1 += vertices[i].getX() * vertices[i+1].getY();
         area2 += vertices[i].getY() * vertices[i+1].getX();
      }
      area1 += vertices[i].getX() * vertices[0].getY();
      area2 += vertices[i].getY() * vertices[0].getX();
      area = 0.5 * (area1 - area2);

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
      return vertices[0];
   }

   public void setPosition(Point position)
   {
      int i = 0;
      double dx, dy;
      dx = position.getX() - vertices[0].getX();
      dy = position.getY() - vertices[0].getY();
      for(i=0; i<vertices.length; i++)
      {
         vertices[i].translate((int)dx,(int)dy);
      }
   }

   public void move(Point delta)
   {
      int i = 0;
      double dy, dx;
      dy = delta.getY();
      dx = delta.getX();
      for(i=0; i<vertices.length; i++)
      {
         vertices[i].translate((int)dx,(int)dy);
      }
   }

   public Point getVertex(int index)
   {
      return vertices[index];
   }

   public void setVertex(int index, Point vertex)
   {
      vertices[index] = vertex;
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
      ConvexPolygon CP = (ConvexPolygon)other;
      int i = 0;
      if(!(this.color.equals(CP.color) && this.filled == CP.filled))
      {
         return false;
      }
      else
      {
         for(i=0; i<vertices.length; i++)
         {
            if(!(vertices[i].equals(CP.vertices[i])))
            {
               return false;
            }
         }
      }
      return true;
   }
}
