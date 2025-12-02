def my_list(numbers):
    result=[]
    for number in numbers:
        result.append(number)
        result.append(number*number)
        result.append(number*number*number)
        
    return result  

print(my_list([1,2,3]))
