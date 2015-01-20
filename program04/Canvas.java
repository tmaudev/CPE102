/**
 * Canvas for shapes.
 *
 * @author Tyler Mau
 * @version Program 03
 */

import java.util.ArrayList;
import java.awt.*;

public class Canvas
{
   private ArrayList<Shape> shapes = new ArrayList<Shape>();

   public Canvas()
   {
   }

   public void add(Shape shape)
   {
      shapes.add(shape);
   }

   public Shape remove(int index)
   {
      Shape oldShape;
      if(index < 0 || index > shapes.size())
      {
         oldShape = null;
      }
      else
      {
         oldShape = shapes.get(index);
         shapes.remove(index);
      }
      return oldShape;
   }

   public Shape get(int index)
   {
      return shapes.get(index);
   }

   public int size()
   {
      return shapes.size();
   }

   public ArrayList<Circle> getCircles()
   {
      int i = 0;
      ArrayList<Circle> circles = new ArrayList<Circle>();
      for(i=0; i<shapes.size(); i++)
      {
         if(shapes.get(i) instanceof Circle)
         {
            circles.add((Circle)shapes.get(i));
         }
      }
      return circles;
   }

   public ArrayList<Rectangle> getRectangles()
   {
      int i = 0;
      ArrayList<Rectangle> rectangles = new ArrayList<Rectangle>();
      for(i=0; i<shapes.size(); i++)
      {
         if(shapes.get(i) instanceof Rectangle && shapes.get(i).getClass() != Square.class)
         {
            rectangles.add((Rectangle)shapes.get(i));
         }
      }
      return rectangles;
   }

   public ArrayList<Triangle> getTriangles()
   {
      int i = 0;
      ArrayList<Triangle> triangles = new ArrayList<Triangle>();
      for(i=0; i<shapes.size(); i++)
      {
         if(shapes.get(i) instanceof Triangle)
         {
            triangles.add((Triangle)shapes.get(i));
         }
      }
      return triangles;
   }

   public ArrayList<ConvexPolygon> getConvexPolygons()
   {
      int i = 0;
      ArrayList<ConvexPolygon> polygons = new ArrayList<ConvexPolygon>();
      for(i=0; i<shapes.size(); i++)
      {
         if(shapes.get(i) instanceof ConvexPolygon &&
            shapes.get(i).getClass() != Rectangle.class &&
            shapes.get(i).getClass() != Triangle.class &&
            shapes.get(i).getClass() != Square.class)
         {
            polygons.add((ConvexPolygon)shapes.get(i));
         }
      }
      return polygons;
   }

   public ArrayList<Shape> getShapesByColor(Color color)
   {
      int i = 0;
      ArrayList<Shape> colorShapes = new ArrayList<Shape>();
      for(i=0; i<shapes.size(); i++)
      {
         if(shapes.get(i).getColor() == color)
         {
            colorShapes.add(shapes.get(i));
         }
      }
      return colorShapes;
   }

   public double getAreaOfAllShapes()
   {
      int i = 0;
      double total = 0;
      for(i=0; i<shapes.size(); i++)
      {
         total += shapes.get(i).getArea();
      }
      return total;
   }
}
