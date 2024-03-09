def filter_negative_numbers(numbers):
    return [num for num in numbers if num >= 0]


numbers = [1, -2, 3, -4, 5, -6]
filtered_numbers = filter_negative_numbers(numbers)
print("Original Numbers:", numbers)
print("Filtered Numbers (Non-negative):", filtered_numbers)
