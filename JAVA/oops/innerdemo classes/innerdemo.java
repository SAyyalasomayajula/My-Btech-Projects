class A
{
    int a=10;
    static int b=20;

    static class B
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

    A.B b1=new A.B();

    System.out.println(a1.a);

    System.out.println(A.b);

    System.out.println(b1.c);

    System.out.println(A.B.d);
} 
      
}