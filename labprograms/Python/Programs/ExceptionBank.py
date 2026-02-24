class lowincomeexception(Exception):
    pass

class bank:
    customercount: int = 0
    
    def __init__(self, name, id):
        self.name = name
        self.id = id
        bank.customercount += 1
        
class loan(bank):
    totalfund: int = 500000
    sanctionedamount: int = 0
    
    def __init__(self, name, id, income):
        super().__init__(name, id)
        self.income: int = income 
        self.loanamount: int = 0
        
    def sanctionloan(self, amount):
        try:
            if self.income < 25000:
                raise lowincomeexception("Income is too low to sanction a loan.")

            if loan.totalfund - loan.sanctionedamount < amount:
                raise ValueError("Not enough funds available to sanction the loan.")

            self.loanamount = amount
            loan.sanctionedamount += amount
            print("Loan sanctioned successfully. \n Loan amount: ", amount)
            print()

        except lowincomeexception as e:
            print("Loan sanction failed: ", e)
            
        except ValueError as e:
            print("Loan sanction failed: ", e)

    def display(self) -> None:
        print("Customer Name: ", self.name)
        print("Customer ID: ", self.id)
        print("Customer Income: ", self.income)
        print("Loan Amount: ", self.loanamount)

    @classmethod
    def loandetails(cls) -> None:
        print("""
            \n ----BANK LOAN SUMMARY---
            \n total Customers: {}
            \n total Funds: {}
            \n total Loan Amount Sanctioned: {}
            \n remaining Funds: {}
        """
        .format(cls.customercount, cls.totalfund, cls.sanctionedamount, cls.totalfund - cls.sanctionedamount))
        
customer = []
choice: bool = True

while choice:
    name: str = input("Enter customer name: ")
    id: str = input("Enter customer ID: ")
    income: int = int(input("Enter customer income: "))
    loanamt: int = int(input("Enter loan amount to sanction: "))

    cust = loan(name, id, income)
    cust.sanctionloan(loanamt)
    customer.append(cust)

    more: str = input("Do you want to add more customers? (yes/no): ")
    if more.lower() != 'yes':
        choice = False
        
        
print("\n---Customer Details---")
for cust in customer:
    cust.display()

loan.loandetails()