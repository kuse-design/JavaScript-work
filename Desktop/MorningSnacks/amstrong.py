user_input = int(input("Enter number: "))
original = user_input   # keep original number safe
sum_cube = 0

while user_input > 0:
    digit = user_input % 10
    sum_cube += digit * digit * digit
    user_input //= 10

if original == sum_cube:
    print(f"{original} is an Armstrong number")
else:
    print(f"{original} is NOT an Armstrong number")

