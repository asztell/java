import java.awt.*;
import javax.swing.*;
import java.util.*;

public class Demo
{

 public static void main(String [] args)
 {
   System.out.println("Hello From Jupiter");
   APerson p1 = new APerson();
   p1.setFName("Lisa");
   p1.setAge(21);
    System.out.println(" Happy Valentines... "+p1.getFName());
   
   Font f= new Font("times new romans",Font.BOLD+Font.ITALIC,24);
   
   
   JTextArea jt= new JTextArea(20,30);
   jt.setFont(f);
   jt.setBackground(Color.BLACK);
   jt.setForeground(Color.WHITE);
   jt.setText("Hello From Jupiter");
   JOptionPane.showMessageDialog(null,jt);
   JOptionPane.showMessageDialog(null,"Hello From Jupiter");
   System.exit(0);
 
 }


}

