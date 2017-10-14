import java.io.*;
class fib 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter any number:");
		int n=Integer.parseInt(br.readLine());
		int fib1=0;
		int fib2=1;
		System.out.println(fib1+"\n"+fib2);
		for (int i=3;i<=n ;i++ )
		{
			int fib3=fib1+fib2;
			System.out.println(fib3);
			fib1=fib2;
			fib2=fib3;
		}
	}
}
