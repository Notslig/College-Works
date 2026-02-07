#include<conio.h>
#include<stdio.h>
#include<stdlib.h>

void mergeMechanism(int arr[], int l, int m, int h) {
    int i,j,k,temp[20];
    
    i=l;
    j=m+1;
    k=l;

   while(i<=m && j<=h) {
        if(arr[i]<=arr[j]) 
            temp[k++] = arr[i++];   
        else 
            temp[k++] = arr[j++];    
    }

    while(i<=m) {
       temp[k++]=arr[i++];
    }

    while(j<=h) {
       temp[k++]=arr[j++];
    }

    for(i=l; i<=h; i++) {
        arr[i]=temp[i];
    }
}

void mergeSort(int arr[], int low, int high) {
    int mid;
    if (low < high) {
        mid = (low + high) / 2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);
        mergeMechanism(arr, low, mid, high);
    }
}

void main() {
    int arr[20], n, i;
    system("cls");
    printf("Enter the number of elements: ");
    scanf("%d", &n);
    printf("Enter the elements:\n");
    for (i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }
    mergeSort(arr, 0, n - 1);
    printf("Sorted array is:\n");
    for (i = 0; i < n; i++) {
        printf("%d ", arr[i]);
    }
    getch();
}