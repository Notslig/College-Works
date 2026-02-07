#include<stdio.h>
#include<conio.h>
#include<stdlib.h>

int main() {
    struct student {
        int regno,m1,m2,m3,total;
        char name[20],grade;
        float avg;
    }s[100];
    int n,i;
    system("cls");
    printf("Enter number of students: ");
    scanf("%d",&n);
    for(i=0;i<n;i++) {
        printf("\nEnter details of student %d\n",i+1);
        printf("Enter name: ");
        scanf("%s",s[i].name);
        printf("Enter regno: ");
        scanf("%d",&s[i].regno);
        printf("Enter marks of 3 subjects: ");
        scanf("%d%d%d",&s[i].m1,&s[i].m2,&s[i].m3);
        s[i].total=s[i].m1+s[i].m2+s[i].m3;
        s[i].avg=s[i].total/3.0;
        if(s[i].m1<=35 || s[i].m2<=35 || s[i].m3<=35)
            s[i].grade='Fail';
        else if(s[i].avg>=85)
            s[i].grade='Excellent';
        else if(s[i].avg>=65)
            s[i].grade='Very Good';
        else if(s[i].avg>=45)
            s[i].grade='Good';
        else
            s[i].grade='Pass';
    }
    printf("\n\nStudent Details:\n");
    printf("RegNo\tName\tM1\tM2\tM3\tTotal\tAvg\tGrade\n");
    for(i=0;i<n;i++) {
        printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%c\n",s[i].regno,s[i].name,s[i].m1,s[i].m2,s[i].m3,s[i].total,s[i].avg,s[i].grade);
        getch();

    }
    return 0;
}
