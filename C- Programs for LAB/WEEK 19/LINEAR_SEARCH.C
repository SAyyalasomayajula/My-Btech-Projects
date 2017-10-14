/* Write C programs  that use both recursive and non recursive functions 
to perform the following searching operation for a Key value in a given list of integers :
i) Linear search */

#include <stdio.h>
#define MAX_LEN 10

void l_search_recursive(int l[],int num,int ele);
void l_search(int l[],int num,int ele);
void read_list(int l[],int num);
void print_list(int l[],int num);

void main()
{
    int l[MAX_LEN], num, ele;
    int ch;

    clrscr();

    printf("======================================================");
    printf("\n\t\t\tMENU");
    printf("\n=====================================================");
    printf("\n[1] Linary Search using Recursion method");
    printf("\n[2] Linary Search using Non-Recursion method");
    printf("\n\nEnter your Choice:");
    scanf("%d",&ch);

    if(ch<=2 & ch>0)
    {
     printf("Enter the number of elements :");
     scanf("%d",&num);
     read_list(l,num);
     printf("\nElements present in the list are:\n\n");
     print_list(l,num);
     printf("\n\nElement you want to search:\n\n");
     scanf("%d",&ele);

     switch(ch)
     {
       case 1:printf("\n**Recursion method**\n");
	     l_search_recursive(l,num,ele);
	     getch();
	     break;

       case 2:printf("\n**Non-Recursion method**\n");
	      l_search_nonrecursive(l,num,ele);
	      getch();
	      break;
     }
    }
    getch();
}
/*end main*/

/* Non-Recursive method*/
void l_search_nonrecursive(int l[],int num,int ele)
{
   int j, f=0;
   for(j=0;j<num;j++)
   if( l[j] == ele)
   {
      printf("\nThe element %d is present at position %d in list\n",ele,j);
      f=1;
      break;
   }
   if(f==0)
       printf("\nThe element is %d is not present in the list\n",ele);
}

/* Recursive method*/
void l_search_recursive(int l[],int num,int ele)
{
   int f = 0;

   if( l[num] == ele)
   {
      printf("\nThe element %d is present at position %d in list\n",ele,num);
      f=1;
   }
   else
   {
    if((num==0) && (f==0))
    {
     printf("The element %d is not found.",ele);
    }
    else
    {
     l_search(l,num-1,ele);
    }
   }
   getch();
}

void read_list(int l[],int num)
{
   int j;
   printf("\nEnter the elements:\n");
   for(j=0;j<num;j++)
       scanf("%d",&l[j]);
}

void print_list(int l[],int num)
{
   int j;
   for(j=0;j<num;j++)
       printf("%d\t",l[j]);
}

