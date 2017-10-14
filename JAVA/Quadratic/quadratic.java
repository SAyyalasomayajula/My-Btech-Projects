import java.io.*;
class quadratic
{
public static void main(String arg[])throws IOException
{
double r1,r2,real,img;
System.out.println("enter a,b,c values");
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
float a=Float.parseFloat(br.readLine());
float b=Float.parseFloat(br.readLine());
float c=Float.parseFloat(br.readLine());
float d=((b*b)-(4*a*c));
if(d>0)
{
System.out.println("roots are real and distint");
r1=(-b+(Math.sqrt(d)))/(2*a);
r2=(-b-(Math.sqrt(d)))/(2*a);
System.out.println("first root is "+r1);
System.out.println("second root is "+r2);
}
else
if(d==0)
{
System.out.println("roots are real and equql");
r1=(-b)/(2*a);
r2=(-b)/(2*a);
System.out.println("first root is"+r1);
System.out.println("second root is"+r2);
}
else
{
System.out.println("roots are imaginary");
}
}
}