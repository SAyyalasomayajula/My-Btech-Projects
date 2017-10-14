	class Nt implements Runnable
	{
		String name;
		Thread t;
		Nt(String threadname)
		{
			name= threadname;
			t=new Thread(this,name);
			System.out.println("New Thread "+t);
			t.start();
		}
		public void run()
		{
			try
			{
				for (int i=5;i>0 ;i-- )
				{
				  System.out.println(name+":"+i);
				  Thread.sleep(1000);
				}
			}
			catch (InterruptedException e)
			{
						System.out.println(name+":"+"Interrupted");
			}
		}
	};
	class Demojoin 
{
	public static void main(String[] args) 
	{
		Nt obj1=new Nt("one");
		Nt obj2=new Nt("two");
		Nt obj3=new Nt("three");
		System.out.println("Thread one is Alive! "+obj1.t.isAlive());
		System.out.println("Thread two is Alive! "+obj2.t.isAlive());
		System.out.println("Thread three is Alive! "+obj3.t.isAlive());
		try
		{
			System.out.println("waiting for threads to finish.");
			obj1.t.join();
			obj2.t.join();
			obj3.t.join();
		}
		catch (InterruptedException e)
		{
			System.out.println("main thread interrupted!");
		}
				System.out.println("Thread one is Alive! "+obj1.t.isAlive());
				System.out.println("Thread two is Alive! "+obj2.t.isAlive());
				System.out.println("Thread three is Alive! "+obj3.t.isAlive());
				System.out.println("main thread exiting.");
	}
}
