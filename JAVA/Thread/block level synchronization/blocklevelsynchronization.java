class blocklevelsynchronization implements Runnable 
{
         public void run()
         {
                 display();
         }
         public void display()
         {
                System.out.println(Thread.currentThread().getName());
                synchronized(this)
                {
                          for(int i=0;i<10;i++)
                          {
                                     System.out.println("the i value is :"+i);
                          }
                }
         }
         public static void main(String ... args)
         {
               blocklevelsynchronization s1=new blocklevelsynchronization();
 
               Thread t1=new Thread(s1,"first");
               t1.start();
               Thread t2=new Thread(s1,"second");
               t2.start();

               blocklevelsynchronization s2=new blocklevelsynchronization();

               Thread t3=new Thread(s2,"third");
               t3.start();
               Thread t4=new Thread(s2,"fourth");
               t4.start();
         }
}