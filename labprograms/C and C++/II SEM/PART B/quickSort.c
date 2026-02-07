#include<conio.h>
#include<stdio.h>
#include<stdlib.h>

void quickSort(int a[], int l, int h){
    int i,j,key,flag=0;
    if(l<h){
        i=l;
        j=h+1;
        key=a[l];
        do {
            do {
                i++;
            }while(a[i]<key);
            do {
                j--;
            }while(a[j]>key);
            if(i<j){
                int temp;
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
            else
            {
                int temp;
                flag=1;
                temp =a[j];
                a[j]=a[l];
                a[l]=temp;
            }
        }while(flag==0);
        quickSort(a,l,j-1);
        quickSort(a,j+1,h);
    }
}

void main(){
    int n,i;
    int *a;
    printf("Enter the number of elements: ");
    scanf("%d",&n);
    a=(int *)malloc(n*sizeof(int));
    printf("Enter the elements: ");
    for(i=0;i<n;i++){
        scanf("%d",&a[i]);
    }
    quickSort(a,0,n-1);
    printf("Sorted array is: ");
    for(i=0;i<n;i++){
        printf("%d ",a[i]);
    }
    getch();
}