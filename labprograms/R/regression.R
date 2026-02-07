# input data 
x=c(2,4,5,6,8,11)
y=c(18,12,10,8,7,5)
print(x)
print(y)

#regression of y on x
myonx=lm(y~x)
summary(myonx)

#regression of x on y
mxony=lm(x~y)
summary(mxony)

#Prediciton when x=7
predicty=predict(myonx,data.frame(x=7))
print(predicty)

#regression equations
cat("Regression equation of y on x=",coef(myonx)[1],"\t",coef(myonx)[2],"\n")
cat("Regression equation of x on y=",coef(mxony)[1],"\t",coef(mxony)[2],"\n")

#predicted value
cat("Predicted value of y when x=7:",predicty,"\n")