#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
#include<string.h>

int main() {
    char str[20],ch;
    int occ=0,i;
    system("cls");
    printf("\n Enter the string :");
    gets(str);                          //scanf("%[^\n]s",str);
    printf("\n Enter the character to be searched :");
    scanf(" %c",&ch);
    for(i=0;i<strlen(str);i++) {
        if(str[i]==ch)
            occ++;  
    }
    printf("\n The character %c has occured %d times",ch,occ);
    getch();
    return 0;
}