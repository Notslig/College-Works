#include<conio.h>
#include<stdio.h>
#include<stdlib.h>
#include<math.h>
#include<string.h>
#include<ctype.h>

int top=-1;
char symbol;
int s[10],op1,op2,result;

int compute(char symbol, int op1, int op2)
{
    switch(symbol)
    {
        case '+': return(op1+op2);
        case '-': return(op1-op2);
        case '*': return(op1*op2);
        case '/': return(op1/op2);
        case '%': return(op1%op2);
        case '^': return(pow(op1,op2));
    }
    return 0;
}

void main(){
    int i ;
    char postfix[20],symbol;
    system("cls");
    printf("Enter the postfix expression: ");
    scanf("%s",postfix);
    for(i=0;i<strlen(postfix);i++)
    {
        symbol=postfix[i];
        if(isdigit(symbol))
        {
            s[++top]=symbol-'0';
        }
        else
        {
            op2=s[top--];
            op1=s[top--];
            result=compute(symbol,op1,op2);
            s[++top]=result;
        }
    }
    result=s[top];
    printf("Result of expression evaluation: %d",result);
    getch();
}