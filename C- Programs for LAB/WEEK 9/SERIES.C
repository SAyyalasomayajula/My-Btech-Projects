/*Write a C program to read in two numbers, x and n, and then compute the sum of this geometric progression:
1+x+x2+x3+………….+xn For example: if n is 3 and x is 5, then the program computes 1+5+25+125.
Print x, n, the sum Perform error checking. For example, the formula does not make sense
for negative exponents - if n is less than 0. Have your program print an error message if n<0, 
then go back and read in the next pair of numbers of without computing the sum.
Are any values of x also illegal ? If so, test for them too. */

#include<stdio.h>
#include<conio.h>
#include<math.h>

void main()
{
int s_sum,i,x,n;

clrscr();
printf("Enter the values for x and n:");
scanf("%d %d",&x,&n);

if(n<=0 || x<=0)
{
  printf("Value is not valid\n");
}
else
{
  printf("Value is valid\n");
  s_sum=1;
  for(i=1;i<=n;i++)
  {
    s_sum=s_sum+pow(x,i);
  }
  printf("Sum of series=%d\n",s_sum);
}
getch();
}


