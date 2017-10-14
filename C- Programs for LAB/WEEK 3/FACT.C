/* Write C programs that use both recursive and non-recursive functions
   To find the factorial of a given integer.*/

#include<stdio.h>
#include<conio.h>

unsigned int recr_factorial(int n);
unsigned int iter_factorial(int n);

void main()
{
  int n,i;
  long fact;
  clrscr();
  printf("Enter the number: ");
  scanf("%d",&n);

  if(n==0)
    printf("Factorial of 0 is 1\n");
  else
  {
    printf("Factorial of %d Using Recursive Function is %d\n",n,recr_factorial(n));
    printf("Factorial of %d Using Non-Recursive Function is %d\n",n,iter_factorial(n));
   }
   getch();
}

/* Recursive Function*/
unsigned int recr_factorial(int n) {
    return n>=1 ? n * recr_factorial(n-1) : 1;
}

/* Non-Recursive Function*/
unsigned int iter_factorial(int n) {
    int accu = 1;
    int i;
    for(i = 1; i <= n; i++) {
	accu *= i;
    }
    return accu;
}
