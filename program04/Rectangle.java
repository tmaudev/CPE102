/**
 * Rectangle Shape
 *
 * @author Tyler Mau
 * @version Program 03
 */

import java.awt.*;

public class Rectangle extends ConvexPolygon
{
   public Rectangle(int width, int height, Point position, Color color, boolean filled)
   {
      super(new Point[]{new Point(position),
            new Point((int)position.getX()+width, (int)position.getY()),
            new Point((int)position.getX()+width, (int)position.getY()+height),
            new Point((int)position.getX(), (int) position.getY()+height)},
            color,
            filled);
   }

   public int getWidth()
   {
      int width;
      width = (int)super.getVertex(1).getX() - (int)super.getVertex(0).getX();
      return width;
   }

   public void setWidth(int width)
   {
      super.setVertex(1, new Point((int)super.getVertex(0).getX() + width, (int)super.getVertex(1).getY()));
      super.setVertex(2, new Point((int)super.getVertex(3).getX() + width, (int)super.getVertex(2).getY()));
   }

   public int getHeight()
   {
      int height;
      height = (int)super.getVertex(2).getY() - (int)super.getVertex(1).getY();
      return height;
   }

   public void setHeight(int height)
   {
      super.setVertex(2, new Point((int)super.getVertex(2).getX(), (int)super.getVertex(1).getY() + height));
      super.setVertex(3, new Point((int)super.getVertex(3).getX(), (int)super.getVertex(0).getY() + height));
   }

   public void setVertex(int index, Point vertex)
   {
      throw new UnsupportedOperationException();
   }

   /*public boolean equals(Object other)
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
   }*/
}
