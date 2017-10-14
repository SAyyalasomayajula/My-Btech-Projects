/* Write a C program to construct a pyramid of numbers. */

#include<stdio.h>
#include<conio.h>

void main()
{
 int num,i,y,x=35;
 clrscr();
 printf("\nEnter the number to generate the pyramid:\n");
 scanf("%d",&num);

 for(y=0;y<=num;y++)
 {
  /*(x-coordinate,y-coordinate)*/
  gotoxy(x,y+1);

  /*for displaying digits towards the left and right of zero*/
  for(i=0-y;i<=y;i++)

  printf("%3d",abs(i));
  x=x-3;
 }
 getch();
}
