class staticsynchronization implements Runnable 
{
         public void run()
         {
                 display();
         }
         public static synchronized void display()
         {
                System.out.println(Thread.currentThread().getName());
                for(int i=0;i<10;i++)
                {
                          System.out.println("the i value is :"+i);
                }
         }
         public static void main(String ... args)
         {
               staticsynchronization s1=new staticsynchronization();
 
               Thread t1=new Thread(s1,"first");
               t1.start();
               Thread t2=new Thread(s1,"second");
               t2.start();

               staticsynchronization s2=new staticsynchronization();

               Thread t3=new Thread(s2,"third");
               t3.start();
               Thread t4=new Thread(s2,"fourth");
               t4.start();
         }
}