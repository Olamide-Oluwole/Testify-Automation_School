# Function that accepts two numbers, adds them, and prints the result
def add_and_print(a, b):
    result = a + b
    print(f"The result of adding {a} and {b} is: {result}")

# Function that returns the string "Testify Python"
def return_testify_python():
    return "Testify Python"

# Invoke/call the first function
add_and_print(5, 7)

# Invoke/call the second function and print the returned value
returned_string = return_testify_python()
print(returned_string)
