class methodwithintheconstructer
{
        public static void main(String ... args)   
        {
                  Runnable r1=new Runnable()
                  {
                        public void run()
                        {
                              for(int i=0;i<10;i++)
                              {
                                      System.out.println("srinu"); 
                             }
                        }
                  };

                  Thread th1=new Thread(r1);
                  th1.start();


                Runnable r2=new Runnable()
                {
                     public void run()
                     {
                           int x=0;
                           do
                           {
                                 System.out.println("naga");
                                  x++;
                           }while(x<10);
                     }
                };

                Thread th2=new Thread(r2);
                 th2.start();
        }
}