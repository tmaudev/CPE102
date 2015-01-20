/**
 * ButtonTextFieldEvent
 *
 * @author Tyler Mau
 * @version Lab 13
 */

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class ButtonTextFieldEvent
{
   public static void main(String[] args)
   {
      //Make a frame and set closing behavior
      JFrame frame = new JFrame();
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      //Make stuff to add to the frame
      JButton button = new JButton("Push Me!");

      //This needs to be final (can't change) because it is a local variable
      //Being accessed from an inner class
      final JTextField text = new JTextField(15);
      text.setText("0");

      //Add the stuff to the frame's content pane
      JPanel contentPane = (JPanel)frame.getContentPane();
      contentPane.add(button);
      contentPane.add(text);

      //Change the layout manager of the content pane
      contentPane.setLayout(new FlowLayout());

      //Write a listener class right here!
      class MyListener implements ActionListener
      {
         private int count = 0;

         public void actionPerformed(ActionEvent event)
         {
            count++;
            text.setText(Integer.toString(count));
         }
      }

      //Create a listener and add it to the button
      button.addActionListener(new MyListener());

      //In general, do this last
      frame.pack();
      frame.setVisible(true);
   }
}
