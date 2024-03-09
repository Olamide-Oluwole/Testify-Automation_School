fruits = {
    "green": "apple",
    "yellow": "banana",
    "red": "strawberry",
    "blue": "blueberries",
}
# Print the dictionary to console
print("See different fruits and their colors:", fruits)

# update the list
fruits.update({"orange": "orange"})
print("The updated fruit list is ", fruits)

# get the items in the list
fruit_item = fruits.get("red")
print(fruit_item)

