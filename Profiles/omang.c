#include<stdio.h>
int main()
{
char ch;
printf("enter a character");
scanf("%s",&ch);
if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
printf("character entered is a vowel");
else
printf("character entered is consonant");
return 0;
}
