interface pvehicle
{
     void petrostart();

     interface dvehicle
     {
          void diselstart();


      }
      interface gvehicle
      {
         
          void gasstart();
      }

}


class car implements pvehicle
{
     public void petrostart()
     {
         System.out.println("car is started by petrol");     

     }

}

class bus implements pvehicle.dvehicle
{
      public void diselstart()
     {
           System.out.println("bus is started by diesel");
     


     }

}

class auto implements pvehicle.gvehicle

{
     public void gasstart()
     {
           
         System.out.println("auto is strated with gas");

     }

}


class vehicledemo
{
 
    public static void main(String[] args)
   {
     car c=new car();

       c.petrostart();


     bus b=new bus();

      b.diselstart();

     auto a=new auto();

      a.gasstart();

    }


}
































