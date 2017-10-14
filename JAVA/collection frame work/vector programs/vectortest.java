import java.util.*;

class vectortest
{
     public static void main(String ... args) throws Exception
     {
           Vector v=new Vector();

           System.out.println(v.capacity());
 
           System.out.println(v.size());

           v.add("core");
           v.add("java");
           v.add("advance");

            System.out.println(v.capacity());

            System.out.println(v.size());

            Vector v1=new Vector(v);

            System.out.println(v1.capacity());
            System.out.println(v1.size());
            
            v1.add("j2ee");

            System.out.println(v1.contains("j2ee"));  
              
            v1.setElementAt("22",2);
    
            System.out.println(v1);

           


            


        
     }
}