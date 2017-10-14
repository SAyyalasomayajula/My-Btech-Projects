import java.util.*;

class vector
{
      public static void main(String ... args)
      {
             Vector v=new Vector();

             v.add("10");
             v.add("20");
             v.add("5");
             v.add("11");

             System.out.println(v);

             v.setElementAt("22",2);
             System.out.println(v);

             v.removeElementAt(2);
             System.out.println(v);
           
             
      }
}