import java.util.*;

class traverselinterfacees
{
          public static void main(String ... args)
          {
                    Vector v=new Vector();

                     v.add("10");
                     v.add("20");

                     Enumeration e=v.elements();

                     while(e.hasMoreElements())
                     {
                           System.out.println(e.nextElement());
                    }

                 /*   Iterator i=v.iterator();
    
                     while(i.hasNext());                                 use any one of these three
                     {
                           System.out.println(i.next());
                    }

                     ListIterator li=v.listIterator();

                     while(li.hasNext())
                     {
                           System.out.println(li.next());
                     }
                             */
          }
}