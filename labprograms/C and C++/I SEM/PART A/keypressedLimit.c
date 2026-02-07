#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
int main(){
    int n,sum=0;
    printf("Enter the number of keypresses till 999 or more is inserted : ");
    do {
        scanf("%d",&n);
        if(n>0&&n<999){
            sum=sum+n;
        }
        else{
            printf("Limit exceeded!\n");
            break;
        }
    }while(n<=999);
    printf("Sum of all the keypresses is : %d",sum);
    getch();
    return 0;
}
