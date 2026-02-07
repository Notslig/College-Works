print("Enter the number")
v1 <- c(1, 2, 3, 4, 5)    #scan()
print("The elements are")
print(v1)
asc <- dsc <- equ <- 0
i <- 1
while(i<length(v1)) {
    if (v1[i] < v1 [i+1]) {
        asc <- 1
    } else if (v1 [i] > v1[i+1]) {
        dsc <- 1
    }
    i <- i+1
}
if (asc == 1 && dsc == 0) {
  print("The order is in ascending ")
} else if (asc == 0 && dsc == 1) {
  print("The order is in descending order ")
} else if (asc == 0 && dsc == 0) {
  print("the eleemnts are equal ")
} else {
    print("Random order arranged ")
}
 