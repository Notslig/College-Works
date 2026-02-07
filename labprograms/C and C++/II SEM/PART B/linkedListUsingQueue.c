#include<conio.h>
#include<stdio.h>
#include<stdlib.h>

struct node
{
    int data;
    struct node *next;
};
typedef struct node *NODE;
NODE getnode()
{
    NODE x;
    x=(NODE)malloc(sizeof(struct node));
    if(x==NULL)
    {
        printf("Memory not available\n");
        exit(0);
    }
    return x;
}
NODE insert_rear(int item,NODE head){
    NODE temp,cur;
    temp=getnode();
    temp->data=item;
    if(head==NULL){
        head=temp;
        temp->next=NULL;
    }
    else{
        cur=head;
        while(cur->next!=NULL)
            cur=cur->next;
        cur->next=temp;
        temp->next=NULL;
    }
    return head;
}

NODE delete_front(NODE head){
    NODE temp;
    if(head==NULL){
        printf("Queue underflow\n");
    }
    else {
        printf("Deleted item is %d\n",temp->data);
        head=head->next;
        free(temp);
    }
    return head;
}

void display(NODE head){
    NODE cur;
    if(head==NULL){
        printf("Queue is empty\n");
        return;
    }
    cur=head;
    while(cur!=NULL){
        printf("%d ",cur->data);
        cur=cur->next;
    }
    printf("\n");
}

void main() {
    NODE head = NULL;
    int choice, item;
    system("cls");
    do 
    {
        printf("1.Insert rear\n2.Delete front\n3.Display\n4.Exit\n");
        printf("Enter your choice : ");
        scanf("%d", &choice);
        switch (choice) 
        {
            case 1:
                printf("Enter the item to be inserted : ");
                scanf("%d", &item);
                head = insert_rear(item, head);
                break;
            case 2:
                head = delete_front(head);
                break;
            case 3:
                display(head);
                break;
            case 4:
                printf("Exiting...\n");
                break;
            default:
                printf("Invalid choice\n");
        }
    }while(choice != 4);
    getch();
}