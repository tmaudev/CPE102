/**
 * Mickey
 *
 * @author Tyler Mau
 * @version Lab 13
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Mickey
{
   private JTextField x, y, event;
   private JFrame frame;

   public static void main(String[] args)
   {
      Mickey mickey = new Mickey();
   }

   public Mickey()
   {
      frame = new JFrame("Mickey");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      //Alternate way to get flow layout manager
      JPanel panel = new JPanel();
      x = new JTextField(5);
      y = new JTextField(5);
      event = new JTextField(20);

      panel.add(new JLabel("Event: "));
      panel.add(event);

      panel.add(new JLabel("X: "));
      panel.add(x);

      panel.add(new JLabel("Y: "));
      panel.add(y);

      //Now set the content pane to a new container
      frame.setContentPane(panel);

      //Set up the event listener
      frame.addMouseListener(new MyMouseListener());

      frame.pack();
      frame.setVisible(true);
   }

   private class MyMouseListener implements MouseListener
   {
      public void mouseClicked(MouseEvent e)
      {
         update("Clicked", e);
      }

      public void mouseEntered(MouseEvent e)
      {
         update("Entered", e);
      }

      public void mouseExited(MouseEvent e)
      {
         update("Exited", e);
      }

      public void mousePressed(MouseEvent e)
      {
         update("Pressed", e);
      }

      public void mouseReleased(MouseEvent e)
      {
         update("Released", e);
      }

      private void update(String type, MouseEvent e)
      {
         event.setText("Mouse " + type);
         x.setText(Integer.toString(e.getX()));
         y.setText(Integer.toString(e.getY()));
      }
   }
}
