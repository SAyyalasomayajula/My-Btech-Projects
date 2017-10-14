import java.util.*;
class reverse
{
    public static void main(String ... args) throws Exception
    {
		reverse rs=new reverse();

		Scanner sc=new Scanner(System.in);

		System.out.println("enter the string value");
	
           String str=sc.next();
 
          int len=str.length();

          System.out.println("length of the string is:"+len);

            char[] chararray=new char[len];
			
            int k=len-1;

          for(int j=0;j<len;j++,k--)
          {
              chararray[j]=str.charAt(k);
           }
           System.out.println("the reverse of the string is:");
           System.out.println(chararray);
    }
}