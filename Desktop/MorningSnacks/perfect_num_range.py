for number in range(1, 1000):
    sum_of_divisor = 0
    
    for divisor in range(1, number):
        if number % divisor == 0:
            sum_of_divisor += divisor
    
    if number == sum_of_divisor:
        print(number)
