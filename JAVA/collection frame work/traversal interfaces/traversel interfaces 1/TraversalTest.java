import java.util.*;

class TraversalTest 
{
	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList();

		al.add("10");
		al.add("20");
		al.add("30");

		Iterator i=al.iterator();

		while(i.hasNext())
		{
		         System.out.println(i.next());
		}

		ListIterator li=al.listIterator();

		while (li.hasNext())
		{
			   System.out.println(li.next());
		}

		while(li.hasPrevious())
		{
		        System.out.println(li.previous());
		}
	}
}
