/**
 * Triangle Shape
 *
 * @author Tyler Mau
 * @version Program 03
 */

import java.awt.*;
import java.lang.Math;

public class Triangle extends ConvexPolygon
{
   public Triangle(Point a, Point b, Point c, Color color, boolean filled)
   {
      super(new Point[]{a,b,c},color,filled);
   }

   public double getArea()
   {
      double AB = Math.sqrt(Math.pow(super.getVertex(1).getY()-super.getVertex(0).getY(),2) +
                  Math.pow(super.getVertex(1).getX()-super.getVertex(0).getX(),2));
      double BC = Math.sqrt(Math.pow(super.getVertex(2).getY()-super.getVertex(1).getY(),2) +
                  Math.pow(super.getVertex(2).getX()-super.getVertex(1).getX(),2));
      double AC = Math.sqrt(Math.pow(super.getVertex(2).getY()-super.getVertex(0).getY(),2) +
                  Math.pow(super.getVertex(2).getX()-super.getVertex(0).getX(),2));
      double s = (AB+BC+AC)/(double)2;
      double area = Math.sqrt(s * (s-AB) * (s-BC) * (s-AC));
      return area;
   }

   public Point getVertexA()
   {
      return new Point(super.getVertex(0));
   }

   public void setVertexA(Point point)
   {
      super.setVertex(0, new Point(point));
   }

   public Point getVertexB()
   {
      return new Point(super.getVertex(1));
   }

   public void setVertexB(Point point)
   {
      super.setVertex(1, new Point(point));
   }

   public Point getVertexC()
   {
      return new Point(super.getVertex(2));
   }

   public void setVertexC(Point point)
   {
      super.setVertex(2, new Point(point));
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
      Triangle triangle = (Triangle)other;
      if(a.equals(triangle.a) && b.equals(triangle.b) && c.equals(triangle.c))
      {
         if(this.color.equals(triangle.color) && this.filled == triangle.filled)
         {
            return true;
         }
      }
      return false;
   }*/
}
