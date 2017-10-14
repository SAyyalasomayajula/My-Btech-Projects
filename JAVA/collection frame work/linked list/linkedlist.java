import java.util.*;

class linkedlist
{
        public static void main(String ... args)
        {
                LinkedList ll=new LinkedList();

                ll.add("srinu");
                ll.add("venu");
                ll.add("venky");
                ll.add("subbu");

                System.out.println(ll);

                Iterator i=ll.iterator();

                while(i.hasNext())
                {

                        Object o=i.next();
                       System.out.println(o);
                }
        }
}