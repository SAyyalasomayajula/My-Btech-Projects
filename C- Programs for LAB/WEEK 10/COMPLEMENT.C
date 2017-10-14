/* 2’s complement of a number is obtained by scanning it from right to left and complementing all 
the bits after the first appearance of a 1. Thus 2’s complement of 11100 is 00100. 
Write a C program to find the 2’s complement of a binary number.*/

#include <stdio.h>
#include<conio.h>

void complement (char *a);
void main()
{
 char a[16];
 int i;
 clrscr();
 printf("Enter the binary number");
 gets(a);
 for(i=0;a[i]!='\0'; i++)
 {
  if (a[i]!='0' && a[i]!='1')
  {
   printf("The number entered is not a binary number. Enter the correct number");
   exit(0);
  }
 }
complement(a);
getch();
}
void complement (char *a)
{
 int l, i, c=0;
 char b[16];
 l=strlen(a);
 for (i=l-1; i>=0; i--)
 {
  if (a[i]=='0')
  b[i]='1';
  else
  b[i]='0';
 }
 for(i=l-1; i>=0; i--)
 {
 if(i==l-1)
 {
  if (b[i]=='0')
  b[i]='1';
  else
  {
   b[i]='0';
   c=1;
  }
 }
 else
 {
  if(c==1 && b[i]=='0')
  {
   b[i]='1';
   c=0;
  }
 else if (c==1 && b[i]=='1')
 {
  b[i]='0';
  c=1;
 }
}
}
b[l]='\0';
printf("The 2's complement is %s", b);
}



