import java.awt.*;
import java.applet.*;

public class test extends Applet
{
                            public void paint(Graphics g) 
                            {
                                   try
                                   {
                                       
                                                g.drawString("hello",100,100);
 
                                                 setBackground(Color.red);
                                                  repaint();

                                                                              
                                    }

                                    catch (Exception e)
                                    {
                                         System.out.println(e);
                                    }
                             }     
}


    /*

              <applet code=test height=400 width=400>

               </applet>

      */