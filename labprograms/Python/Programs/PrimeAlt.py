a,b= map(int,input("Enter the start and end limit").split())
for i in range(a,b+1):
    flag=0
    if i==0 or i==1:
        continue
    for j in range(2,i):
        if i%j==0:
            flag=1
            break
    if(flag==0):
        print(i,end=" ")