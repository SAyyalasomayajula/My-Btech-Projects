import java.util.*;

class  StackTest
{
	public static void main(String[] args) 
	{
		Stack s=new Stack();

		s.push("10");
		s.push("20");
		s.push("30");
		s.push("40");
		s.push("50");

		System.out.println(s);

		Object o=s.pop();
		System.out.println(o);

		System.out.println("last inserted is :"+s.peek());

		System.out.println("is this stack is empty ?    "+ s.empty());

                int i=s.search("30");

		System.out.println(i);


	}
}
