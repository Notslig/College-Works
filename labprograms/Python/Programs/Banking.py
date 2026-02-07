amount = int(input("Enter A amount: "))

if (amount%5)!=0:
    print("Amount not accepted")
else:
    print("Amount accepted")
    _500=amount // 500
    amount=amount % 500
    _200=amount // 200
    amount=amount % 200
    _100=amount // 100
    amount=amount % 100
    _50=amount // 50
    amount=amount % 50
    _20=amount // 20
    amount=amount % 20
    _10=amount // 10
    amount=amount % 10
    _5=amount // 5
    amount=amount % 5

print("\nAmount in denominations:")
print("\n 500:", _500)
print("\n 200:", _200)
print("\n 100:", _100)
print("\n 50:", _50)
print("\n 20:", _20)
print("\n 10:", _10)
print("\n 5:", _5)