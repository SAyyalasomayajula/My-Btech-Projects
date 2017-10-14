abstract class animal
{
         abstract void sound();

}
class dog extends animal
{
       void sound()
      {
            System.out.println("dog sound is:bow..bow");
       }
}
class tiger extends animal
{
         void sound()
          {
                System.out.println("tiger sound is:rower..rower");
          }
}
class cat extends animal
{
         void sound()
         {
               System.out.println("cat sound is:meow...meow");
         }
}
class animaldemo
{
          public static void main(String ... agrs)
          {
                  dog d=new dog();
                  tiger t=new tiger();
                  cat c=new cat();
                  
                   d.sound();
                    t.sound();
                    c.sound();
          }
}