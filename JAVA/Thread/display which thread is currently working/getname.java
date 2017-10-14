class xyz
{
            public static void main(String ... args)
            {
                   Thread t=new Thread("second");
                    System.out.println(Thread.currentThread().getName());
            }
}