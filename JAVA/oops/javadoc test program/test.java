public class test
{
         int a,b;
         test(int a,int b)
         {
                   this.a=a;
                   this.b=b;

          }
          int add()
          {
                   return a+b;
          }
}
class testdemo
{
         public static void main(String[] args)
         {
                test t=new test(10,20);
                int sum=t.add();
                System.out.println("the sum is :"+sum);
         }
}

