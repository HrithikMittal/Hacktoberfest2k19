#include<stdio.h>
int main()
{
    int a;
    printf("enter a number");
    scanf("%d",a);
    if(a%2==0)
    printf("%d is even",a);
    else
    printf("%d is odd",a);
    return 0;
}
