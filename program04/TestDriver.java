/**
 * Test Driver for Shapes
 *
 * @author Tyler Mau
 * @version Program 03
 */

import java.awt.*;

public class TestDriver
{
   public static void main(String[] args)
   {
      Point p1 = new Point(1,2);
      Color color = new Color(10,10,10);
      Circle c1 = new Circle(5.0,p1,color,true);
      Circle c2 = new Circle(5.0,p1,color,true);
      Circle c3 = new Circle(6.0,p1,color,false);
      Circle circle4 = new Circle(6.78, new Point(1,1), new Color(1,2,3), false);
      Circle circle5 = new Circle(6.78, new Point(1,1), new Color(1,2,3), false);
      if(circle4.equals(circle5))
      {
         System.out.println("Pass");
      }
      Point vertices[] = {p1,p1,p1};
      ConvexPolygon poly = new ConvexPolygon(vertices, Color.black, true);
      ConvexPolygon poly2 = new ConvexPolygon(vertices, Color.black, false);
      System.out.println(poly.equals(poly2));
   }
}
