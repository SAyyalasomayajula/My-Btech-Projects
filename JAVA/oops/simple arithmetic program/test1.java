class test1
{
       int a,b;
       test1(int a, int b)
       {
             this.a=a;
             this.b=b;
        } 
        int add()
        {
                    return (a+b);
         }        
 }
class testdemo
{
       public static void main(String[] args)
       {
                   test1 t=new test1(10,20);
                  
                   int sum=t.add();
 
                  System.out.println("the sum is :"+sum);
               
      }

     
}