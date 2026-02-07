#include<stdio.h>
#include<conio.h>
#include<stdlib.h>

int main() {
    int i,letters,digits,vowels,consonants,spaces,spcchar;
    char str[100],ch;
    system("cls");
    printf("Enter a string: ");
    fgets(str, sizeof(str), stdin);
    letters=digits=vowels=consonants=spaces=spcchar=0;
    for(i=0;str[i]!='\0';i++) {
        if(isalpha(str[i])) {
            letters++;
            ch = tolower(str[i]);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {     //can use switch 
                vowels++;
            } else {
                consonants++;
            }
        } 
        else if(isdigit(str[i])) {
            digits++;
        }
        else if(isspace(str[i])) {
            spaces++;
        }
        else 
            spcchar++;
        }
        
        printf("\n Character: %c",str[i]);
        printf("\n No of letters: %d",letters);
        printf("\n No of digits: %d",digits);
        printf("\n No of vowels: %d",vowels);
        printf("\n No of consonants: %d",consonants);
        printf("\n No of spaces: %d",spaces);   
        printf("\n No of special characters: %d",spcchar);
        getch();
        return 0;
    }