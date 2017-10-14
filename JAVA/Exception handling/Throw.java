class Throw
{
	static int x=5,y=0,z;
	static int div()
	{
		try
		{
			if(y==0)
			{
				throw new ArithmeticException("divide by zero");
			}
			else 
				return x/y;
		}
			catch(ArithmeticException ae)
			{
				System.out.println("Arithmetic exception cought at div()"+ae);
				throw ae;
			}
	}
	public static void main(String[] args) 
	{
		try
		{
			z=div();
			System.out.println("Z="+z);
		}
		catch(ArithmeticException ae)
			{
				System.out.println("Arithmetic exception cought at main()"+ae);
			}
	}
}
