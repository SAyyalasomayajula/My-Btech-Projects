interface A
{
	public void display();
}
interface B
{
	public void show();
}
class C implements A,B 
{
public void display()
	{
		System.out.println("display method in class C");
	}
  public void show()
	{
		System.out.println("Show method in class C");
	}
};
class E implements A,B 
{
public void display()
	{
		System.out.println("display method in class E");
	}
  public void show()
	{
		System.out.println("Show method in class E");
	}
};
class D
{
	public static void main(String[] args) 
	{
		System.out.println("Interface implementation");
		C c=new C();
		c.show();
		c.display();
		E e=new E();
		e.show();
		e.display();
	}
}
