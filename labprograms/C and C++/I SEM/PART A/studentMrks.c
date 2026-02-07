#include<stdio.h>
#include<conio.h>
#include<stdlib.h>

int main() {
    int m1,m2,m3,m4,m5,total;
    float avg;

    system("cls");  //replacement for clrscr() since the function only works for C borlands turbo C++

    printf("Enter marks of 5 subjects: ");
    scanf("%d%d%d%d%d",&m1,&m2,&m3,&m4,&m5);
    total=m1+m2+m3+m4+m5;
    avg=total/5.0;
    printf("Total marks=%d\n",total);
    printf("Average marks=%.2f",avg);
    if(m1<35 || m2<35 || m3<35 || m4<35 || m5<35)
        printf("\nResult=Fail");
    else {
        if (avg>=85) 
            printf("\nResult=Distinction");
        else if (avg>=60)
            printf("\nResult=First class");
        else if (avg>=50)
            printf("\nResult=Very good");
        else 
            printf("\nResult=Pass");
     }
     getch();
     return 0;     //use for int main()
}