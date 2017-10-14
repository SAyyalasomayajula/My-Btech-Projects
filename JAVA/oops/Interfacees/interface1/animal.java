   interface  animal
  {
	 
   public void talk();
   public void food();
   
   }


   class Cat implements animal                   
  {   
	 
   public void talk()                             
   {                                       
     System.out.println("meo... meo");   
   }                                        

   public void food()
   {
     System.out.println("Drink MILK");
   }

 }


  class Dog implements animal                   
  {   
	 
    public void talk()                             
   {                                       
     System.out.println("bow.......bow");   
   }                                        

    public void food()
   {
     System.out.println("eat.......meat");
   }

 }

 class animaldemo
{

  public static void main(String[] args)
  {

              Dog d=new Dog();
              d.talk();
              d.food();

              Cat c = new Cat();
              c.talk();
              c.food();

              

  }

}
