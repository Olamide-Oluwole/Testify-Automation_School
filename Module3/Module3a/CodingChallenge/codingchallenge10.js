// Create a function that filters out negative numbers.

let arrayOfNumbers = [0, -4, 17, -1, 8,6,10,-4.5]
//This arrow function checks if a number n is less than 0 (i.e., it's a negative number).
// If the condition is true, the number is included in the negativeNumbers array.
negativeNumbers = arrayOfNumbers.filter(n => n <0);
console.log(negativeNumbers)
