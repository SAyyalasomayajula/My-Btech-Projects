import java.awt.*;
import java.awt.event.*;
class total extends Frame implements ActionListener
{

           TextField tf1,tf2,tf3;
            Button b1,b2;

           total()
           {

                   setLayout(new FlowLayout());

                   setSize(200,400);
                   setVisible(true);

                   
                   addWindowListener(new WindowAdapter()
                                                  {
                                                           public void windowClosed(WindowEvent we)
                                                           {
                                                                     System.out.println("window is closed");
                                                           }
                                                   });

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

                  b2=new Button("cancel");
                   add(b2);
                   b2.addActionListener(this);

           }
           public void actionPerformed(ActionEvent ae)
           {
               
                         String s=ae.getActionCommand();

                         if(s.equals("ok"))
                         {
                                 String s1=tf1.getText();
                                 int x=Integer.parseInt(s1);

                                 String s2=tf2.getText();
                                 int y=Integer.parseInt(s2);

                                 int z=x+y;

                                 tf3.setText(z+"");

                       }
                
                       else
                       {
                       
                                 tf1.setText(" ");
                                 tf2.setText(" ");
                                 tf3.setText(" ");
                       }     
          }
          
         
         public static void main(String ... args)
         {
                       new total();
        }
}