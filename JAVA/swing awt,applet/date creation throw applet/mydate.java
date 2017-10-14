import java.awt.*;
import java.applet.*;
import java.util.*;

public class mydate extends Applet
{
            public void paint(Graphics g)
            {
                    try
                    {
                             Date d=new Date();
                
                             g.drawString(d.toString(),100,100);

                             Thread.sleep(1000);
                    }
 
                    catch(Exception e)
                    {
                  
                    }

                    repaint();
            }
}


/*
<!mydate.html that embeds mydate applet>
<html>

       <applet code=mydate height=200 width=200>

       </applet>
</html>

  */