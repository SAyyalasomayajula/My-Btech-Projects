class A
{
   void show()
   {
      class B
      {
         void demo()
         {
            System.out.println("this is inner class method");
         }
      }

      B b1=new B();
    
      b1.demo();
   }
}

class innerdemo2
{
   public static void main(String ... args)
   {
        A a1=new A();
  
        a1.show();

        
   }
}