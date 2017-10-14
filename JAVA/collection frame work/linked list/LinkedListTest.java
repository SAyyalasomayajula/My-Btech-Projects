import java.util.*;

class  LinkedListTest
{
	public static void main(String[] args) 
	{
		LinkedList ll=new LinkedList();

		ll.add("ram");
		ll.add("null");
		ll.add("50");
		ll.add("50");
		ll.add("100");

		System.out.println(ll);

		Iterator i=ll.iterator();

		while (i.hasNext())
		{
			Object o=i.next();

			System.out.println(o);
		}
		
	}
}
