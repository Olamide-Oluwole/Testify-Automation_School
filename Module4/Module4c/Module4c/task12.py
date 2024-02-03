# Declare a global variable with name as language and value as "Python"
language = "Python"

# Create a function
def print_local_language():
    # Declare a local variable with name as language and value as "Java"
    language = "Java"
    # Print out the local variable in the function
    print(f"Inside the function: {language}")

# Print out the global variable outside the function
print(f"Outside the function: {language}")

# Invoke the function
print_local_language()
