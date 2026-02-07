import datetime as DT

issueddate=input("Enter the date of return of the book (DD-MM-YYYY):")
year,month,day=map(int,issueddate.split('-'))
issued=DT.date(year,month,day)

duedate=input("Enter the due date of the book (DD-MM-YYYY):")
dueyear,duemonth,duedate=map(int,duedate.split('-'))
due=DT.date(dueyear,duemonth,duedate)


periodofpossession = issued - due
graceperiod = periodofpossession.days - 15
print("The book was kept for", periodofpossession.days, "days")


if graceperiod <=  5:
    fine = graceperiod * 0.50
    print("The fine to be paid is: Rs.", fine)
elif graceperiod <= 10:
    fine = (5*0.50) + graceperiod * 1.00
    print("The fine to be paid is: Rs.", fine)
elif graceperiod <= 20:
    fine= (5*0.50) + (5*1.00) + graceperiod * 5.00
    print("The fine to be paid is: Rs.", fine)
else:
    fine = (5*0.50) + (5*1.00) + (10*5.00) + graceperiod * 5.00
    print(f"The fine to be paid is: Rs. {fine} \n Additionally, the membership is cancelled.")