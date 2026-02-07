totallimit = int(input("Enter the total number of students:  "))
student=dict()
studentinfo = {}

for i in range(totallimit):
    reg = int(input("Enter the registration number:  "))
    name = input("Enter the name of the student:  ")
    studentinfo[reg] = name
    
print(f"\n Student Details: \n In list: {studentinfo} \n Sorted list: {sorted(studentinfo)}")

student_info = dict(sorted(studentinfo.items()))
print("Student details in sorted order:", student_info)

num = int(input("\nEnter the registration number to search:  "))
for i in student_info.keys():
    if i==num:
        print(f"Student exists \n Student Name: {student_info[num]}")
        break
else:
    print("Student does not exist")