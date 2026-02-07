#include<stdio.h>
#include<conio.h>
#include<stdlib.h>

int main() {
    int a[10][10],b[10][10],sum[10][10],dif[10][10],i,j,r1,r2,c1,c2;
    system("cls");
    printf("Enter the number of rows and columns of first matrix: ");
    scanf("%d%d",&r1,&c1);
    printf("Enter the number of rows and columns of second matrix: ");
    scanf("%d%d",&r2,&c2);
    if(r1!=r2 || c1!=c2) {
        printf("Addition and Subtraction not possible");
        exit(0);
    }


    printf("Enter the elements of first matrix: \n");
    for(i=0;i<r1;i++) {
        for(j=0;j<c1;j++) {
            scanf("%d",&a[i][j]);   
        }
    }

    printf("Enter the elements of second matrix: \n");
    for(i=0;i<r2;i++) {
        for(j=0;j<c2;j++) {
            scanf("%d",&b[i][j]);
        }
    }

        
        for(i=0;i<r1;i++) {
            for(j=0;j<c1;j++) {
                sum[i][j]=a[i][j]+b[i][j];
                dif[i][j]=a[i][j]-b[i][j];
            }
        }


    printf("Sum of the two matrices: \n");
    for(i=0;i<r1;i++) {
        for(j=0;j<c1;j++) {
            printf("%d\t",sum[i][j]);
        }
        printf("\n");
    }

    printf("Difference of the two matrices: \n");
    for(i=0;i<r1;i++) {
        for(j=0;j<c1;j++) {
            printf("%d\t",dif[i][j]);
        }
        printf("\n");
    }
    getch();
    return 0;
}