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
	int x;
	B(int a, int b)
	{
		super.x=a;
		x=b;
	}
	void display()
	{
		System.out.println("B class");
		System.out.println("The value of X in super class is"+super.x);
		System.out.println("The value of X in sub class is"+x);
		super.display();
	}
};
class sup
{
	public static void main(String[] args) 
	{
		B obj= new B(10,20);
		obj.display();
	}
}
