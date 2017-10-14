import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class venu extends JFrame implements MouseListener
{

          JPopupMenu pm;
          JMenuItem mi1,mi2;

          venu()
          {
               super("srinu");

               setLayout(new FlowLayout());

                Container con=getContentPane();
 
               Label l=new Label("name");

                con.add(l);
               
               TextField  tf=new TextField(10);
               con.add(tf);

                JButton jb3=new JButton("srinu");
                con.add(jb3);
              
               Label l1=new Label("password");
               con.add(l1);
               JPasswordField jf1=new JPasswordField(10);
               con.add(jf1);

                pm=new JPopupMenu("subbu");

                mi1=new JMenuItem("properties");
                mi2=new JMenuItem("refresh");

                pm.add(mi1);
                pm.add(mi2);
                add(pm);
                addMouseListener(this);

               setSize(100,200);
               setLocation(200,200);

              
              JButton jb=new JButton("ok");
              con.add(jb);
              setSize(100,200);
              setVisible(true);

              JButton jb2=new JButton("cancel");
              con.add(jb2);

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

           public void mouseEntered(MouseEvent me)
           {}
           public void mouseExited(MouseEvent me)
           {}
           public void mouseClicked(MouseEvent me)
           {}
           public void mouseReleased(MouseEvent me)
           {}
           public void mousePressed(MouseEvent me)
           {
                 pm.show(me.getComponent(),me.getX(),me.getY());
          }
          
          public static void main(String ... args)
          {
                   JFrame jf=new venu();

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