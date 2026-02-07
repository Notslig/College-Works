import array 

a=array.array('i')

n=int(input("Enter the size of the array:"))
for i in range(n):
    ele=int(input("Enter the elements into the array:"))
    a.append(ele)
    
print("\n Enter A Operation among the following:")
print("1: Adding a new Element \n")
print("2: Insert an element at a given position \n")
print("3: Deleting an element from the array \n")
print("4: Sort the array and reverse three elements \n")
print("5: Count and display the array elements \n")
print("6: Exit \n")


while True:
    choice=int(input("Enter your choice:"))
    
    if choice==1:
        ele=int(input("Enter the element to be added:"))
        a.append(ele)
        print("Updated array:",a)
        
    elif choice==2:
        pos=int(input("Enter the position to insert the element:"))
        if pos>len(a):
            print("Position out of bounds. Please try again.")
            continue
        else:
            ele=int(input("Enter the element to be inserted:"))
            a.insert(pos,ele)
        print("Updated array:",a)
        
    elif choice==3:
        ele=int(input("Enter the element to be deleted:"))
        if ele not in a:
            print("Element not found in the array. Please try again.")
            continue
        else:
            a.remove(ele)
        print("Updated array:",a)
        
    elif choice==4:
        temp=sorted(a)
        print("Sorted array:",temp)
        temp.reverse()
        a=array.array('i',temp)
        print("Sorted and Reversed array:",a)
        
    elif choice==5:
        print("Array elements are:")
        for i in a:
            print(i,end=' ')
        print("\nLength of the array is:",len(a))
        
    elif choice==6:
        print("Exiting the program.")
        exit()
        
    else:
        print("Invalid choice. Please try again.")