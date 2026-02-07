#include<stdio.h>
#include<conio.h>
#include<stdlib.h>

int main() {
    int a,b,c;
    system("cls");
    R:
    printf("\n Enter the values :");
    scanf("%d%d%d",&a,&b,&c);
        if(a==b && a==c) {
            printf("\n The numbers are equal");
            goto R;
        }
    if (a>b){
        if (a>c)
            printf("\n A is greatest");
        else
            printf("\n C is greatest");
    }
    else {
        if (b>c)
            printf("\n B is greatest");
        else
            printf("\n C is greatest");
    }
    getch();
    return 0;
}