import java.lang.Thread;

class threadtest extends Thread
{
           public void run()
           {
                 	if(Thread.currentThread().getName().equals("first"))
                 {
                       disp();
                 }
                else
                {
                      show();
                }
          }
          void disp()
          {
                 for(int i=0;i<10;i++)
                 {
                       System.out.println("the i value is:"+i);
                      
                 }
          }
          void show()
          {
                 int p=0;
                 while(p<10)
                {
                      System.out.println("the p value is:"+p);
                      p++;
                }
          }
          public static void main(String ... args)throws InterruptedException
          {
                  threadtest t=new threadtest();
	try
	{
	
                 
                  Thread th1=new Thread(t,"first");
                  th1.start();
	   sleep(2000);		
                  Thread th2=new Thread(t,"second");
                  th2.start();

	  sleep(2000);	
 
                   int x=0;
                 	do
                 	{
                         	System.out.println("the x value is:"+x);
                         	x++;
                 	}
		while(x<10);
	}
	catch(Exception e)
	{
	System.out.println(e);
	}	
	
                 
                  
          }
}

	