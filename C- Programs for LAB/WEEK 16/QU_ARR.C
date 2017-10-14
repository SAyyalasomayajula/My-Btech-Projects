/* Write C programs that implement Queue (its operations) using	i) Arrays */

#include<stdio.h>
#include<alloc.h>
#include<conio.h>
#define size 10
#define true 1
#define false 0

struct q_arr
{
  int f,r;
  int num;
  int a[size];
};

void init(struct q_arr* queue);
int e_que(struct q_arr* queue);
int f_que(struct q_arr* queue);
int add_ele(struct q_arr* queue,int);
int rem_ele(struct q_arr* queue);
void display_ele(struct q_arr* queue);

/*main function*/
void main()
{
  int ele,k;
  int ch;

  struct q_arr *queue = (struct q_arr*)malloc(sizeof(struct q_arr));
  init(queue);

  while(1)
  {
    clrscr();
    printf("\n\n****IMPLEMENTATION OF QUEUE USING ARRAYS****\n");
    printf("============================================");
    printf("\n\t\tMENU\n");
    printf("============================================");
    printf("\n\t[1] To insert an element");
    printf("\n\t[2] To remove an element");
    printf("\n\t[3] To display all the elements");
    printf("\n\t[4] Exit");
    printf("\n\n\t Enter your choice: ");
    scanf("%d",&ch);

    switch(ch)
    {
      case 1:
      {
	printf("\nElement to be inserted:");
	scanf("%d",&ele);
	add_ele(queue,ele);
	break;
      }

      case 2:
      {
	if(!e_que(queue))
	{
	  k=rem_ele(queue);
	  printf("\n%d element is removed\n",k);
	  getch();
	}
	else
	{
	  printf("\tQueue is Empty. No element can be removed.");
	  getch();
	}
	break;
      }

      case 3:
      {
	display_ele(queue);
	getch();
	break;
      }

      case 4:
	exit(0);

      default:
	printf("\tInvalid Choice.");
	getch();
	break;
    }
  }
}
/*end main*/

void init(struct q_arr* queue)
{
  queue->f = 0;
  queue->r = -1;
  queue->num = 0;
}

/* Function to check is the queue is empty*/
int e_que(struct q_arr* queue)
{
  if(queue->num==0)
  return true;
  return false;
}

/* Function to check if the queue is full*/
int f_que(struct q_arr* queue)
{
  if(queue->num == size)
  return true;
  return false;
}

/* Function to add an element to the queue*/
int add_ele(struct q_arr* queue,int j)
{
  if(f_que(queue))
  return false;

  if(queue->r == size - 1)
  queue->r = -1;
  queue->a[++queue->r] = j;
  queue->num++;
  return true;
}

/* Function to remove an element of the queue*/
int rem_ele(struct q_arr* queue)
{
  int j;
  if(e_que(queue))
  return -9999;
  j = queue->a[queue->f++];
  if(queue->f == size)
  queue->f = 0;
  queue->num--;
  return j;
}

/* Function to display the queue*/
void display_ele(struct q_arr* queue)
{
  int j;
  if(e_que(queue))
  {
    printf("Queue is Empty. No records to display.");
    return;
  }
  printf("\nElements present in the Queue are: ");
  for(j=queue->f;j<=queue->r;j++)
    printf("%d\t",queue->a[j]);
    printf("\n");
}
