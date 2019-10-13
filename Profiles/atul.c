
#include<stdio.h>
int main()
{
    int a,b,c;
    printf("enter 1at num");
    scanf("%d",&a);
    printf("enter 2nd num");
    scanf("%d",&b);
    c=a+b;
    printf("sum is %d",c);

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
