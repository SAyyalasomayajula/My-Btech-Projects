class jointhread implements Runnable
{
      public void run()
      {
            for(int i=0;i<10;i++)
            {
                     System.out.println("the i value is:"+i);
            }
                     
     }
     public static void main(String ... args) throws Exception
     {
           jointhread jt=new jointhread();
          
           Thread t=new Thread(jt);
           t.start();
           t.setPriority(8);
           System.out.println(t.getPriority());
           t.join();
           int x=50;
           int y=100;
           System.out.println("the sum of x and y value is:" +(x+y));
           System.out.println("main is complited");
     }
}