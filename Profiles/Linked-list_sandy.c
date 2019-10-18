#include<stdio.h>
#include<stdlib.h>

void traverse();
void insert_end();
void insert_beg();
void insert_mid();
struct node* creatNode();

struct node
{
  int info;
  struct node *link;
};
struct node *start = NULL;
int count=0;

struct node* creatNode()
{
struct node *p;
    p=malloc(sizeof(struct node));
  
return (p);
}

int main()
{int input;
  
    for (;;) {
      printf("1. Insert an element at beginning of linked list.\n");
      printf("2. Insert an element at end of linked list.\n");
      printf("3. Traverse linked list.\n");
      printf("4. insert at mid.\n");
      printf("5. Delete element from end.\n");  
      printf("6. Exit\n");
     
      scanf("%d", &input);
     
      if (input == 1) 
         
         insert_beg();
      
     else if (input == 2) 
     	insert_end();

      else if (input == 3)
         traverse();
       else if (input == 4)
         insert_mid();  
      /*else if (input == 5)
         delete_from_end();  */
      else if (input == 6)
         break;
      else
         printf("Please enter valid input.\n");      
   }
   
   return 0; 
   
}

void insert_beg()
{
struct node *temp;
	temp = creatNode();
	count++;
	printf("enter a number");
	scanf("%d",&temp->info);
	temp->link = NULL;
	if(start==NULL)
		start = temp;
	else
	{
		temp->link=start;
		start=temp;
	}

}
void insert_mid()
{    int pos;
	struct node *temp,*new ,*t;
	new = creatNode();
	if(new==NULL)
		return;
	
	printf("Enter position u want to insert a element \n");
	scanf("%d",&pos);
	t=start;
	temp=start;
	for(int i=1;i<pos-1;i++)
	{ t=t->link;
      temp=temp->link;}
      temp=temp->link;

	printf("enter a number");
	scanf("%d",&new->info);
	t->link = new;
	new->link=temp;
}
void insert_end()    // insertion at end
{
	struct node *temp, *t;
	temp = creatNode();
	count++;
	printf("enter a number");
	scanf("%d",&temp->info);
	temp->link = NULL;
	if(start==NULL)
		start = temp;
	else
	{  t=start;
	  while(t->link!=NULL)
	  {
	  	t=t->link;
	  } 

	  t->link=temp;
    }	
}


void traverse()
{
  struct node *temp;
  temp=start;
  if(temp==NULL)
  	{printf("Linked list is empty\n");
  return;}

 
     printf("There are %d element in linked list\n",count);
    
  while (temp->link != NULL) 
  {
      printf("%d\n", temp->info);
      temp = temp->link;
   }
   printf("%d\n", temp->info);
}
 


