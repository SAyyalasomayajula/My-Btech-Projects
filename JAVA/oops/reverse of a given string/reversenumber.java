import java.util.*;
class reversenumber 
{
	public static void main(String[] args) 
	{
		int r,sum=0;

		reversenumber rs=new reversenumber();
		
		Scanner sc=new Scanner(System.in);

		System.out.println("enter the number");

		int n=sc.nextInt();

		int temp=n;

         while(n!=0)
		{
			  r=n%10;
			  n=n/10;
             System.out.print(r);   
			  sum=(sum*10)+r;
		}
		
		if(sum==temp)
			System.out.println(" Palindram ");
		else
			 System.out.println(" not palindram ");


	}

}
