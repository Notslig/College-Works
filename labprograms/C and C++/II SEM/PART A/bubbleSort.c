#include<stdio.h>
#include<conio.h>
#include<stdlib.h>

int main() {
    int a[20],n,i,temp;
    system("cls");
    printf("Enter the number of elements: ");
    scanf("%d",&n);
    printf("Enter the elements: ");
    for(i=0;i<n;i++) 
        scanf("%d",&a[i]);
    printf("Entered elemnts are");
    for(i=0;i<n;i++) 
        printf("%d ",a[i]);
    for(i=0;i<n-1;i++) {
        for(int j=0;j<n-i-1;j++) {
            if(a[j]>a[j+1]) {
                temp=a[j];  
                a[j]=a[j+1];
                a[j+1]=temp;
            }
        }    
    }
    printf("\nSorted elements are: ");
    for(i=0;i<n;i++) 
        printf("%d ",a[i]); 
    getch();
    return 0;
}