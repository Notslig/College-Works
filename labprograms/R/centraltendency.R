#finding mean, median and mpode 
values=c(17,18,19,23,24,20) 
meanvalue=mean(values)
cat("mean: ",meanvalue,"\n")
medianvalue=median(values)
cat("Median:",medianvalue,"\n")
calculatemode=function(x){
    uniquex=unique(values)
    tabulated=tabulate(match(x,uniquex))
    mode=uniquex[tabulated==max(tabulated)]
    return(mode)
}
modevalue=calculatemode(values)
cat("Mode:",modevalue,"\n")

#find range
rangevalues=range(values)
print(tangevalues)
cat("\n The range is ",rangevalues[2]-rangevalues[1])


#Percentile of 35 and 78
per35=quantile(values,0.35)
per78=quantile(values,0.78)
cat("Teh avlue of 35 percentile is",per35,"\n the value of percentile 78 is",per78)

#Variance and standard deviation 
cat("The variance is:",var(values))
cat("\nThe standard deviation is:",sd(values))

#interquartile range
q1=quantile(values,0.25)
q3=quantile(values,0.75)
cat("\n The interquartile range is",(q1-q3))

#finding z-score
zscores=scale(values)
cat("\n The Z score is:",zscores)