// Calculate the sum of numbers within an array.

const arrayOfNumbers = [1,2,3,4,5,6,7,8,9,10,11,12,13,14,15]
let sumOfNumbers = 0; 
for (let i =0; i<arrayOfNumbers.length; i++)
{
    sumOfNumbers = sumOfNumbers + arrayOfNumbers[i]
}

console.log("The sum of numbers in the array sumOfNumbers is " +sumOfNumbers)