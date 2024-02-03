# Using a for loop to iterate from 0 to 10
for i in range(11):
    # Check if i is equal to 2
    if i == 2:
        continue  # Skip the rest of the loop and move to the next iteration

    # Check if i is equal to 8
    if i == 8:
        break  # Exit the loop

    # Print "Number" and the current value of i
    print("Number", i)
