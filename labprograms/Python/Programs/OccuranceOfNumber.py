import random as R

Dummylist=list()
DummyDictionary=dict()
limit=int(input("Enter the limit of the random numbers:"))
a,b=map(int,input("Enter the range of the limit from start to end:").split("-"))


for i in range(limit):
    Dummylist.append(R.randint(a,b))
    
for i in Dummylist:
    DummyDictionary[i]=Dummylist.count(i)

print("Numbers Generated are:",Dummylist)
print("Occurrence of each number is:",DummyDictionary)