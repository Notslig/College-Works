#include<conio.h>
#include<stdio.h>
#include<stdlib.h>
int cq[5], front=-1, rear=-1, i, choice, item;
#define TRUE 1

int main(){
    
    while(TRUE){
        printf("\n1. Insert\n2. Delete\n3. Display\n4. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);
        switch(choice){
            case 1:
                qinsert();
                break;
            case 2:
                qdelete();
                break;
            case 3:
                qdisplay();
                break;
            case 4:
                exit(0);
            default:
                printf("Invalid choice\n");
        }
    }
    return 0;
}

void qinsert(){
    if((front==0 && rear==4) || (front==rear+1)){
        printf("Queue Overflow\n");
        return;
    }
    int item;
    printf("Enter the item to be inserted: ");
    scanf("%d", &item);
    if(front==-1){
        front=0;
        rear=0;
    }
    else if(rear==4){
        rear=0;
    }
    else{
        rear++;
    }
    cq[rear]=item;
    printf("Item inserted: %d\n", item);
}

void qdelete(){
    if(front==-1){
        printf("Queue Underflow\n");
        return;
    }
    item=cq[front];
    if(front==rear){
        front=-1;
        rear=-1;
    }
    else if(front==4){
        front=0;
    }
    else{
        front++;
    }
    printf("Item deleted: %d\n", item);
}

void qdisplay(){
    if(front==-1){
        printf("Queue is empty\n");
        return;
    }
    printf("Queue elements: ");
    if(front<=rear){
        for(i=front; i<=rear; i++){
            printf("%d ", cq[i]);
        }
    }
    else{
        for(i=front; i<5; i++){
            printf("%d ", cq[i]);
        }
        for(i=0; i<=rear; i++){
            printf("%d ", cq[i]);
        }
    }
    printf("\n");
}