class withthread extends Thread
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
                 withthread w1=new withthread();
                 w1.start();
                 withthread w2=new withthread();
                 w2.start();
                 for(int x=0;x<10;x++)
                 {
                       System.out.println("the x value is :"+x);
                 }
           }
     
}