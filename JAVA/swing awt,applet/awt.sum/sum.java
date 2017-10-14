import java.awt.*;
import java.awt.event.*;
class sum extends Frame implements ActionListener
{

           TextField tf1,tf2,tf3;
            Button b1;

           sum()
           {

                   setLayout(new FlowLayout());

                   setSize(200,400);
                   setVisible(true);

                   Label l1=new Label("first no");
                   add(l1);
                   tf1=new TextField(10);
                   add(tf1);

                   Label l2=new Label("second no");
                   add(l2);
                   tf2=new TextField(10);
                   add(tf2);

                   Label l3=new Label("sum");
                   add(l3);
                   tf3=new TextField(10);
                   add(tf3);

                   b1=new Button("ok");
                   add(b1);
                   b1.addActionListener(this);
           }
           public void actionPerformed(ActionEvent ae)
           {
                         String s1=tf1.getText();
                         int x=Integer.parseInt(s1);

                         String s2=tf2.getText();
                         int y=Integer.parseInt(s2);

                         int z=x+y;

                         tf3.setText(z+"");
            }
               
         public static void main(String ... args)
         {
                       new sum();
        }
}