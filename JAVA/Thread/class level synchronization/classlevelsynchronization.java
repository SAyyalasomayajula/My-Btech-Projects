class classlevelsynchronization implements Runnable 
{
         public void run()
         {
                 display();
         }
         public void display()
         {
                System.out.println(Thread.currentThread().getName());
                synchronized(getClass())
                {
                         for(int i=0;i<10;i++)
                         {
                                 System.out.println("the i value is :"+i);
                         }  
                }
         }
         public static void main(String ... args)
         {
               classlevelsynchronization s1=new classlevelsynchronization();
 
               Thread t1=new Thread(s1,"first");
               t1.start();
               Thread t2=new Thread(s1,"second");
               t2.start();

               classlevelsynchronization s2=new classlevelsynchronization();

               Thread t3=new Thread(s2,"third");
               t3.start();
               Thread t4=new Thread(s2,"fourth");
               t4.start();
         }
}