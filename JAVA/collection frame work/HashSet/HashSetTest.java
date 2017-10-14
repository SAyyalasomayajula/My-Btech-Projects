import java.util.*;

class  HashSetTest
{
	public static void main(String[] args) 
	{
		HashSet hs=new HashSet();

		hs.add("10");
		hs.add("20");
		hs.add("30");
		hs.add("30");
		hs.add("40");

		hs.add("40");
		hs.add("50");
		hs.add("50");
		hs.add("60");
		hs.add("70");

		System.out.println(hs);

	}
}
