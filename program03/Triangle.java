/**
 * Triangle Shape
 *
 * @author Tyler Mau
 * @version Program 03
 */

import java.awt.*;
import java.lang.Math;

public class Triangle implements Shape
{
   private Point a;
   private Point b;
   private Point c;
   private Color color;
   private boolean filled;

   public Triangle(Point a, Point b, Point c, Color color, boolean filled)
   {
      this.a = a;
      this.b = b;
      this.c = c;
      this.color = color;
      this.filled = filled;
   }

   public double getArea()
   {
      double AB = Math.sqrt(Math.pow(b.getY()-a.getY(),2) + Math.pow(b.getX()-a.getX(),2));
      double BC = Math.sqrt(Math.pow(c.getY()-b.getY(),2) + Math.pow(c.getX()-b.getX(),2));
      double AC = Math.sqrt(Math.pow(c.getY()-a.getY(),2) + Math.pow(c.getX()-a.getX(),2));
      double s = (AB+BC+AC)/(double)2;
      double area = Math.sqrt(s * (s-AB) * (s-BC) * (s-AC));
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
      return a;
   }

   public void setPosition(Point position)
   {
      double dx, dy;
      dx = position.getX() - a.getX();
      dy = position.getY() - a.getY();
      a = position;
      b.translate((int)dx,(int)dy);
      c.translate((int)dx,(int)dy);
   }

   public void move(Point delta)
   {
      a.translate((int)delta.getX(), (int)delta.getY());
      b.translate((int)delta.getX(), (int)delta.getY());
      c.translate((int)delta.getX(), (int)delta.getY());
   }

   public Point getVertexA()
   {
      return a;
   }

   public void setVertexA(Point point)
   {
      this.a = point;
   }

   public Point getVertexB()
   {
      return b;
   }

   public void setVertexB(Point point)
   {
      this.b = point;
   }

   public Point getVertexC()
   {
      return c;
   }

   public void setVertexC(Point point)
   {
      this.c = point;
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
      Triangle triangle = (Triangle)other;
      if(a.equals(triangle.a) && b.equals(triangle.b) && c.equals(triangle.c))
      {
         if(this.color.equals(triangle.color) && this.filled == triangle.filled)
         {
            return true;
         }
      }
      return false;
   }
}
