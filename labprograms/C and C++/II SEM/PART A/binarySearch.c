#include<stdio.h>
#include<conio.h>
#include<stdlib.h>

int main() {
    int arr[100], n, i, item, beg, end, mid;
    printf("Enter the number of elements: ");
    scanf("%d", &n);
    printf("Enter the elements in sorted order: ");
    for(i = 0; i < n; i++) 
        scanf("%d", &arr[i]);
    printf("Enter the item to be searched: ");
    scanf("%d", &item);
    beg = 0;
    end = n - 1;
    while(beg <= end) {
        mid = (beg + end) / 2;
        if(arr[mid] == item) {
            printf("Item found at position %d", mid + 1);
            exit(0);
        }
        else if(arr[mid] < item) {
            beg = mid + 1;
        }
        else 
            end = mid - 1;
        }
    if(beg > end) {
        printf("Item not found");
    }
    getch();
    return 0;
}