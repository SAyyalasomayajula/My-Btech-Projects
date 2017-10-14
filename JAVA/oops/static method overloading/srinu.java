class main
{
	static void method()
	{
	       System.out.println("this is the output of main method ");
	}
}

class srinu extends main
{
	static void method()
	{
	       System.out.println("this is the output of method srinu");
	}
}

class venky extends srinu
{
	      static void method()
	{
	       System.out.println("this is the output of method venky");
	}
         
}

class demo  
{
       public static void main(String ... args) 
	  {
	          
	          
		               venky v=new venky();
					   srinu s=new srinu();

					   s.method();
                      // v.method();

					     s=v;
					     ((venky)s).method();
		     
	   }

}
