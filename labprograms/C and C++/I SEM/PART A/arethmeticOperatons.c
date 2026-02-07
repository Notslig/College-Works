#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
int main() {
    int a,b,s,p,q,d;
    char op;

    system("cls");

    printf("\n Enter the values of a and b :");
    scanf("%d%d",&a,&b);
    L:
    printf("\n Enter the operator (+,-,*,/) :");
    scanf(" %c",&op);
    switch(op) {
        case '+':
            s=a+b;
            printf("\n The sum is %d",s);
            break;
        case '-':
            d=a-b;
            printf("\n The difference is %d",d);
            break;
        case '*':
            p=a*b;
            printf("\n The product is %d",p);
            break;
        case '/':
            if(b!=0) {
                q=a/b;
                printf("\n The quotient is %d",q);
            } else
                printf("\n Division by zero is not possible");
            break;
        default:
            printf("\n Invalid operator");
            goto L;
    }
    getch();
    return 0;
}