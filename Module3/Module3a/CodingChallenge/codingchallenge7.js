const numberArray = [0, 4, 9, 1, 5, 11, 3, 19];

// Using the sort() method with a custom comparison function to sort the array in descending order
numberArray.sort((a, b) => b - a);

console.log(numberArray);
