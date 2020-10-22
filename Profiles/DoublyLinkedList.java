/*============================================================================

Title:   Implement Doubly Linked List operations

============================================================================*/

#include<iostream>
#include<string.h>
using namespace std;

class node
{
friend class list;
int data;
node *prev;
node *next;

public:
node(int d)
{
    prev=NULL;
	data=d;
	next=NULL;
}

};

class list
{
	node *head;

public:
	list()
	{
		head=NULL;
	}
	void createmember()
	{
		int data;
		char choice;
		node *temp,*ptr;

        do
        {

            cout<<"Enter data: ";
            cin>>data;

            temp= new node(data);

			if(head==NULL)
			{
				head=temp;
			}
			else
			{
				ptr=head;
				while(ptr->next!=NULL)
				{
					ptr=ptr->next;
				}
				temp->prev=ptr;
				ptr->next=temp;
			}
			cout<<"Node is inserted!"<<endl;
            cout<<"\nDo you want to continue the process, yes(y) ? ";
            cin>>choice;
        }while(choice=='y'||choice=='Y');

	}

	void display()
	{

		node *ptr;

		if(head==NULL)
		{
			cout<<"List is empty!"<<endl;
		}
		else
		{
			ptr=head;

			while(ptr!=NULL)
			{
				cout<<ptr->data<<"\t";
				ptr=ptr->next;
			}
			cout<<endl;
		}
	}


	void merge(list l1,list l2)
	{
	   node *ptr1,*ptr2,*ptr;

	ptr1=l1.head;
	ptr2=l2.head;
	ptr=head;

	while((ptr1!=NULL) && (ptr2!=NULL))
	{
		if(ptr1->data > ptr2->data)
		{
			if(head==NULL)
			{
				head=ptr1;
				ptr=ptr1;
			}
			else
			{
				ptr1->prev=ptr;
				ptr->next=ptr1;
				ptr=ptr->next;
			}
			ptr1=ptr1->next;
		}
        else if(ptr1->data < ptr2->data)
		{
			if(head==NULL)
			{
				head=ptr2;
				ptr=ptr2;
			}
			else
			{
				ptr2->prev=ptr;
				ptr->next=ptr2;
				ptr=ptr->next;
			}
			ptr2=ptr2->next;
		}

	}
    if(ptr1!=NULL)
	{
	    ptr1->prev=ptr;
		ptr->next=ptr1;
	}
	if(ptr2!=NULL)
	{
	    ptr2->prev=ptr;
        ptr->next=ptr2;

    }

	display();

	}


};

int main() {

	list l1,l2,l3;
	int ch;

	cout<<"\n...LIST1..."<<endl;
    l1.createmember();
    cout<<"\n...LIST2..."<<endl;
	l2.createmember();

	cout<<"----MENU----"<<endl;
	cout<<"1.Display"<<endl;
	cout<<"2.Merge"<<endl;
	cout<<"3.Exit"<<endl;
	cout<<"------------"<<endl;


	while(1)
	{
		cout<<"\n\nEnter your choice: ";
		cin>>ch;
		switch(ch)
		{
			case 1:
                    cout<<"\n...LIST1..."<<endl;
					l1.display();
					cout<<"\n...LIST2..."<<endl;
					l2.display();
					break;

			case 2:
                    l3.merge(l1,l2);
                    break;

            case 3:
                    cout<<"Program closed!"<<endl;
                    //exit(1);
                    break;

			default:
					cout<<"Invalid choice"<<endl;
                    break;
		}
	}
	return 0;
}


/*

OUTPUT:


...LIST1...
Enter data: 7
Node is inserted!

Do you want to continue the process, yes(y) ? y
Enter data: 5
Node is inserted!

Do you want to continue the process, yes(y) ? y
Enter data: 3
Node is inserted!

Do you want to continue the process, yes(y) ? y
Enter data: 1
Node is inserted!

Do you want to continue the process, yes(y) ? n

...LIST2...
Enter data: 6
Node is inserted!

Do you want to continue the process, yes(y) ? y
Enter data: 4
Node is inserted!

Do you want to continue the process, yes(y) ? y
Enter data: 2
Node is inserted!

Do you want to continue the process, yes(y) ? n
----MENU----
1.Display
2.Merge
3.Exit
------------


Enter your choice: 1

...LIST1...
7       5       3       1

...LIST2...
6       4       2


Enter your choice: 2
7       6       5       4       3       2       1


Enter your choice: 3
Program closed!



*/
