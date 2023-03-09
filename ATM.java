import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.lang.*;
 class ATM
 {
    public static void main(String args[])
   { 
      int balance=0,withdrawal,deposit;
     while (true)
     {
        String choice;
    JOptionPane.showMessageDialog(null, "\n\nChoose option 1 for Deposit\nChoose option 2 for withdrawal\nChoose option 3 for balnce\nChoose option 4 for exit");
      choice=JOptionPane.showInputDialog("Select an option for operation:");
    int val1 = Integer.parseInt(choice);
    Scanner sc=new Scanner(System.in);
    switch(val1)
    {
      case 1:
        String deposit_amount;
       
        deposit_amount=JOptionPane.showInputDialog("Enter amount to deposit");
        int val=Integer.parseInt(deposit_amount);
        balance=balance+val;
       JOptionPane.showMessageDialog(null,"Your amount has been deposited successfully");
        
       JOptionPane.showMessageDialog(null,"Balance:"+balance);
        break;
      case 2:
        String withdraw_amount;
       withdraw_amount=JOptionPane.showInputDialog("Enter withdrawal amount ");
       int val2=Integer.parseInt(withdraw_amount);
        if(balance>=val2)
        {
          balance=balance-val2;
         JOptionPane.showMessageDialog(null,"Collect your money");
        }
        else
        {
         JOptionPane.showMessageDialog(null,"Insufficient balance");
        }
        break;
       
      case 3:
       JOptionPane.showMessageDialog(null,"Available balance : "+balance);
        break;
       case 4:
         System.exit(0);
         break;
        
        }   
    }
  
    }
 }