class a
{
       public synchronized void show()
       {
              B b1=new B();
              b1.demo();
    
              System.out.println("this method is show()");
       }

       public static void main(String ... agrs)
       {
                 a a1=new a();

                 a1.show();

                 System.out.println("this is main method()");
       }
}


class B

{
         public synchronized void demo()
         {
                 System.out.println("this is demo method()");
         }
}