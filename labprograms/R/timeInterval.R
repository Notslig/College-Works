timeintervalinput=readline(prompt="Enter the expenditure intervals seperated by commas")

timeinterval=unlist(strsplit(timeintervalinput,","))
studentsin=readline(prompt="Enter the no of students")
students=as.numeric(unlist(strsplit(studentsin,",")))

barplot(students,names.arg=timeinterval,col="skyblue",xlab="Time(min)",ylab="No of students",main="BArplot of time taken by students")
midpoint=sapply(timeinterval,function(interval){
    parts=as.numeric(unlist(strsplit(interval,"-")))
    mean(parts)
})

plot(midpoint,students,type="o",col="red",xlab="Time(min)",ylab="Number of students",main="Frequency polygon of time taken by students")