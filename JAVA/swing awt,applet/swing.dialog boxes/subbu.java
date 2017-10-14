import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class subbu extends JFrame implements ActionListener
{
           subbu()
           {

                   setLayout(new FlowLayout());

                  Container con=getContentPane();
 
                  JButton jb=new JButton("click");

                  con.add(jb);

                  jb.addActionListener(this);

                  setVisible(true);

                  pack();

           }

           public void actionPerformed(ActionEvent ae)
           {
                 // JOptionPane.showConfirmDialog(this,"sathya");

                    JOptionPane.showMessageDialog(this,"sathya");

                   //  JOptionPane.showInputDialog(this,"sathya");
          }

          public static void main(String ... args)
          {
                    new subbu();
          }
}