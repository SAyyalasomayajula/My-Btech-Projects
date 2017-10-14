import java.awt.*;
import java.awt.event.*;
class mymouseadapter extends Frame 
{
         mymouseadapter()
         {
               setVisible(true);
               setSize(100,200);
               addMouseListener(new MouseAdapter()
                                             {
                                                   public void mouseEntered(MouseEvent me)
                                                   {
                                                          System.out.println("mouse is entered");
                                                   }
                                             });
         }
         public static void main(String ... args)
         {
                   new mymouseadapter();
         }
}                                                                                               