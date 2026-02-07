#include<stdio.h>
#include<conio.h>
#include<stdlib.h>

int fact(int n);

int main() {
    int n,num,i,d;
    system("cls");
    printf("Enter a number to find its factorial: ");
    scanf("%d",&n);
    for(i=1,d=1;i<=n;i++) {
        printf("Enter the number :");
        scanf("%d",&num);
        d=fact(num);
        printf("Factorial of %d is %d\n",num,d);
    }
    getch();
    return 0;
}

int fact(int n) {
    {
        if(n>1)
            return n*fact(n-1);
        else
            return 1;
    }
}