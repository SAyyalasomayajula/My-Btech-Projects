class the implements Runnable 
{
	Thread t;
	public the(String threadname)
	{
		t=new Thread(this,threadname);
	}
	public void run()
	{
		System.out.println(Thread.currentThread());
		for (int i=0;i<=5 ;i++ )
		{
			System.out.println(i);
		}
	}
};
	public class ex2
	{
	public static void main(String[] args) 
	{
		the e1=new the("First");
		e1.run();
		System.out.println("This is: "+ Thread.currentThread());
	}
}
	
