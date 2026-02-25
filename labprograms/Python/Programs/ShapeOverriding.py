class rectangle:
    def __init__(self, length, breadth):
        self.length = length
        self.breadth = breadth

    def area(self)-> int:
        return self.length * self.breadth

    def perimeter(self)-> int:
        return 2 * (self.length + self.breadth)
    
    def display(self)-> None:
        print("Rectangle Details:")
        print(f"Length = {self.length}, Breadth = {self.breadth}")
        print(f"Area = {self.area()}")
        print(f"Perimeter = {self.perimeter()}")
        
class box(rectangle):
    def __init__(self,length, breadth, height):
        super().__init__(length, breadth)
        self.height = height

    def volume(self)-> int:
        return self.area() * self.height

    def area(self)-> int:
        return 2 * (self.length * self.breadth + self.length * self.height + self.breadth * self.height)

    def display(self)-> None:
        super().display()
        print("\n Box Details:")
        print(f"Height = {self.height}")
        print(f"Volume = {self.volume()}")
        print(f"Surface Area = {self.area()}")
        
rec = rectangle(5, 3)
rec.display()

print("\n")
box1 = box(5, 3, 4)
box1.display()
