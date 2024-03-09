def count_vowels(string):
    vowels = "aeiouAEIOU"
    count = 0
    for char in string:
        if char in vowels:
            count += 1
    return count


input_string = "Good Morning Lamide"
print(f"The number of vowels in '{input_string}' is: {count_vowels(input_string)}")
