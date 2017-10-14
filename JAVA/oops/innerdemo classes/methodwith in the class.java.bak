class Outer
{
	public void methodOne()
	{
        class MethodLocalInner
	    {
			public void sum(int x,int y)
	        {
                System.out.println("the sum is:"+(x+y));
	        }
		}
        MethodLocalInner mi=new MethodLocalInner();
		mi.sum(10,20);
		mi.sum(12214,147510);
		mi.sum(100,200);
	}
	public static void main(String ... args)
	{
	    new Outer().methodOne();
	}
}
