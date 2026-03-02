import mysql.connector

con = mysql.connector.connect(host="localhost", user="@notslig", passwd="")
cur = con.cursor()

# cur.execute("DROP DATABASE IF EXISTS Employee_DB")
cur.execute("CREATE DATABASE IF NOT EXISTS Employee_DB")
cur.execute("USE Employee_DB")
cur.execute("""
            CREATE TABLE IF NOT EXISTS Employees (
                EID     INT          PRIMARY KEY,
                EName   VARCHAR(20),
                Salary  INT,
                DA      INT,
                HRA     INT,
                PF      INT,
                Gross   INT,
                NetPay  INT
            )""")

while True:
    print("---Menu---")
    print("1. Insert employee records\n"
            "2. Update salary of all employees\n"
            "3. Display records\n"
            "4. Exit\n")
    ch = int(input("Enter your choice: "))

    
    if ch == 1:
        print("\nEnter employee details")
        eid = int(input("Enter employee ID: "))
        ename = input("Enter employee name: ")
        salary = int(input("Enter employee salary: "))
        cur.execute("INSERT INTO Employees (EID, EName, Salary) VALUES(%s, %s, %s)", (eid, ename, salary))
        print(f"{ename} inserted successfully!")
        con.commit()


    elif ch == 2:
        cur.execute("SELECT * FROM Employees")
        for i in cur.fetchall():
            cur.execute("""
                        UPDATE Employees SET
                        DA = 0.5 * Salary, HRA = 0.1 * Salary, PF = 0.12 * Salary,
                        Gross = DA + HRA + PF,
                        NetPay = Gross - PF
                        WHERE EID = %s""", (int(i[0]), ))
        con.commit()
        print("Salary updated successfully!")


    elif ch == 3:
        cur.execute("SELECT * FROM Employees")
        print("EID\t\tEName\t\tBasic\t\tDA\t\tHRA\t\tPF\t\tGross\t\tNetPay")
        for i in cur.fetchall():
            for j in i:
                print(j, end="\t\t")
            print()


    elif ch == 4:
        print("Exiting...")
        cur.close()
        con.close()
        break


    else:
        print("Invalid choice! Enter again!")
    print()