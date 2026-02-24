class skyway:
    flightNo: str = input("Flight Number:")
    origin: str = input("Origin: ")
    Destination: str = input ("Destination: ")
    fare: int = int (input("Fare: "))
    tickets: int = int(input("Ticket: "))
    meal: bool = bool(input("Meal: "))
    iternary: str = input("Iternary: ")
    
    
    @classmethod
    def display(cls) -> None :
        print(f"\n FLIGHT INFORMATION \n")
        print(f"""
                Flight No: {getattr(skyway,'flightNo')} \n
                Origin: {getattr(skyway,'origin')} \n
                Destination: {getattr(skyway,'Destination')}\n
                Fare: {getattr(skyway,'fare')}\n
                Ticket: {getattr(skyway,'tickets')}\n
                Meal: {getattr(skyway,'meal')}\n
                Iternary: {getattr(skyway,'iternary')}
                """)
        
    @classmethod
    def luggage(cls):
        setattr(skyway, "check-in", "15 kg")
        setattr(skyway, "check-out", "17 kg")
        print("Baggage: ")
        print("check-in:", getattr(skyway,"check-in"))
        print("check-out:", getattr(skyway,"check-out"))
        
    def bookTicket(self,pname,ticketNo) -> None:
        self.name = pname
        self.tickets = ticketNo
        skyway.tickets = 30
        if self.tickets <= skyway.tickets :
            skyway.tickets = skyway.tickets - self.tickets
            print(f"Passengers Name: {self.name}")
            print(f"Ticket fare: Rs {self.tickets * int(skyway.fare)}")
            print("\n Thank You")
        else:
            print("Sorry tickets are not available ")

S = skyway()
S.display()
print()
print(""" TICKET SYSTEMS: """)
print(" 1: Update Fare \n 2: Display Baggage \n 3: Update Iternary \n 4: Book Tickets \n 5: Exit \n ")

while True :
    choice: int = int(input("Menu option :"))
    
    if choice == 1 :
        f: int = int(input("Enter the fare: "))
        setattr(skyway, "fare", f)
        print("Fare Updated!")
    elif choice == 2:
        skyway.luggage()
    elif choice == 3:
        i: str = input(f"Enter Iternary of flight number {skyway.iternary}: ")
        setattr(skyway, "iternary", i)
        print(f"Iternary updated to : {skyway.iternary}")
    elif choice == 4:
        _name: str = input("Enter Passenger Name: ")
        ticketcount: int = int(input("Enter the number of tickets booked: "))
        S.bookTicket(_name, ticketcount)
        print(f"Available tickets for flight {skyway.flightNo} is {skyway.tickets}")
    elif choice == 5:
        exit()
    else:
        print("Unidentified input")
        
    
        


        
        
