import java.util.*;
class arithmetic
{
      int a,b;
      void input(int a,int b)
      {
          this.a=a;
          this.b=b;
     }
     void output()
     {
         System.out.println("enter the value of a:"+a);
         System.out.println("enter the value of b:"+b);
    }
    void objectsarithmetic(arithmetic x,arithmetic y)
    { 
        a=x.a+y.a;
        b=x.b+y.b;
        System.out.println("the value of a is:"+a);
        System.out.println("the value of b is:"+b);
    }
}
class demo
{
   public static void main(String[] args)
   {
      
         Scanner s= new Scanner(System.in);
         System.out.println("enter the values of a and b");
      
         int p=s.nextInt();
         int q=s.nextInt();
         int r=s.nextInt();
         int t=s.nextInt();

         arithmetic a1=new arithmetic();
         a1.input(p,q);
         a1.output();
       
         arithmetic a2=new arithmetic();
         a2.input(r,t);
         a2.output();

         arithmetic a3=new arithmetic();
         a3.objectsarithmetic(a1,a2);
         a3.output();

    }


}