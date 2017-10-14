/* Write a C program that displays the position or index in the string S
   where the string T begins, or - 1 if S doesn't contain T.
*/

#include<stdio.h>
#include<string.h>
#include<conio.h>

void main()
{
  char s[30], t[20];
  char *found;
  clrscr();

/* Entering the main string */
  puts("Enter the first string: ");
  gets(s);

/* Entering the string whose position or index to be displayed */
  puts("Enter the string to be searched: ");
  gets(t);

/*Searching string t in string s */
  found=strstr(s,t);
  if(found)
    printf("Second String is found in the First String at %d position.\n",found-s);
   else
    printf("-1");
  getch();
}

