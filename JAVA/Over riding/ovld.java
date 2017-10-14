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
			int display(int a)
	{
		System.out.println("value of a="+a);
		return 0;
	}

};


class ovld 
{
	public static void main(String[] args) 
	{
		A obj1= new A();
		B obj2=new B();
		obj1.display();
		obj2.display(2);
		}
}
/*class ovld
{
void display()
	{
		System.out.println("A class");
	}
	int display(int a)
	{
		System.out.println("A class");
		return 0;
	}
public static void main(String[] args)
	{
	ovld a=new ovld();
	a.display();
	}
};*/
