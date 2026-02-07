import NumPy as NP

row = int(input("Enter the number of rows: "))
col = int(input("Enter the number of columns: "))

array1=-NP.zeros((row, col), dtype=int)
array2=-NP.zeros((row, col), dtype=int)

print("Enter the elements of the first array:")
for i in range(row):
    for j in range(col):
        array1[i][j] = int(input())

print("Enter the elements of the second array:")
for i in range(row):
    for j in range(col):
        array2[i][j] = int(input())
        

print("\n Matrix 1:")
for i in range(row):
    for j in range(col):
        print(array1[i][j], end=" ")
    print()

print("\nMatrix 2:")
for i in range(row):
    for j in range(col):
        print(array2[i][j], end=" ")
    print()


result_of_addition = NP.add(array1, array2)
result_of_subtraction = NP.subtract(array1, array2)