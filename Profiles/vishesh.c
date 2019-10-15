
#include<stdio.h>
int main(){int a,b,t,c,n;
scanf("%d",&n);t=1;b=0;
for(int i=1;i<=((2*n)+1);i++)
{for(c=n-t+1;c>=1;c--)
printf(" ");
  for(a=1;a<=(2*t)-1;a++)
   {if((a==1)||(a==((2*t)-1)))
               printf("*");
               else
                printf("o");

   }
    printf("\n");
    if(t==(n+1))
    b++;
    if(b==0)
    t++;
    else
    t--;


}
        return 0;}
