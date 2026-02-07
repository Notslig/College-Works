#include<stdio.h>
#include<conio.h>
#include<stdlib.h>

int main() {
    int n, i, item, flag = 0;
    printf("Enter the number of elements: ");
    scanf("%d", &n);
    int arr[n];
    printf("Enter the elements:\n");
    for (i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }
    printf("Enter the item to be searched: ");
    scanf("%d", &item);
    for (i = 0; i < n; i++) {
        if (arr[i] == item) {
            flag = 1;
            break;
        }
    }
    if (flag == 1) {
        printf("Item found at position %d\n", i + 1);
    } else {
        printf("Item not found in the array\n");
    }
    return 0;
}