#include<conio.h>
#include<stdio.h>
#include<stdlib.h>

void push();
void pop();
void display();
struct node
{
    int data;
    struct node *next;
};
struct node *top=NULL;

void main() {
    int choice;
    system("cls");

    while(choice>=1||choice<=4)
    {
        printf("\n1.Push\n2.Pop\n3.Display\n4.Exit\n");
        printf("Enter your choice: ");
        scanf("%d",&choice);
        switch(choice)
        {
            case 1: push();
                    break;
            case 2: pop();
                    break;
            case 3: display();
                    break;
            case 4: exit(0);
            default: printf("Invalid choice\n");
        }
    }
}

void push()
{
    int data;
    struct node *ptr=(struct node*)malloc(sizeof(struct node));
    if(ptr==NULL){
        printf("Stack Overflow\n");
    }
    else{
        printf("Enter data: ");
        scanf("%d",&data);
        if(top==NULL){
            ptr->data=data;
            ptr->next=NULL;
            top=ptr;
            printf("Data pushed successfully\n");
            
        }
        else{
            ptr->data=data;
            ptr->next=top;
            top=ptr;
            printf("Data pushed successfully\n");
        }
    }
}

void pop()
{
    int item;
    struct node *ptr;
    if(top==NULL){
        printf("Stack Underflow\n");
    }
    else{
        item=top->data;
        ptr=top;
        top=top->next;
        free(ptr);
        printf("Item popped: %d\n",item);
    }
}

void display()
{
    int i;
    struct node *ptr;
    ptr=top;
    if(top==NULL){
        printf("Stack is empty\n");
    }
    else{
        printf("Stack elements: \n");
        while(ptr!=NULL){
            printf("%d\n",ptr->data);
            ptr=ptr->next;
        }
    }
}