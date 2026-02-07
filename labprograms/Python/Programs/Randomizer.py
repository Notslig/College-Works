import random 

Set=set()
count=0
for i in range(10):
    randomnumber = random.randint(15,45)
    Set.add(randomnumber)
print("Elements in the set are:",Set)
for i in set(Set):
    if(i<=30):
        count+=1
    elif(i>35):
        Set.remove(i)
print(f"Elements after deletion and >35 {Set} \n Count of the numbers <30: {count}")