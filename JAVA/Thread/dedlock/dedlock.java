class A
{
          synchronized void foo(B b)
          {
                   try
                   {
                           Thread.sleep(5000);
                   }
                   catch(InterruptedException e)
                   {
                           
                   }
                   b.show();
         }
         synchronized void demo()
         {
                   System.out.println("inside a demo");
         }
}

class B
{
          synchronized void bar(A a)
          {
                  try
                  {
                           Thread.sleep(15000);
                  }
                  catch(InterruptedException e)
                  {
                           System.out.println("an exedption has raised");
                  }
                  a.demo();
          }
          synchronized void show()
          {
                        System.out.println("in side b show");
          }
}

class dedlock implements Runnable
{
                  A a=new A();

                  B b=new B();

                  dedlock()
                  {
                         Thread t=new Thread(this,"child thread");
                          t.start();
                          a.foo(b);
                  }
                  public void run()
                  {
                         b.bar(a);
                  }
                  public static void main(String ... args)
                  {
                         new dedlock();
                  }
          
}