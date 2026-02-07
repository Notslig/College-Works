#include<stdio.h>
#include<conio.h>
#include<stdlib.h>

int main() {
    struct distance
    {
    int feet;
    float inch;
    }d1,d2,sum;
    system("cls");
    printf("Enter 1st distance in feet and inch: ");
    scanf("%d%f",&d1.feet,&d1.inch);
    printf("Enter 2nd distance in feet and inch: ");
    scanf("%d%f",&d2.feet,&d2.inch);
    sum.feet=d1.feet+d2.feet;
    sum.inch=d1.inch+d2.inch;
    if(sum.inch>=12)
    {
        sum.feet++;
        sum.inch=sum.inch-12;
    }
    printf("Sum of distances = %d feet %.2f inch",sum.feet,sum.inch);
    getch();
    return 0;
}