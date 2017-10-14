class  A 
{
	public void add(int a,int b)
	{
	      int c=a+b;

		  System.out.println("the sum of the a and b value is :"+(a+b));
	}

	public void add(int a,int b,int c)
	{
	       int d=a+b+c;

		   System.out.println("the sum of a,b and value is :"+(a+b+c));
	}

}



class B   extends A
{
        public static void main(String ... args)
	   {
		         B b=new B();

				 A a=new A();

				 

				 a.add(10,20,30);
		         
		}

}
