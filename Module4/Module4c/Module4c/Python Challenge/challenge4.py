def print_multiplication_table(up_to):
    for i in range(1, up_to + 1):
        for j in range(1, up_to + 1):
            print(f"{i} * {j} = {i * j}")
        print()  # Adds a new line after each row of multiplication


# Print multiplication table up to 8
print_multiplication_table(8)
