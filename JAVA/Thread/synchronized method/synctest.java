class synctest implements Runnable
{
             public synchronized void run()
             {
                   for(int i=0;i<=10;i++)
                   {
                        System.out.println("the i value is:"+i);
                   }
             }
             public static void main(String ... args)
             {
                    synctest st=new synctest();
                    
                    Thread th1=new Thread(st,"first");
                     th1.start();

                    Thread th2=new Thread(st,"second");
                     th2.start();
             }
}