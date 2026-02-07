#include<stdio.h>
#include<conio.h>
#include<stdlib.h>

int main(){
    int n,a=0,b=1,c,i;
    system("cls");
    printf("\n Enter the number of terms :");
    scanf("%d",&n);
    printf("\n Fibonacci Series is :\n");
    for(i=1;i<=n;i++){
        printf("%d\t",a);
        c=a+b;
        a=b;
        b=c;
    }
    getch();
    return 0;
}