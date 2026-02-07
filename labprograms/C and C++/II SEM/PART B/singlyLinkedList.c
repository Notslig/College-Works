#include<conio.h>
#include<stdio.h>
#include<stdlib.h>

struct node 
{
    int data;
    struct node *next;
};
typedef struct node *NODE;
NODE getnode(){
    NODE x;
    x=(NODE)malloc(sizeof(struct node));
    if(x==NULL)
    {
        printf("Memory not available\n");
        exit(0);
    }
    return x;
}

NODE insert_front(NODE head,int item)
{
    NODE curr;
    NODE temp;
    temp=getnode();
    temp->data=item;
    temp->next=NULL;
    if(head==NULL)
        head=temp;
    else {
        curr=head;\
        while(curr->next!=NULL)
            curr=curr->next;
            curr->next=temp;
    }
    return head;
}

NODE delpos(NODE head,int pos)
{
    NODE curr,prev;
    int i;
    if(head==NULL)
    {
        printf("List is empty\n");
        return head;
    }
    else if(pos==1)
    {
        printf("Delted elemetn is %d \n",head->data);
        curr = head;
        head = head->next;
        free(curr); 
    }
    else
    {
        curr=head;
        prev=NULL;
        for(i=1;i<pos && curr!=NULL;i++){
            prev=curr;
            curr=curr->next;
        }
        if(curr == NULL) {
            printf("Position out of range\n");
            return head;
        }
        prev->next=curr->next;
        printf("Deleted element is %d \n",curr->data);
        free(curr);
    }
    return head;
}

void display(NODE head)
{
    NODE curr;
    if(head==NULL)
    {
        printf("List is empty\n");
        return;
    }
    else {
        curr=head;
        printf("the present list:\n");
        while(curr!=NULL)
        {
            printf("%d -> ",curr->data);
             curr=curr->next;
        }
    printf("NULL\n");
    }
return;
}

int main(){
    NODE head=NULL;
    int choice,item,pos;
    do 
    {
        printf("1.Insert at end\n");
        printf("2.Delete at position\n");
        printf("3.Display\n");
        printf("4.Exit\n");
        printf("Enter your choice:\n");
        scanf("%d",&choice);
        switch(choice)
        {
            case 1:printf("Enter the item to be inserted:\n");
                   scanf("%d",&item);
                   head=insert_front(head,item);
                   break;
            case 2:printf("Enter the position to be deleted:\n");
                   scanf("%d",&pos);
                   head=delpos(head,pos);
                   break;
            case 3:display(head);
                   break;
            case 4:exit(0);
            default:printf("Wrong choice\n");
        }
    }while(choice<=4);
    getch();
    return 0;
}