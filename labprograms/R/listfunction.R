mainlist = list( name = "Abby", 25, c(100, 98, 90), TRUE)
print(mainlist)
print("First element")
print(mainlist(x[[1]]))
print("giving names to the list ")
names(mainlist) = c("Name", "Age", "Marks", "Status")
print(mainlist)
print('Adding element at a specified position in the list')
mainlist$ID=101
print(mainlist)
print("remove an element from the list")
mainlist=mainlist[-2]
print(mainlist)
print("Printing the first and third element of the list")
print(mainlist[c(1,3)])
print9"Updating the specified element in the list")
mainlist[2]=78
print(mainlist[2])
