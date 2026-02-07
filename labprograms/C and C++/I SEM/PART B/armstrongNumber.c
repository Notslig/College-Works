#include<stdio.h>
#include<conio.h>
#include<stdlib.h>

int main() {
    int num,x;
    system("cls");
    printf("Enter a number: ");
    scanf("%d",&num);
    x=armstrong(num);

    if(x==num)
        printf("%d is an Armstrong number",num);
    else
        printf("%d is not an Armstrong number",num);
    getch();
    return 0;
}

int armstrong(int n) {
    int r,sum=0;
    while(n>0) {
        r=n%10;
        sum=sum+(r*r*r);
        n=n/10;
    }
    return sum;
}