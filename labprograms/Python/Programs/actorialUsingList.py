limit = int(input("Enter the limit: "))
List = list()


def factorial(limit):
    if limit<1:
        return 1
    else:
        return limit * factorial(limit - 1)
    
for i in range(limit):
    List.append(int(input("Enter number: ")))
fact = list(map(factorial,List))
print(f"Entered number are: {List}\n Corresponding factorial numbers are: {fact}")
