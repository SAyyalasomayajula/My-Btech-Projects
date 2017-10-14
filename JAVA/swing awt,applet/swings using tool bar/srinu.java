import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class srinu extends JFrame 
{

          srinu()
          {
               super("srinu");

               setSize(100,200);
               setLocation(200,200);

               JMenu file=new JMenu("file");

               file.setMnemonic(KeyEvent.VK_F);

               file.add(new JMenuItem("open"));
               file.add(new JMenuItem("save"));
               file.add(new JMenuItem("print"));
               file.add(new JMenuItem("saveas"));
 
               JMenu New=new JMenu("new");
               
               New.add(new JMenuItem("java"));
               New.add(new JMenuItem("c"));
               New.add(new JMenuItem("c++"));

               file.add(New);

               file.addSeparator();


               JMenuItem Quit=new JMenuItem("Quit");

               Quit.setMnemonic(KeyEvent.VK_Q);
               Quit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X,Event.CTRL_MASK));

               Quit.addActionListener(new ActionListener()
                                                    {
                                                           public void actionPerformed(ActionEvent ae)
                                                            {
                                                                        System.exit(0);
                                                            }
                                                    });

               file.add(Quit);

               JMenuBar mb=new JMenuBar();
               mb.add(file);
     
              setJMenuBar(mb);

          }

          public static void main(String ... args)
          {
                
                   JFrame jf=new srinu();

                  jf.addWindowListener(new WindowAdapter()
                                                   {
                                                        public void windowAdapter(WindowEvent we) 
                                                        {
                                                                
                                                                            System.exit(0);
                                                                
                                                                
                                                        }
                                                   });

                   

                  jf.setVisible(true);
          }
}