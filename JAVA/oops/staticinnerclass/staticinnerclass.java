class A
{
          int a=10;

          static int b=20;
     
           static class  B
           {
                   int c=30;
                   static int d=40;
           }
}


class innerdemo
{
         public static void main(String ... args)
         {
               A a1=new A();

               System.out.println("the a value is "+a1.a);

               System.out.println("the b vlaue is "+a1.b);


                A.B b1=new A.B();
                
                System.out.println("the c value is "+b1.c);

                System.out.println("the d vale is "+A.B.d);
         }
}