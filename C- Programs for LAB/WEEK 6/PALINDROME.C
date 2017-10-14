/* Write a C program to determine if the given string is a palindrome or not */

#include<stdio.h>
#include<string.h>

enum Boolean{false,true};
enum Boolean IsPalindrome(char string[])
{
 int left,right,len=strlen(string);
 enum Boolean matched=true;
 if(len==0)
  return 0;
  left=0;
  right=len-1;

  /* Compare the first and last letter,second & second last & so on */
  while(left<right&&matched)
  {
   if(string[left]!=string[right])
   matched=false;
   else
   {
    left++;
    right--;
   }
  }
  return matched;
 }

int main()
{
  char string[40];
  clrscr();
  printf("****Program to test if the given string is a palindrome****\n");
  printf("Enter a string:");
  scanf("%s",string);
  if(IsPalindrome(string))
  printf("The given string %s is a palindrome\n",string);
  else
  printf("The given string %s is not a palindrome\n",string);
  getch();
  return 0;
}
