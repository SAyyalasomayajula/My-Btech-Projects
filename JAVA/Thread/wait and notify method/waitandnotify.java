class Q
{
       int n;
       boolean valueset=false;
       synchronized int get()
       {
               if(!valueset)
               {
                    try
                    {
                           wait();
                    }  
                    catch(Exception e)
                    {
                          System.out.println(e);
                    }
              }
                    System.out.println("got"+n);
                    valueset=false;
                    notify();
                    return n;
              
       }
       synchronized void put(int n)
       {
               if(valueset)
                {
                        try
                        {
                                   wait();
                        } 
                        catch(Exception e)
                        {
                                    System.out.println("interupted exception");
                        }
                }
                        this.n=n;
                        valueset=true;
                        System.out.println("put"+n);
                        notify();
                
       }
}

class producer implements Runnable
{
          Q q;
          producer(Q q)
          {
               this.q=q;
               new Thread(this,"producer").start();
          }
          public void run()
          {
               int i=0;
               while(true)
              {
                     q.put(i++);
              }
          }
}

class consumer implements Runnable
{
        Q q;
        consumer (Q q)
        {
              this.q=q;
              new Thread(this,"consumer").start();
        }
        public void run()
        {
               int i=0;
               while(true)
               {
                      q.get();
               }
        }
}

class proconfixed
{
         public static void main(String ... args)
         {
                Q q=new Q();
                new producer(q);
                new consumer(q);
                System.out.println("press contron -c to stoop execution");
         }
}