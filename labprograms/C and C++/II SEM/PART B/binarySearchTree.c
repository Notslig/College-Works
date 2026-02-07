#include<conio.h>
#include<stdio.h>
#include<stdlib.h>
#include<process.h>

struct node
{
    int data;
    struct node *left;
    struct node *right;
};
typedef struct node *NODE;
NODE getnode() {
    NODE x;
    x=(NODE)malloc(sizeof(struct node));
    if(x==NULL) {
        printf("Memory not available\n");
        exit(0);
    }
    return x;
}

void preorder(NODE root) {
    if(root!=NULL) {
        printf("%d ",root->data);
        preorder(root->left);
        preorder(root->right);
    }
}

void inorder(NODE root) {
    if(root!=NULL) {
        inorder(root->left);
        printf("%d ",root->data);
        inorder(root->right);
    }
}

void postorder(NODE root) {
    if(root!=NULL) {
        postorder(root->left);
        postorder(root->right);
        printf("%d ",root->data);
    }
}

NODE insert (NODE root,int item){\
    NODE temp,curr,prev;
    temp=getnode();
    temp->data=item;
    temp->left=NULL;
    temp->right=NULL;
    if(root==NULL)
        return temp;
    prev=NULL;
    curr=root;
    while(curr!=NULL) {
        prev=curr;
        if(item<curr->data)
            curr=curr->left;
        else
            curr=curr->right;
    }
    if(item<prev->data)
        prev->left=temp;
    else
        prev->right=temp;
    return root;
}

void main() {
    NODE root=NULL;
    int choice,item;
    do {
        printf("1.Insert\n");
        printf("2.Preorder\n");
        printf("3.Inorder\n");
        printf("4.Postorder\n");
        printf("5.Exit\n");
        printf("Enter your choice:\n");
        scanf("%d",&choice);
        switch(choice) {
            case 1:printf("Enter the item to be inserted:\n");
                   scanf("%d",&item);
                   root=insert(root,item);
                   break;
            case 2:printf("Preorder traversal:\n");
                   preorder(root);
                   printf("\n");
                   break;
            case 3:printf("Inorder traversal:\n");
                   inorder(root);
                   printf("\n");
                   break;
            case 4:printf("Postorder traversal:\n");
                   postorder(root);
                   printf("\n");
                   break;
            case 5:exit(0);
            default:printf("Wrong choice\n");
        }
    }while(choice<=5);
    getch();
    return;
}
