employee=dict()
lis=int(input("Enter number of employees: "))

for i in range(lis):
    print()
    employeeNo=int(input("Enter Employee Number: "))
    employeeName=input("Enter Employee Name: ")
    employee[employeeNo]=list()
    employee[employeeNo].append(employeeName)

print(f"Employee Details: {employee}")
print()


for i in employee:
    worked=int(input("Enter the number of hours worked:"))
    if worked > 40:
        overtime = worked - 40
        pay = overtime * 12.00
    else: 
        overtime = 0
        pay = 0
    employee[i].extend([worked,overtime,pay])

print("\n Updated Employee Details")
print("Employee No\tEmployee Name\tHours Worked\tOvertime Hours\tOvertime Pay")
for i in employee:
    print(i,"\t\t",employee[i])