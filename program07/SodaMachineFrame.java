/**
 * Slider Frame Practice
 *
 * @author Tyler Mau
 * @version Lab 13
 *
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EtchedBorder;
import javax.swing.event.*;
import java.util.ArrayList;

class SodaMachineFrame extends JFrame
{
   JTextField amount = new JTextField(6);
   JTextField changeAmount = new JTextField(6);
   JTextField salesAmount = new JTextField(6);
   SodaMachine machine;
   private static final int n = 5;
   private static final int d = 10;
   private static final int q = 25;
   private static final int hd = 50;
   private static final int dol = 100;
   private JButton nickel, dime, quarter, halfDollar, dollar;
   private ArrayList<JButton> buttons;

   public SodaMachineFrame(SodaMachine machine)
   {
      this.machine = machine;
      createMoneyPanel();
      createMidPanel();
      createSodaPanel();
      setResizable(false);
      pack();
   }

   public void createMoneyPanel()
   {
      class ButtonListener implements ActionListener
      {
         public void actionPerformed(ActionEvent event)
         {
            if(event.getSource() == nickel)
            {
               machine.deposit(n);
            }
            else if(event.getSource() == dime)
            {
               machine.deposit(d);
            }
            else if(event.getSource() == quarter)
            {
               machine.deposit(q);
            }
            else if(event.getSource() == halfDollar)
            {
               machine.deposit(hd);
            }
            else if(event.getSource() == dollar)
            {
               machine.deposit(dol);
            }
            if(machine.sufficientFunds())
            {
               int i = 0;
               for(i=0; i<machine.getCount(); i++)
               {
                  if(machine.getSodaCount(i) > 0)
                  {
                     buttons.get(i).setEnabled(true);
                  }
               }
            }
            double money = machine.getDeposits()/100.0;
            amount.setText("$" + String.format("%.2f", money));
            changeAmount.setText("$0.00");
         }
      }

      ButtonListener listener = new ButtonListener();

      nickel = new JButton("Nickel");
      nickel.addActionListener(listener);

      dime = new JButton("Dime");
      dime.addActionListener(listener);

      quarter = new JButton("Quarter");
      quarter.addActionListener(listener);

      halfDollar = new JButton("Half Dollar");
      halfDollar.addActionListener(listener);

      dollar = new JButton("Dollar");
      dollar.addActionListener(listener);

      JPanel buttonPanel = new JPanel();
      buttonPanel.setLayout(new GridLayout(5,1));
      buttonPanel.setPreferredSize(new Dimension(150,300));
      buttonPanel.setBorder(new EtchedBorder());

      buttonPanel.add(nickel);
      buttonPanel.add(dime);
      buttonPanel.add(quarter);
      buttonPanel.add(halfDollar);
      buttonPanel.add(dollar);

      getContentPane().add(buttonPanel, BorderLayout.EAST);
   }

   public void createMidPanel()
   {
      class ButtonListener implements ActionListener
      {
         public void actionPerformed(ActionEvent event)
         {
            int change = machine.returnDeposits();
            amount.setText("$0.00");
            changeAmount.setText("$" + String.format("%.2f", change/100.0));
            int i = 0;
            for(i=0; i<machine.getCount(); i++)
            {
               buttons.get(i).setEnabled(false);
            }
         }
      }

      ButtonListener listener = new ButtonListener();

      JPanel midPanel = new JPanel();
      midPanel.setLayout(new GridLayout(3,1));
      midPanel.setPreferredSize(new Dimension(150,300));
      midPanel.setBorder(new EtchedBorder());

      JPanel deposited = new JPanel();
      deposited.setBorder(new EtchedBorder());
      JLabel amountDeposited = new JLabel("Amount Deposited");
      amount = new JTextField(6);
      amount.setText("$0.00");
      amount.setEditable(false);
      amount.setHorizontalAlignment(JTextField.RIGHT);
      JButton coinReturn = new JButton("Coin Return");
      coinReturn.addActionListener(listener);
      coinReturn.setEnabled(true);
      deposited.setLayout(new FlowLayout());
      deposited.add(amountDeposited);
      deposited.add(amount);
      deposited.add(coinReturn);

      JPanel change = new JPanel();
      change.setBorder(new EtchedBorder());
      JLabel changeReturned = new JLabel("Change Returned");
      changeAmount = new JTextField(6);
      changeAmount.setText("$0.00");
      changeAmount.setEditable(false);
      changeAmount.setHorizontalAlignment(JTextField.RIGHT);
      change.setLayout(new FlowLayout());
      change.add(changeReturned);
      change.add(changeAmount);

      JPanel sales = new JPanel();
      sales.setBorder(new EtchedBorder());
      JLabel totalSales = new JLabel("Total Sales");
      salesAmount = new JTextField(6);
      salesAmount.setText("$0.00");
      salesAmount.setEditable(false);
      salesAmount.setHorizontalAlignment(JTextField.RIGHT);
      sales.setLayout(new FlowLayout());
      sales.add(totalSales);
      sales.add(salesAmount);

      midPanel.add(deposited);
      midPanel.add(change);
      midPanel.add(sales);

      getContentPane().add(midPanel, BorderLayout.CENTER);
   }

   public void createSodaPanel()
   {
      class SodaListener implements ActionListener
      {
         public void actionPerformed(ActionEvent event)
         {
            int i = 0;
            int change;
            for(i=0; i<machine.getCount(); i++)
            {
               if(event.getSource() == buttons.get(i))
               {
                  change = machine.dispenseSoda(i);
                  amount.setText("$0.00");
                  changeAmount.setText("$" + String.format("%.2f", change/100.0));
                  salesAmount.setText("$" + String.format("%.2f", machine.getSales()/100.0));
               }
               buttons.get(i).setEnabled(false);
            }
         }
      }

      SodaListener listener = new SodaListener();

      String name;
      int num = machine.getCount();

      JPanel buttonPanel = new JPanel();
      buttonPanel.setLayout(new GridLayout(num,1));
      buttonPanel.setPreferredSize(new Dimension(150,300));
      buttonPanel.setBorder(new EtchedBorder());
      buttons = new ArrayList<JButton>(num);
      JButton temp;

      int i = 0;
      for(i=0; i<num; i++)
      {
         name = machine.getSodaName(i);
         temp = new JButton(name);
         temp.addActionListener(listener);
         temp.setEnabled(false);
         buttons.add(temp);
         buttonPanel.add(temp);
      }
      getContentPane().add(buttonPanel, BorderLayout.WEST);
   }
}
