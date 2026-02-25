from abc import ABC, abstractmethod

class tourism(ABC):
    print("Price setting for the guest house and vehicle rental: ")
    guestrent: int = int(input("Rent of guest per day: "))
    vehiclerent: int = int(input("Vehicle rent per km: "))
    
    def __init__(self,custname):
        self.custname: str = custname

    @abstractmethod
    def booking(self,value):
        pass
    
class guesthouse(tourism):
    def __init__(self, custname, noofguest):
        super().__init__(custname)
        self.noofguest: int = noofguest
        
    def booking(self,value):
        self.noofdays: int = value
        print(f"Customer name: {self.custname} \n No of people stayed: {self.noofguest}")
        cost: int = self.noofdays * tourism.guestrent * self.noofguest
        print(f"Total rent to be paid for {self.noofdays} days : {cost} Rs")
        
class vehicle(tourism):
    def __init__(self,custname):
        super().__init__(custname)
    def booking(self,value):
        self.kms: int = value
        print("Customer name: ",self.custname)
        if (self.kms <= 25):
            rent: int = 400 + (25 * tourism.vehiclerent)
            print(f"Vehicle rented for {self.kms} kms : {rent} Rs")
        else:
            rent: int = 400 * (self.kms * tourism.vehiclerent)
            print(f"Vehicle rented for {self.kms} kms : {rent} Rs")
            
print()
print("Guest House Booking: ")
guest = guesthouse(input("Enter the name of the customer: "), int(input("Enter the number of guests: ")))
guest.booking(int(input("Enter the number of days: ")))
print()
print("Vehicle Booking: ")
vehicles = vehicle(input("Enter the name of the customer: "))
vehicles.booking(int(input("Enter the number of kms: ")))