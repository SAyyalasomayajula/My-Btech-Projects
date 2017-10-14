import java.awt.*;
import javax.swing.*;

public class myswing extends JFrame
{
      TextFIeld tf1;
      myswing()
      {
             setLayout(new FlowLayout());

             Container con=getContentPane();

              tf1=new TextField(10);
              tf1.addActionListener(this)


              JButton b1=new JButton("ok");
              con.add(b1);

              setVisible(true);
              pack();

              setDefaultCloseOperation(EXIT_ON_CLOSE);
      }
      public static void main(String ... args)
      {
              new myswing();
      }        
}