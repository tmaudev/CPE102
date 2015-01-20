/**
 * Gives and receives polygon information.
 *
 * @author Tyler Mau
 * @version Program 03
 */

import java.awt.*;

public class ConvexPolygon extends Shape
{
   private Point[] vertices;

   public ConvexPolygon(Point[] vertices, Color color, boolean filled)
   {
      super(color,filled);
      this.vertices = new Point[vertices.length];
      int i = 0;
      for(i=0; i<vertices.length; i++)
      {
         this.vertices[i] = new Point(vertices[i]);
      }
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

   public Point getPosition()
   {
      return new Point(vertices[0]);
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
      return new Point(vertices[index]);
   }

   public void setVertex(int index, Point vertex)
   {
      vertices[index] = new Point(vertex);
   }

   public boolean equals(Object other)
   {
      if(!super.equals(other))
      {
         return false;
      }
      ConvexPolygon CP = (ConvexPolygon)other;
      int i = 0;
      for(i=0; i<vertices.length; i++)
      {
         if(!(vertices[i].equals(CP.vertices[i])))
         {
            return false;
         }
      }
      return true;
   }
}
