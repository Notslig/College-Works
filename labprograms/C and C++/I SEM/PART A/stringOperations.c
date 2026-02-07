#include <stdio.h>
#include <stdlib.h>
#include <string.h>

void reverse(char str[], char rev[]);
void palindrome(char str[], char rev[]);
void length(char str[]);
void merged(char str[], char rev[]);

int main() {
    char str[20], rev[20];
    system("cls");                      // Windows only, ignore if on Linux
    printf("Enter a string: ");

    //gets(str);
    fgets(str, sizeof(str), stdin);
    str[strcspn(str, "\n")] = '\0';        // remove newline

    reverse(str, rev);
    palindrome(str, rev);
    length(str);
    merged(str, rev);

    return 0;
}

void reverse(char str[], char rev[]) {
    int len = strlen(str);
    for (int i = 0; i < len; i++) {
        rev[i] = str[len - i - 1];
    }
    rev[len] = '\0';
    printf("\nReversed string is: %s", rev);
}

void palindrome(char str[], char rev[]) {
    if (strcmp(str, rev) == 0)
        printf("\nThe string is a palindrome");
    else
        printf("\nThe string is not a palindrome");
}

void length(char str[]) {
    int len = strlen(str);
    printf("\nLength of the string is: %d", len);
}

void merged(char str[], char rev[]) {
    char temp[40];
    strcpy(temp, str);
    strcat(temp, rev);
    printf("\nMerged string is: %s", temp);
}
