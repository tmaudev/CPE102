/**
 * Shape Interface
 *
 * @author Tyler Mau
 * @version Program 03
 */

import java.awt.*;

public interface Shape
{
   /**
    * Calculates the area of the shape.
    * @return The area of the shape.
    */
   public double getArea();

   /**
    * Returns the color of the shape.
    * @return The color of the shape.
    */
   public Color getColor();

   /**
    * Sets the color of the shape.
    * @param color The color of the shape.
    */
   public void setColor(Color color);

   /**
    * Checks if shape is filled. Returns true if filled, false if not.
    * @return Boolean value representing shape fill (true if filled, false if not).
    */
   public boolean getFilled();

   /**
    * Sets the shape to filled or not.
    * @param filled Boolean value - true if shape is filled, false if not.
    */
   public void setFilled(boolean filled);

   /**
    * Returns the position of the shape.
    * @return Point representing the position of the shape.
    */
   public Point getPosition();

   /**
    * Sets the position of the shape.
    * @param position Point representing the position of the shape.
    */
   public void setPosition(Point position);

   /**
    * Moves the shape by the x and y values of the Point parameter.
    * @param delta Point representing the change to be made to the shape's x and y location.
    */
   public void move(Point delta);
}
