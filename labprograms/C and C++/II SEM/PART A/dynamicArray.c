#include<stdio.h>
#include<conio.h>
#include<stdlib.h>

int main() {
    int n,i,j,minimum,min=0,maximum,max=0;
    int *a;
    system("cls");
    printf("Enter the limit:");
    scanf("%d",&n);
    a=(int*)malloc(n*sizeof(int));

    printf("Enter the arrays:");
    if(a!=0){
        for(i=0;i<n;i++)
            scanf("%d",&a[i]);

            printf("\n Entered elements are :");
        for(i=0;i<n;i++)
            printf("%d ",a[i]);

        minimum=a[0];
        maximum=a[0];
        for(i=1;i<n;i++){
            if(a[i]<minimum)
                minimum=a[i];
                min=i;
            if(a[i]>maximum)
                maximum=a[i];
                max=i;
        }
        printf("Minimum element is %d in position %d\n",minimum,min);
        printf("Maximum element is %d in position %d\n",maximum,max);
        free(a);
    }
    else
        printf("Memory not allocated");
    
    getch();
    return 0;
}