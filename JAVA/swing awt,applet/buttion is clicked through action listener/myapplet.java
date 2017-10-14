
/*
       <applet code=myapplet width=300 height=400>

        </applet>
*/


import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class myapplet extends Applet implements ActionListener
{
              TextField tf;
              public myapplet()
              {
                      Label l1=new Label("display");
                      add(l1);

                      tf=new TextField(10);
                      add(tf);
 
                      Button b=new Button("ok");
                      b.addActionListener(this);
                      add(b);
            }

            public void actionPerformed(ActionEvent ae)
            {
                  tf.setText("buttion is clicked");
            }

}
