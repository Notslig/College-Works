import mysql.connector 
import sqlite3

#mysql -u @notslig -p
#password = 67
connect = mysql.connector.connect(host="localhost", user="@notslig", password="67")
cursor = connect.cursor()

drop: bool = False
if drop:
    cursor.execute("DROP DATABASE IF EXISTS library")
    connect.commit()
    connect.close()

cursor.execute("CREATE DATABASE IF NOT EXISTS library")
cursor.execute("USE library")

cursor.execute("""
            create table if not exists books(
                user int not null unique,
                title varchar(20),
                publisher varchar(20),
                price int,
                copies int
            )
            """)

class library:
    
    def printdetails(self, data):
        print("User \t\t Title \t\t Publisher \t Price \t Copies")
        
        for row in data:
            for i in row:
                print(i, end="\t\t")
            print()
            
    def insertdetails(self, user, title, publisher, price, copies):
        cursor.execute("insert into books values(%s, %s, %s, %s, %s)", (user, title, publisher, price, copies))
        connect.commit()
        print(f"Book with user {user} inserted successfully. \n book log: to:{user} **{title}** by: {publisher} Rs{price} copy:{copies}")
        
    def searchbook(self, user):
        cursor.execute("select * from books where user = %s", (user,))
        
        if cursor.fetchall():
            print(cursor.fetchall())
        else:
            print(f"No book found with user {user}")
            
    def viewbook(self):
        cursor.execute("select * from books")
        self.printdetails(cursor.fetchall())
        
    def costbook(self):
        print("Books sorted by price in descending order:")
        cursor.execute("select * from books order by price desc")
        self.printdetails(cursor.fetchall())
        print("Costliest book:")
        cursor.execute("select * from books order by price desc limit 1")
        self.printdetails(cursor.fetchall())
        
    def shelfcost(self):
        cursor.execute("select sum(price * copies) from books")
        print("Total Cost:")
        totalprice = cursor.fetchall()[0]  # fetchall() returns a list of tuples, so we access the first element
        if totalprice is not None:
            print(totalprice)
        else:
            print("No books found in the library.")
    
print()
Library = library()

while True:
    print("""
        \n
        --MENU FOR LIBRARY--
        1. Insert Book Details
        2. Search Book by User
        3. View All Books
        4. View Books by Cost
        5. View Total Cost of Books in Shelf
        6. Exit
        """)
    
    choice: str = input("Enter your choice: ")
    drop: bool = bool(input("Clear existing data? (True/False): "))

    if choice == "1":
        user: str = input("Enter user ID: ")
        title: str = input("Enter book title: ")
        publisher: str = input("Enter book publisher: ")
        price: int = int(input("Enter book price: "))
        copies: int = int(input("Enter number of copies: "))
        Library.insertdetails(user, title, publisher, price, copies)
    elif choice == "2":
        user: str = input("Enter user ID to search: ")
        Library.searchbook(user)
    elif choice == "3":
        Library.viewbook()
    elif choice == "4":
        Library.costbook()
    elif choice == "5":
        Library.shelfcost()
    elif choice == "6":
        print("Exiting the program.")
        cursor.close()
        connect.close()
        break
    else:
        print("Invalid choice. Please try again.")
