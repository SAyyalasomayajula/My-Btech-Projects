import java.lang.*;
import java.io.*;
import java.util.*;
class A
{
public	int x;
	void display()
	{
		System.out.println("A class");
	}
};
class B extends A
{
	void display()
	{
		System.out.println("B class");
	}
};

class ovrd 
{
	public static void main(String[] args) 
	{
		A obj1= new A();
		B obj2= new B();
		obj1.display();
		obj2.display();
	}
}
