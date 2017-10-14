import java.io.*;
import java.util.*;
class ab 
{
	public static void main(String[] args)throws Exception 
	{
		System.out.println("Enter a string value");
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String S=br.readLine();
		int sum=0;
		StringTokenizer st=new StringTokenizer(S," ");
		while (st.hasMoreTokens())
		{
			String s1=st.nextToken();
			int n=Integer.parseInt(s1);
		    System.out.println(n);
			sum=sum+n;
		}
		System.out.println("The sum of all is"+sum);
	}
}
