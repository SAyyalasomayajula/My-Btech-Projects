interface a
{
        void add();
}

 interface b
{
       void add();

}


class c implements a,b
{
       public void add()
       {
             System.out.println("add method is implemented");
       }
       
}

class interfacetest
{ 
        public static void main(String ... args)
        {
              c c1=new c();
              c1.add();
        }
}