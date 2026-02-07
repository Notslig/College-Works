#include<stdio.h>
#include<conio.h>
#include<stdlib.h>

int main(){
    int n,i,prime=0;
    system("cls");
    printf("\n Enter a number to check prime or not :");
    scanf("%d",&n);
    for(i=2;i<=n/2;i++){
        if(n%i==0){
            prime=1;
            break;
        }
    }
    if(prime==0)
        printf("\n %d is a prime number",n);
    else
        printf("\n %d is not a prime number",n);
    getch();
    return 0;
}