#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
#define MAX 5
int stack[MAX], top = -1;
void push();
void pop();
void display();

int main() {
    int c;
    system("cls");
    printf("Enter the operation you want to perform on stack:\n");
    printf("1. Push\n2. Pop\n3. Display\n4. Exit\n");
    do {
        printf("Enter your choice: ");
         scanf("%d", &c);
        switch(c) {
            case 1:
                push();
                break;
            case 2:
                pop();
                break;
            case 3:
                display();
                break;
            case 4:
                exit(0);
            default:
                printf("Invalid choice");
        }
    }while(c != 4);
    return 0;
}

void push() {
    int x;
    if(top == MAX - 1) {
        printf("Stack Overflow\n");
    } else {
        printf("Enter the element to be pushed: ");
        scanf("%d", &x);
        top++;
        stack[top] = x;
        printf("%d pushed to stack\n", x);
    }
}

void pop() {
    int x;
    if(top == -1) {
        printf("Stack Underflow\n");
    } else {
        x = stack[top];
        top--;
        printf("%d popped from stack\n", x);
    }
}

void display() {
    int i;
    if(top == -1) {
        printf("Stack is empty\n");
    } else {
        printf("Stack elements are:\n");
        for(i = top; i >= 0; i--) {
            printf("%d\n", stack[i]);
        }
    }
}
