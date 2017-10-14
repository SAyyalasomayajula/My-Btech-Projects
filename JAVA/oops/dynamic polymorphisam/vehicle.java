class vehicle
{
       void start()
       {
             System.out.println("vehicle is started");
      }
}

class car extends vehicle
{
       void start()
       {
            System.out.println("key is turn on");
       }

}

class byke extends vehicle
{
       void start()
       {            
           System.out.println("kick rod pressed");
       }

}


class auto extends vehicle
{
      void start()
      {
            System.out.println("pull the rod");
      }
}


class vehicledemo
{
      public static void main(String ... args)
      {
           car c=new car();
           byke b=new byke();
           auto a=new auto();
           
           vehicle v;
  
          v=c;
          v.start();

          v=b;
         v.start();

         v=a;
         v.start();

      }
}