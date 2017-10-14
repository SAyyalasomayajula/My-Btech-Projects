import java.io.*;
class palindrome
{
public static void main(String args[])throws Exception
{
BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter any String:");
String s=br.readLine();
int len,i=0,n,c=0,p;
len=s.length();
n=len/2;
p=len-n+1;
while(i<len/2)
{
if(s.charAt(i)==s.charAt(p))
c++;
i++;
p--;
}
if(c==len/2)
{
System.out.println("palindrome");
}
else
{
System.out.println("not palindrome");
}
}
}