class threadtest extends Thread
{
     public static void main(String ... agrs)
     {
            
            Thread t=new Thread();
             boolean b=t.isDaemon();
            System.out.println(b);
           
            t.setDaemon(true);
            t.start();
         System.out.println(t.isDaemon());
            
     }
}