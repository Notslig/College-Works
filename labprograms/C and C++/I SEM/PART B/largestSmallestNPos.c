#include<stdio.h>
#include<conio.h>
#include<stdlib.h>

int main() {
    int a[10],n,i,large,small,lpos=0,spos=0;
    system("cls");
    printf("Enter the number of elements (max 10): ");
    scanf("%d",&n);
    printf("Enter %d elements:\n",n);
    for(i=0;i<n;i++) 
        scanf("%d",&a[i]);

    large=small=a[0];
    for(i=1;i<n;i++) {
        if(a[i]>large) {
            large=a[i];
            lpos=i; 
        }
        else if(a[i]<small) {
            small=a[i];
            spos=i; 
        }

    }
    printf("\nLargest element is %d at position %d",large,lpos+1);
    printf("\nSmallest element is %d at position %d",small,spos+1);
    getch();
    return 0;
}