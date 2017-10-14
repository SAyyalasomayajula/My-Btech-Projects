class withthread implements Runnable
{
           public void run()
           {
                 for(int i=0;i<10;i++)
                 {
                       System.out.println("the i value is :"+i);
                 }
           }
           public static void main(String[] args)
           {
                 withthread w=new withthread();
                 Thread t=new Thread(w);
                 t.start();
                 for(int x=0;x<10;x++)
                 {
                       System.out.println("the x value is :"+x);
                 }
           }
     
}