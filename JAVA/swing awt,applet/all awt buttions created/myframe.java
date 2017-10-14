import java.awt.*;

import java.awt.event.*;

class myframe extends Frame 
{
        myframe()
        {

               setLayout(new FlowLayout());
              
                this.setVisible(true);
                this.setSize(300,500);

                Label l1=new Label("name");
                add(l1);

                TextField tf1=new TextField(10);
                add(tf1);

                Label l2=new Label("password");
                add(l2);
            
                TextField tf2=new TextField(10);
              
                tf2.setEchoChar('*');
                add(tf2);


              
               TextArea ta=new TextArea(10,5);
               add(ta);

               List li=new List(); 

               li.add("sachin");
               li.add("dravid");
               li.add("lakshman");
              
               add(li);
               

              

              Choice c=new Choice();
              

              c.add("sachin");
              c.add("dravid");
              c.add("lakshman");

              add(c);

             
              
               Checkbox cb1=new Checkbox("core java");
               add(cb1);

               Checkbox cb2=new Checkbox("adv java");
               add(cb2);

               Checkbox cb3=new Checkbox("structs");
               add(cb3);
              

               CheckboxGroup cbg=new CheckboxGroup();
               
             
                Checkbox cb4=new Checkbox("corejava",cbg,false);
                add(cb4);

                Checkbox cb5=new Checkbox("advjava",cbg,false);
                add(cb5);

                Checkbox cb6=new Checkbox("structs",cbg,false);
                add(cb6);
        }
      
        public static void main(String ... args)
        {

             new myframe();


              
        }
}