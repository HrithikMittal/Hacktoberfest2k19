//flip 2 degit number
#include<stdio.h>
int main()
{
    int a,b,c,d;
    printf("enter 2 degit number");
    scanf("%d",&a);
    b=a%10;
    c=a/10;
    d=10*b+c;
    printf("%d",d);
    return 0;
}
