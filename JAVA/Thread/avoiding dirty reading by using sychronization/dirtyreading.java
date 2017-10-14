public class dirtyreading
{
      private String fname;
      private String lname;
  
      public synchronized String getName()
      {
              return fname + "," + lname;
      }
     
      public synchronized void setName(String firstname,String lastname)
      {
              print("entering setnames()");
              fname=firstname;
        
               try
               {
                       Thread.sleep(1000);
               }
               catch(InterruptedException e)
               {
                 
               }
               lname=lastname;
               print("leaving setnames()-"+lname+","+fname);
      }
      
      public static void print(String msg)
      {
             String threadname=Thread.currentThread().getName();
             System.out.println(threadname+":"+msg);           
      }
      public static void main(String ... args)
      {
             final dirtyreading dt=new dirtyreading();

              dt.setName("sachin","tendulkar");

              Runnable run1=new Runnable()
                      {
                            public void run()
                            {
                                   dt.setName("rahul","dravid");
                            }
                      };
              
               Thread t1=new Thread(run1,"thread1");
               t1.start();
               try
               {
                      Thread.sleep(200);
               }
               catch(InterruptedException e)
               {

               }
              
                Runnable run2=new Runnable()
                        {
                               public void run()
                               {
                                       print("getnames()="+dt.getName());
                               }
                        };
 
                Thread t2=new Thread(run2,"thread2");
                t2.start();

      }
}