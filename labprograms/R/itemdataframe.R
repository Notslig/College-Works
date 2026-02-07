df = data.frame(
    itemcode = c(1001, 1002, 1003, 1004, 1005),
    itemcat = c("Electronics", "desktop_Supplies", "Office_Supplies", "USB", "CD_drive"),
    itemprice = c(700, 300, 350, 400, 800))
a = subset(df, (itemprice >= 350))
b = subset(df, (itemcat %in% c("Office_Supplies","Desktop_Supplies")))
c = subset(df, itemprice > 300 & itemprice < 700)
d = sum(df$itemprice)
itemdetail = data.frame(
    itemcode = c(1001, 1002, 1003, 1004, 1005),
    itemqty = c(20, 4, 20, 19, 15),
    reorderlevel = c(1, 2, 3, 4, 5))
e = merge(df, itemdetail, by = "itemcode")
print(df)
print(a)
print(b)
print(c)
print(d)
print(e)
