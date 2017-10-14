class A
{
        int a=10;
        static int b=20;
 
         class B
         {
                  int c=30;
         }
}

class innerdemo
{
          public static void main(String ... args)
          {
                  A a1=new A();

                  System.out.println(a1.a);                 
                   System.out.println(a1.b);

                   A.B b1=a1.new B(); //A.B b1=new A().new B();

                   System.out.println(b1.c);
          }
}