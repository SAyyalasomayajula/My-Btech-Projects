/*interface A
{
	public void display();
}*/
interface B
{
	public void show();
}
class C implements B 
{
/*	A display()
	{
		System.out.println("display method");
	}*/
	B show()
	{
		System.out.println("Show method");
	}
};
class D
{
	public static void main(String[] args) 
	{
		System.out.println("Interface implementation");
		C c=new C();
		//c.display();
		c.show();
	}
}
