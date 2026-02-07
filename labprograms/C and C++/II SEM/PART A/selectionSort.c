#include<stdio.h>
#include<conio.h>
#include<stdlib.h>

int main() {
    
    int a[10],n,i,j,temp,min;
    system("cls");
    printf("Enter the limit:");
    scanf("%d",&n);
    printf("Enter the arrays:");
        for(i=0;i<n;i++)
            scanf("%d",&a[i]);
    printf("\n the Entered elements are :");
        for(i=0;i<n;i++);
            printf("%d",a[i]);
    for(i=0;i<n-1;i++){
        min=i;
            for(j=i+1;j<n;j++){
                if(a[j]<a[min])
                    min=j;
            }
        if(min!=i){
            temp=a[i];
            a[i]=a[min];
            a[min]=temp;
        }
    }

    printf("\n the sorted elements are :");
        for(i=0;i<n;i++)
            printf("%d",a[i]);
    getch();
    return 0;
    
}