/* Write a C program that uses functions to perform the following operations:
	i) Reading a complex number
	ii) Writing a complex number
	iii) Addition of two complex numbers
	iv) Multiplication of two complex numbers
(Note: represent complex number using a structure.) */

#include<stdio.h>
#include<math.h>

void arithmetic(int opern);

struct comp
{
     double realpart;
     double imgpart;
};

void main()
{
     int opern;
     clrscr();
     printf("\n\n \t\t\t***** MAIN MENU *****");
     printf("\n\n Select your option: \n 1 : ADD\n 2 : MULTIPLY\n 0 : EXIT \n\n\t\t Enter your Option [  ]\b\b");

     scanf("%d",&opern);

     switch(opern)
     {
	  case 0:
	       exit(0);
	  case 1:
	  case 2:
	       arithmetic(opern);
	  default:
	       main();
     }

}

void arithmetic(int opern)
{

     struct comp w1, w2, w;

     printf("\n Enter two Complex Numbers  (x+iy):\n Real Part of First Number:");
     scanf("%lf",&w1.realpart);
     printf("\n Imaginary Part of First Number:");
     scanf("%lf",&w1.imgpart);
     printf("\n Real Part of Second Number:");
     scanf("%lf",&w2.realpart);
     printf("\n Imaginary Part of Second Number:");
     scanf("%lf",&w2.imgpart);


     switch(opern)
     {

     /*addition of complex number*/
     case 1:
	  w.realpart = w1.realpart+w2.realpart;
	  w.imgpart = w1.imgpart+w2.imgpart;
	  break;

     /*multiplication of complex number*/
     case 2:
	  w.realpart=(w1.realpart*w2.realpart)-(w1.imgpart*w2.imgpart);
	  w.imgpart=(w1.realpart*w2.imgpart)+(w1.imgpart*w2.realpart);
	  break;
     }


     if (w.imgpart>0)
	  printf("\n Answer = %lf+%lfi",w.realpart,w.imgpart);
     else
	  printf("\n Answer = %lf%lfi",w.realpart,w.imgpart);
     getch();
     main();
}


