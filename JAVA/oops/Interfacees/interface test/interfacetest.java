interface xyz
{
        public void x();
}

class test implements xyz
{
	public void x()
	{
	         System.out.println("this is sub class x method()");
	}

	public void y()
	{
	      System.out.println("this is sub class y method()");
	}
    
	public static void main(String ... args)
	{
	 
	          xyz a=new test();
	          a.x();

			  //a.y(); it is not possible

			  test t=new test();
           	  t.y();
	}
}