//A program that prints the name of the triangle based on the length of the sides in relation to one another.
//Print Equilateral triangle if all the sides are equal
//Print Isosceles triangle if only two the sides are equal
//Print Scalene triangle if only none of the sides are equal
const side1 = 3
const side2 = 4
const side3 = 7

if ((side1 == side2) && (side2 == side3)) {
    console.log("Equilateral triangle")
}
else if ((side1 == side2) || (side1 == side3) || (side2 == side3)) {
    console.log("Isosceles triangle")
}
else {
    console.log("Scalene triangle")
}