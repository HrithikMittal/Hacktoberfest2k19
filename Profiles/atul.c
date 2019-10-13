#include<stdio.h>
int main()
{
    int a,b,c;
    printf("enter 2 degit number");
    scanf("%d",&a);
    b=a%10;
    c=a/10;
    if ((b+c)>10)
{
    printf("success");
}
    else
{
    printf("not success");
}
    return 0;
}
