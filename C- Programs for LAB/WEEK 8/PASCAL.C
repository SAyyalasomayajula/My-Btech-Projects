/* Write a C program to generate Pascal's triangle. */

#include<stdio.h>
#include<conio.h>

void main()
{
 int bin,p,q,r,x;
 clrscr();
 bin=1;
 q=0;

 printf("Rows you want to input:");
 scanf("%d",&r);

 printf("\nPascal's Triangle:\n");

 while(q<r)
 {
  for(p=40-3*q;p>0;--p)
  printf(" ");
  for(x=0;x<=q;++x)
  {
    if((x==0)||(q==0))
      bin=1;
    else
      bin=(bin*(q-x+1))/x;
      printf("%6d",bin);
  }

 printf("\n");
 ++q;
 }
getch();
}
