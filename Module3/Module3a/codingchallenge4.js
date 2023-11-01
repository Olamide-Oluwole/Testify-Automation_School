// Print a table containing 8 multiplication tables.

const number = 8;
const multiplyBy = 12;

for (i=1; i<=multiplyBy; i++){
  let multipliedNumber = number * i;
  console.log(number+ "*" +i+ " = " +multipliedNumber)
}