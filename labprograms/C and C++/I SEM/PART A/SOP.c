#include<stdio.h>
#include<conio.h>
#include<stdlib.h>

int main(){
    int num,rev=0,sum=0,rem,t;
    system("cls");
    printf("\n Enter a number :");
    scanf("%d",&num);
    t=num;
    while(num>0){
        rem=num%10;
        sum=sum+rem;
        rev=(rev*10)+rem;
        num=num/10;
    }
    if (rev==t)
        printf("\n The number %d is a palindrome",t);
    else
        printf("\n The number %d is not a palindrome",t);
    printf("\n The reverse of the number is %d",rev);
    printf("\n The sum of digits is %d",sum);
    getch();
    return 0;
        
}