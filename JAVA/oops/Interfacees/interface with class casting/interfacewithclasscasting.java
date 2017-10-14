interface calculate
{
            public abstract void sum();
            void sub();
            void mul();

}
class number implements calculate
{
          int a,b;
          void setdata()
          {
                 a=10;
                 b=20;

         } 
         public void sum()
         {

                int x=a+b;
               System.out.println("the sum is :"+x);
        }
        public void sub()
        { 
              System.out.println("the sub is :"+(a-b));
        }
        public void mul()
       {
             System.out.println("the mul is :"+(a*b));
       }
}

class calculationdemo
{
     public static void main(String ... args)
     {
          calculate c=new number();

          ((number)c).setdata();
          c.sum();
          c.sub();
          c.mul();

     }
}




















