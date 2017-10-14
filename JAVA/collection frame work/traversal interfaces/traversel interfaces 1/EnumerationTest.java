import java.util.*;

class EnumerationTest 
{
	public static void main(String[] args) 
	{
		Vector v1=new Vector();

		v1.add("10");
		v1.add("20");
		v1.add("30");

		Enumeration e=v1.elements();

		while(e.hasMoreElements())
		{
		         System.out.println("the elements of vector by using Enumeration :"+e.nextElement());
		}

		Iterator i=v1.iterator();

		while(i.hasNext())
		{
		        System.out.println("the elements of vector by using Iterator"+i.next());
		}

		ListIterator li=v1.listIterator();

		while(li.hasNext())
		{
		       System.out.println("the elements of vector by using list Iterator with forword direction"+li.next());
		}

		while(li.hasPrevious())
		{
		       System.out.println("the elements of vector by using list iterator with backword direction"+li.previous());
		}
	}
}
