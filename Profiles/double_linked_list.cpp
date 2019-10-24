#include<iostream>
using namespace std;
struct node
{
	int data;
	node *next,*prev;
};

node* create_list(int m)
{
	node *head,*p,*q;
	cout<<"enter the elements:  ";
	for(int i=0;i<m;i++)
	{
		p=new node;
		cin>>p->data;
		p->next=NULL;
		p->prev=NULL;
		if (i==0)
		{
			head=p;
			q=p;
		}
		else
		{
			q->next=p;
			p->prev=q;
			q=q->next;
		}
	}
	return head;
}

void display(node *head)
{
	node *p=head;
	while(p!=NULL)
	{
		cout<<p->data<<"  ";
		p=p->next;
	}
	cout<<endl;
}

node* insertion_sort(node *head,int num,int n)
{
	node *temp,*min,*r,*p,*q;
	int info,pos=0,count=0;
	temp = head;
	while(temp!=NULL)
	{
		min=temp;
		r=temp->next;
		while(r!=NULL)
		{
			if(min->data > r->data)
			{
				min=r;
			}
			r=r->next;
		}
		info = temp->data;
		temp->data = min->data;
		min->data = info;
		temp = temp->next;
	}
	p=head;
	while(p!=NULL && p->data < num)
	{
		pos++;//5
		p=p->next;
	}
	q=new node;
	q->data=num;
	p=head;
	if(pos==0)
	{
		q->next=p;
		p->prev=q;
		head=q;
	}
	else
	{
		while(count!=pos)
		{
			temp=p;
			p=p->next;
			count++;
		}
		temp->next = q;
		q->prev = temp;
		q->next = p;
		if(count<n)
		{
			p->prev = q;
		}
	}
	return head;
}

void reverse_list(node *head)
{
	node *q,*p=head;
	while(p!=NULL)
	{
		q=p;
		p=p->next;
	}
	while(q!=NULL)
	{
		cout<<q->data<<"  ";
		q=q->prev;
	}
	cout<<endl;
}
	
int main()
{
	node *head;
	int num,x;
	cout<<"enter the number of elements:  ";
	cin>>num;
	head=create_list(num);
	cout<<"the entered list is:  ";
	display(head);
	cout<<"enter the no. u want to insert:  ";
	cin>>x;
	head=insertion_sort(head,x,num);
	cout<<"the inserted-sorted list is:  ";
	display(head);
	cout<<"the reversed list is:  ";
	reverse_list(head);
	return 0;
}
