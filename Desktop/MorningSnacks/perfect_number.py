user_input = input( "Enter number  :")
sum = 0
for number in range(1, user_input):
    if user_input%number ==0:
        sum=sum+1
if sum==user_input:
    print(user_input "is a perfect number")
else:
    print(user_input "is not a perfect number") 
        
