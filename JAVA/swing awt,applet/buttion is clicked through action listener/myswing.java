import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class myswing extends JFrame implements ActionListener
{
                 TextField tf;
                 myswing()
                 {
                          setLayout(new FlowLayout());

                          Container con=getContentPane();
                          
                          tf=new TextField(10);
                          con.add(tf);
                      
                          JButton jb=new JButton("ok");
                         jb.addActionListener(this);
                         con.add(jb);   
 
                         setVisible(true);
                         pack();

               }          
  
               public void actionPerformed(ActionEvent ae)
               {
                         tf.setText("button is clicked");
               }

               public static void main(String ... args)
               {
                       new myswing();
               }

}