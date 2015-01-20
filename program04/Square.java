/**
 * Square Shape
 *
 * @author Tyler Mau
 * @version Program 04
 */

import java.awt.*;

public class Square extends Rectangle
{
   public Square(int sideLength, Point position, Color color, boolean filled)
   {
      super(sideLength,sideLength,position,color,filled);
   }

   public int getSize()
   {
      return super.getWidth();
   }

   public void setSize(int sideLength)
   {
      super.setWidth(sideLength);
      super.setHeight(sideLength);
   }

   public void setWidth(int width)
   {
      super.setWidth(width);
      super.setHeight(width);
   }

   public void setHeight(int height)
   {
      super.setHeight(height);
      super.setWidth(height);
   }

}
