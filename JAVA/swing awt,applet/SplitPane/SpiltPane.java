import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.event.*;

public class SpiltPane {  
   public static void main(String[] args){  
     JFrame frame = new SplitPaneFrame();
      frame.show();
   }
}
class SplitPaneFrame extends JFrame   implements ListSelectionListener{ 
  public SplitPaneFrame(){
    setSize(400, 300);
      list = new JList(texts);
      list.addListSelectionListener(this);
      description = new JTextArea();
      JSplitPane innerPane= new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, list, description);
     getContentPane().add(innerPane, "Center");
   
   }
   public void valueChanged(ListSelectionEvent event)   {  JList source = (JList)event.getSource();
      Display value = (Display)source.getSelectedValue();
      description.setText(value.getDescription());
   }
   private JList list;
   private JTextArea description;
   private Display[] texts =
      {  new Display("Text1", "This is text1."),
         new Display("Text2", "This is text2."),
         new Display("Text3", "This is text3."),
         new Display("Text4", "This is text4.")       
      };
}
class Display{
  public Display(String n, String t){
    name = n;
      des = t;
      }
   public String toString(){  
     return name;
   }
   public String getDescription(){ 
     return des;
   }
   private String name;
   private String des;
}