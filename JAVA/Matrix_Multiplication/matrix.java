import java.io.*;
import java.lang.*;
class matrix 
{
public static void main(String args[])throws IOException
{
int i,j,k;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter no of rows and columns of first matrix");
int m=Integer.parseInt(br.readLine());
int n=Integer.parseInt(br.readLine());
System.out.println("enter no of rows and columns of second matrix");
int p=Integer.parseInt(br.readLine());
int q=Integer.parseInt(br.readLine());
int a[][]=new int[m][n];
int b[][]=new int[p][q];
if(n==p)
{
System.out.println("enter the elements of the matrix");
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
a[i][j]=Integer.parseInt(br.readLine());
}
}
System.out.println("Enter the elements of second matrix");
for(i=0;i<p;i++)
{
for(j=0;j<n;j++)
{
b[i][j]=Integer.parseInt(br.readLine());
}
}
int c[][]=new int[m][q];
for(i=0;i<n;i++)
{
for(j=0;j<p;j++)
{
c[i][j]=0;
for(k=0;k<n;k++)
{
c[i][j]+=a[i][k]*b[k][j];
}
}
}
System.out.println("The result matrix is");
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
System.out.println(c[i][j]);
}
}
}
else
{
System.out.println("Matrix multiplication is not possible");
}
}
}


