#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
int i,r=-1,f=0,n=5,x,y,q[5];;
int main() { 
 int ch;
system("cls");
    printf("\n Menu list: \n 1.Enqueue \n 2.Dequeue \n 3.Display \n 4.Exit");
    do {
        printf("\n Enter your choice: ");
        scanf("%d",&ch);
        switch(ch) {
            case 1:
                qinsert();
                break;
            case 2:
                qdelete();
                break;
            case 3:
                display();
                break;
            case 4:
                exit(0);
            default:
                printf("\n Invalid choice");
        }
    } while(ch!=4);
    return 0;   
}

void qinsert() {
    if(r==n-1)
        printf("\n Queue is full");
    else {
        printf("\n Enter the element to be inserted: ");
        scanf("%d",&x);
        r++;
        q[r]=x;
        printf("\n %d is inserted",x);
    }
}

void qdelete() {
    if(f>r)
        printf("\n Queue is empty");
    else {
        y=q[f];
        f++;
        printf("\n %d is deleted",y);
    }
}

void display() {
    if(f>r)
        printf("\n Queue is empty");
    else {
        printf("\n The elements in the queue are: ");
        for(i=f;i<=r;i++)
            printf("%d ",q[i]);
    }
}