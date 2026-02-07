a <- matrix(
  data = c(1, 2, 3, 4, 5, 6, 7, 8, 9),
  nrow = 3,
  ncol = 3,
  byrow = TRUE
)
print(a)
b <- matrix(
  data = c(9, 8, 7, 6, 5, 4, 3, 2, 1),
  nrow = 3,
  ncol = 3,
  byrow = TRUE
)
print(b)
print("Transpose of a:")
print(t(a))
print("Transpose of b:")
print(t(b))
print("Transpose of a * b:")
print(t(a) %*% t(b))
print("Multiplication of a and transpose of a with transpose of b:")
print(t(b) %*% (a %*% t(a)))
print("Sum of b* transpose(b) and a * transpose(a):")
print((b %*% t(b)) + (a %*% t(a)))
print("Multiplication of transpose(a) and a with transpose of b:")
print(a %*% t(a) %*% t(b))