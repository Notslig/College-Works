maritalstatus <- factor(c("Married", "Single", "Divorce", "Single", "Married"))
print(maritalstatus)
check = is.factor(maritalstatus)
print(check)
maritalstatus[c(2,4)]
maritalstatus[-3]  #maritalstatus(-3) uses VSCode complier
maritalstatus[2] <- "Married"
levels(maritalstatus) <- c(levels(maritalstatus), "Widow")   #uses levels(VSCode) instead of level 
print(maritalstatus)