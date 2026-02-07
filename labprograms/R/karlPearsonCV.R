#input data
ad=c(11,13,14,16,16,15,15,14,13,13)
sales=c(50,50,55,60,66,65,65,60,60,50)

#correlati0on
co=cor(ad,sales,method="pearson")
cat("Coefficient of correlation is: ",co,"\n")

#interprediction
if(co>0)
{
    print("Postive correlation")
} else if (co<0){
    print("Negative correlation")
} else [
    print("No correlation")
]

#draw plot
plot(ad,sales,xlab="Advertisement expenses",ylab="Sales volume",main="Correlation between advertisement expenses and sales volume",col="blue",pch=19)
