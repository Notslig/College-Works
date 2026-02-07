#include<stdio.h>
#include<conio.h>
#include<stdlib.h>

int main() {
    char *str[20];
    int n,i;
    system("cls");
    printf("Enter number of strings: ");
    scanf("%d",&n);
    for(i=0;i<n;i++) {
        str[i]=(char *)malloc(20*sizeof(char));
        printf("Enter string %d: ",i+1);
        scanf("%s",str[i]);
    }
    sorting(str,n);
    printf("\nSorted strings are:\n");
    for(i=0;i<n;i++) 
        printf("%s\n",str[i]);
    getch();
    return 0;
}

void sorting(char *str[], int n) {
    char *temp[]={" "};
    int i,j;
    for(i=0;i<n-1;i++) {
        for(j=i+1;j<n;j++) {
            if(strcmp(str[i],str[j])>0) {
                strcpy(temp,str[i]);
                strcpy(str[i],str[j]);
                strcpy(str[j],temp);
            }
        }
    }
}