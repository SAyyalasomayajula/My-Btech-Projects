import java.lang.*;
import java.io.*;
import java.util.*;
class A
{
	void callme()
	{
		System.out.println("A class");
	}
};
class B extends A
{
	void callme()
	{
		System.out.println("B class");
	}
};
	class C extends A
{
	void callme()
	{
		System.out.println("C class");
	}
};


class DMD
{
	public static void main(String[] args) 
	{
	    A obj1=new A();
		B obj2=new B();
		C obj3=new C();
		A r;
		r=obj1;
		r.callme();
		r=obj2;
		r.callme();
		r=obj3;
		r.callme();
	}
}
