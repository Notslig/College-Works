repeat {
  cat("Menu Options:\n")
  cat("1. Check Armstrong Number\n")
  cat("2. Check Palindrome Number\n")
  cat("3. Exit\n")
  choice <- as.integer(readline(prompt = "Enter among the  choice :"))
  if (choice == 1) {
    num <- as.integer(readline(
    prompt = "Enter a number to check if it is an Armstrong number: "))
    sum <- 0
    temp <- num
    while (temp > 0) {
      digit <- temp / 10
      sum <- sum + (digit^3)
      temp <- temp %/% 10
    }
    if (sum == num) {
      cat(num, "is an Armstrong number.\n")
    } else {
      cat(num, "is not an Armstrong number.\n")
    }
  } else if (choice == 2) {
    num <- as.integer(readline(
    prompt = "Enter a number to check if it is a Palindrome: "))
    rev <- 0
    temp <- num
    while (temp > 0) {
      digit <- temp %/% 10
      rev <- rev * 10 + digit
      temp <- temp %/% 10
    }
    if (rev == num) {
      cat(num, "is a Palindrome number.\n")
    } else {
      cat(num, "is not a Palindrome number.\n")
    }
  }else if (choice == 3) {
    cat("Exiting the program.\n")
    break
  }
}