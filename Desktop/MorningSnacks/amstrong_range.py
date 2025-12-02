for number in range(1, 1001):
    sum_cube = 0
    original_number = number
    
    while original_number > 0:
        digit = original_number % 10
        sum_cube += digit * digit * digit
        original_number //= 10

    if number == sum_cube:
        print(number)
