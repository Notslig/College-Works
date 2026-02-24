class student:
    def __init__(self, name, rno):
        self.name: str = name 
        self.rno: int = rno 
    marks = {}
        
    def readmarks(self, m1, m2, m3, m4):
        self.marks = {"Python:":m1, "CN:":m2,"OS:":m3,"FA:":m4}
            
    def calculate(self):
        self.total: int = sum(self.marks.values())
        self.percentage: float = self.total/400 
        self.percentage: float = self.percentage * 100 
        
    def grade(self) -> str:
        if self.percentage >= 75:
            self.result: str ="Distinction"
        elif self.percentage >= 65:
            self.result: str ="First Class"
        elif self.percentage >= 55:
            self.result: str ="Second Class"
        elif self.percentage >= 45:
            self.result: str ="Third Class"
        else:
            self.result: str ="Distinction"
            
        return self.result
            
            
    def display(self):
        print(f"""
            Name: {self.name}
            Reg No: {self.rno}
            Marks: {self.marks}
            Total: {self.total}
            Percentage: {round(self.percentage)}%
            Grade: {self.grade()}
            """)
        
            
            
name: str = input("Enter the students name: ")
regno: int = int(input("Enter the students Register Number: "))
obj = student(name, regno)
print("\n Enter the marks in order (4 inputs )")
obj.readmarks(int(input()), int(input()), int(input()), int(input()))
obj.calculate()
obj.display()
