interface a
{
           void start();
           interface b
           {
            void stop();
           }
           class c implements b
            {
                  public void stop()
                  {
                        System.out.println("key is turn off");
                  }
             }
}
class d implements a
{
          public void start()
          { 
                System.out.println("key is turn on");
          }
}
class interfacetest
{
        public static void main(String[] args)
        {
               d d1=new d();
               d1.start();
        }
}
