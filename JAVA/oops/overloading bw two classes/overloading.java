class  A
{
	public void add(int x)
	{
	        System.out.println("the value of x is:"+x);
	 }

	 public void add(int x,int y)
	{
	        System.out.println("the value of x is:"+x);
			System.out.println("the value of y is :"+y);
	 }
}

class B extends A
{
	public void add(int x,int y,int z)
	{
	        System.out.println("the value of x is :"+x);
			System.out.println("the value of y is :"+y);
			System.out.println("the value of z is :"+z);                                                                                        
	}
	public void add(int z,int y,int x,int k)
	{
	      System.out.println("the value of x is :"+x);
		  System.out.println("the value of y is :"+y);
		  System.out.println("the value of z is :"+z);
		  System.out.println("the vlaue of k is :"+k);
	}
}

class demo1
{
	public static void main(String ... args)
	{
	         A a=new A();
			 B b=new B();

			 a.add(10);
			 a.add(10,20);

			 b.add(10,20,30);
			 b.add(10,20,30,40);
	}
}