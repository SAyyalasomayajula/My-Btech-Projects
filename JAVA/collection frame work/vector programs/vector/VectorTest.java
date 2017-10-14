import java.util.*;

class VectorTest 
{
	public static void main(String[] args) 
	{
		Collection c=new Vector();

		System.out.println(((Vector)c).capacity());

		System.out.println(c.size());

		c.add("10");

         c.add("20");
		 c.add("30");
		 c.add("40");

		 System.out.println(c);

		 System.out.println(((Vector)c).capacity());

		 System.out.println(c.size());

		 Vector v=new Vector(c);

		 System.out.println(v.capacity());
		 System.out.println(v.size());

		 v.add("j2ee");

		 System.out.println(v);

		 v.add("30");

		 System.out.println(v);

		 System.out.println(v.capacity());

		 System.out.println(v.size());

		 v.trimToSize();

		 System.out.println(v.capacity());

		 System.out.println(v.size());

           
		  boolean b=v.contains("j2ee");
		  System.out.println(b);

		  System.out.println(v.contains("20"));

		  System.out.println(v.elementAt(0));

		  System.out.println(v.firstElement());

		  System.out.println(v.lastElement());

		  v.setElementAt("22",1);

		  System.out.println(v);

		  v.removeElementAt(1);

		  v.removeElement("j2ee");

		  System.out.println(v);

		  v.insertElementAt("15",1);

		  v.addElement("10");

		  Object o=v.clone();
          Vector v1=(Vector)o;


		  v.removeAllElements();

		  Object o1=v1.clone();

		  Vector v2=(Vector)o1;

		  v2.clear();

		  System.out.println(v);
		  System.out.println(v1);
		  System.out.println(v2);

		  v.add("10");
		  v.add("20");
		  v.add("30");
 
		  v2.add("40");
		  v2.add("50");
		  v2.add("60");

           System.out.println(v);
		   System.out.println(v1);
		   System.out.println(v2);

		   v.addAll(v1);
		   System.out.println(v);

            v.containsAll(v1);
			System.out.println(v);

		   v1.addAll(2,v2);

		   v1.removeAll(v2);
		   System.out.println(v1);

		   v.retainAll(v1);
		   System.out.println(v);

		   System.out.println(v.hashCode());


	}
}
d