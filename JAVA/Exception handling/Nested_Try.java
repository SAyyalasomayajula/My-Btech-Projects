class Nested_Try 
{
	public static void main(String[] args) 
	{
		try
		{
		  int x=args.length;
		System.out.println("X="+x);
		int y=2/x;
		System.out.println("Y="+y);
		try
		{
			if(x==1)
				x=x/(x-x);
			if (x==2)
			{
				int c[]={1};
				c[2]=30;
			}
		}
		catch(ArrayIndexOutOfBoundsException e)
			{
			System.out.println("Out of bound exception"+e);
			}
			catch(ArithmeticException e)
			{
			System.out.println("Arithmetic exception"+e);
			}
		}
		catch(Exception e)
			{
			System.out.println(" cought exception"+e);
			}
		}
	}
