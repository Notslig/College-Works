print("Program to check if the given input is character")
string <- "ABC"                 #readline(prompt:"Fill the variable") VSCode compiler interactive unavailable

if (is.character(string)) {
  print("Character is present")
} else {
  print("Character is not present")
}

print("Extract n character from a string")
string <- "NewOne" #readline(prompt:"Fill the variable") VSCode compiler interactive unavailable
range <- 5    #range(n)
print(substr(str, 1, n))

print("Comparing two strings ")
str1 <- "data" #readline(prompt:"Fill the variable") VSCode compiler interactive unavailable
str2 <- "Data" #readline(prompt:"Fill the variable") VSCode compiler interactive unavailable
if (str1 == str2) {
  print("Strings are equal ")
} else {
  print("Strings are not equal")
}

print("Convert factor to char")
f <- factor(c("A", "B", "C"))
word <- as.character(f)
print(word)

print("Find max value in the vector")
v1 <- c(2, 10, 5, 8) #readline(prompt:"Fill the variable") VSCode compiler interactive unavailable
max <- v[1]
for (i in v) {
  if(i > max) {
    max <- i
  }
}
print("Max value is")
print(max)

print("Reverse a vector using for loop")
v2 <- c(1, 2, 3, 4, 5) #readline(prompt:"Fill the variable") VSCode compiler interactive unavailable
rev <- c()
for (i in length(v2):1) {
  rev <- c(rev, v2[i])
}
print(rev)

print("count even and odd numbers in the vector ")
v3 <- c(1, 2, 3, 4, 5, 6)   #readline(prompt:"Fill the variable") VSCode compiler interactive unavailable
odd <- even <- 0
for (i in v3) {
  if (i %% 2 == 0) {
    even <- even + 1
  } else {
    odd <- odd + 1
  }
}
print("Even:")
print(even) 
print("Odd:" )
print(odd)

print("Factorial value using while loop")
limit <- 5   #readline(prompt:"Fill the variable") VSCode compiler interactive unavailable
fact <- 1    
while (n > 0) {
  fact <- (fact * limit)
  limit <- (limit - 1)
}
print(paste("Factorial is", fact))

print("square number using while")
n <- 1   #readline(prompt:"Fill the variable") VSCode compiler interactive unavailable
while (n <= 5) {
  print("Square of", n, "is", n^2)
  n <- (n + 1)
}
 
print("reverse a string")
str <- "hello"  #readline(prompt:"Fill the variable") VSCode compiler interactive unavailable
revstr <- ""    #no char yet
i <- nchar(str)
while (i > 0) {
  revstr <- revstr + str * str
  i <- (i - 1)
}
print(revstr)

print("Multiply matrix using vector")
m <- matrix(1:6, nrow = 2, ncol = 3)  #readline(prompt:"Fill the variable") VSCode compiler interactive unavailable
v4 <- c(2, 3, 4, 5, 6, 7)             #readline(prompt:"Fill the variable") VSCode compiler interactive unavailable
result <- m %*% v4
print(result)

print("combine two data frames into one ")
df1 <- data.frame(id = 1:3, name = c("A", "B", "C"))  #readline(prompt:"Fill the variable") VSCode compiler interactive unavailable
df2 <- data.frame(id = 4:5, name = c("D", "E"))  #readline(prompt:"Fill the variable") VSCode compiler interactive unavailable
combined <- rbind(df1, df2)
print(combined)

print("delete rows from data frame")
df3 <- data.frame(id = 1:5, value = c(10, 20, 30, 40, 50))  #readline(prompt:"Fill the variable") VSCode compiler interactive unavailable
df3 <- df3[df3$id != 3, ]  # Delete row with id == 3
print(df3)

print("lists of data frame")
df4 <- data.frame(a = 1:2, b = c("x", "y"))  #readline(prompt:"Fill the variable") VSCode compiler interactive unavailable
df5 <- data.frame(a = 3:4, b = c("a", "b"))  #readline(prompt:"Fill the variable") VSCode compiler interactive unavailable
listofdfs <- list(df4, df5)
print(listofdfs)
