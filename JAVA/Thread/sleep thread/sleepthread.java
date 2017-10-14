class sleepthread extends Thread
{
         public void run()
         {
              try
              { 
                       for(int i=0;i<10;i++)
                      {
                           System.out.println("the i value is :"+i);
                            sleep(1000);
                      }
               }
               catch(Exception e)
               {
                        System.out.print(e);
               }
          }
          public static void main(String[]args)
          {
                sleepthread st1=new sleepthread();
                
                  st1.start();

                 sleepthread st2=new sleepthread();
                 
                 st2.start();

                
                 
          }
}