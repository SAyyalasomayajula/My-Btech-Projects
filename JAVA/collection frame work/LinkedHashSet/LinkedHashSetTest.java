import java.util.*;

class  LinkedHashSetTest
{
	public static void main(String[] args) 
	{
		LinkedHashSet lhs=new LinkedHashSet();

		lhs.add("10");
		lhs.add("20");
		lhs.add("30");
		lhs.add("30");
		lhs.add("40");

		lhs.add("40");
		lhs.add("50");
		lhs.add("50");
		lhs.add("60");
		lhs.add("70");

		System.out.println(lhs);

	}
}
