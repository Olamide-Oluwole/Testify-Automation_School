def is_divisible_by_10(number):
    return number % 10 == 0


num = 30
print(f"Is {num} divisible by 10? {is_divisible_by_10(num)}")  # Output: True

num = 25
print(f"Is {num} divisible by 10? {is_divisible_by_10(num)}")  # Output: False
