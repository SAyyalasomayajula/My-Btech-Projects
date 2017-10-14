/* Write  C programs that implement stack (its operations) using ii) Pointers */

#include<stdio.h>
#include<conio.h>

struct st_point
{
  int ele;
  struct st_point *l;
}

*t;
int i;

void push_ele(int j);
int pop_ele();
void display_ele();

void main()
{
  char choice,num1=0,num2=0;
  int i;
  while(1)
  {
    clrscr();
    printf("======================================");
    printf("\n\t\t MENU ");
    printf("\n======================================");
    printf("\n[1] Using Push Function");
    printf("\n[2] Using Pop Function");
    printf("\n[3] Elements present in Stack");
    printf("\n[4] Exit\n");
    printf("\n\tEnter your choice: ");
    fflush(stdin);
    scanf("%c",&choice);

    switch(choice-'0')
    {
      case 1:
      {
	printf("\n\tElement to be pushed:");
	scanf("%d",&num1);
	push_ele(num1);
	break;
      }

      case 2:
      {
	num2=pop_ele(1);
	printf("\n\tElement to be popped: %d\n\t",num2);
	getch();
	break;
      }

      case 3:
      {
	printf("\n\tElements present in the stack are:\n\t");
	display_ele();
	getch();
	break;
      }

      case 4:
	exit(1);
	break;

      default:
	printf("\nYour choice is invalid.\n");
	break;
    }
  }
}

/*Inserting the elements using push function*/
void push_ele(int j)
{
  struct st_point *m;
  m=(struct st_point*)malloc(sizeof(struct st_point));
  m->ele=j;
  m->l=t;
  t=m;
  return;
}

/*Removing the elements using pop function*/
int pop_ele()
{
  if(t==NULL)
  {
    printf("\n\STACK is Empty.");
    getch();
    exit(1);
  }
  else
  {
    int i=t->ele;
    t=t->l;
    return (i);
  }
return 0;
}

/*Displaying the elements */
void display_ele()
{
  struct st_point *pointer=NULL;
  pointer=t;
  while(pointer!=NULL)
  {
    printf("%d\t",pointer->ele);
    pointer=pointer->l;
  }
}

