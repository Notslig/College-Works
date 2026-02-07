#include<stdio.h>
#include<conio.h>
#include<stdlib.h>

int main(){
    int a[20],n,i;
    system("cls");
    printf("Enter the limit:");
    scanf("%d",&n);
    printf("Enter the arrays:");
    for(i=0;i<n;i++)
        scanf("%d",&a[i]);
    printf("\n sorted elements are :");
    for(i=1;i<n;i++)
        printf("%d",a[i]);
    getch();
    return 0;
}

void insertionSort(int a[], int n){
    int i,j,key;
    for(i=1;i<n;i++){
        key=a[i];
        j=i-1;
        while(j>=0 && a[j]>key){
            a[j+1]=a[j];
            j=j-1;
        }
        a[j+1]=key;
    }
}