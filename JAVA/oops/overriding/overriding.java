class class1 
{
	int a=10;
	int b=20;

	void add1()
	{
	      System.out.println("from super class");
	}
}
class class2 extends class1
{
	  void add2()
	  {
	        System.out.println("from sub class");
	  }
}
class demo
{
       public static void main(String ... args)
	   {
	         class1 x=new  class1();
			 class1 y=new  class2();

	         //((class2)x).add2();
			 //y.add2();

			 //x=y;
	         //x.add();

			  ((class2)y).add2();
			 // y.add2();

			 class2 c2=(class2)y;
			 c2.add2();


	   }
}
