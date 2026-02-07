end = int(input("Enter end number: "))

for num in range(2,end):
    for i in range(2,num):
        if(num%i==0):
            break
    else:
        print(num)