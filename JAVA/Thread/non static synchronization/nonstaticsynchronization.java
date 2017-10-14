class nonstaticsynchronization implements Runnable 
{
         public void run()
         {
                 display();
         }
         public synchronized void display()
         {
                System.out.println(Thread.currentThread().getName());
                for(int i=0;i<10;i++)
                {
                          System.out.println("the i value is :"+i);
                }
         }
         public static void main(String ... args)
         {
               nonstaticsynchronization s1=new nonstaticsynchronization();
 
               Thread t1=new Thread(s1,"first");
               t1.start();
               Thread t2=new Thread(s1,"second");
               t2.start();

               nonstaticsynchronization s2=new nonstaticsynchronization();

               Thread t3=new Thread(s2,"third");
               t3.start();
               Thread t4=new Thread(s2,"fourth");
               t4.start();
         }
}