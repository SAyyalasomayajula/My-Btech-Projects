class twosync
{
        public synchronized void show()
        {
               demo();
               System.out.println("show method()");
        }
        public synchronized void demo()
        {
              System.out.println("this is demo method()");
        }
        public static void main(String ... args)
        {
               twosync t=new twosync();
               
               t.show();
                 
                System.out.println("this is main method()");
        }
}