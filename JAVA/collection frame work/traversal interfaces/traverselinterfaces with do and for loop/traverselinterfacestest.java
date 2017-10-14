import java.util.*;

class traverselinterfacestest
{
       public static void main(String ... args)
       {
              
                   Vector v=new Vector();

                   v.add("srinu");
                   v.add("venu");
                   v.add("prasad");
                   v.add("koti");


               /*    Iterator i=v.iterator();

                 do
                   {
                          System.out.println(i.next());

                   }while(i.hasNext());

                                 */


                      Iterator i=null;

                     for(i=v.iterator();i.hasNext();)
                     {
                              System.out.println(i.next());
                     }

                   
       }
}