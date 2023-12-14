public class Task14B {
    public static void main(String[] args) {
        // Creating an object of class A (Square)
        Task14A square = new Task14A();

        // Setting values for length and breadth
        square.setShapeLength(8.0);
        square.setShapeBreadth(8.0);

        // Getting values and calculating the area
        double length = square.getShapeLength();
        double breadth = square.getShapeBreadth();
        double area = length * breadth;

        // Printing the final calculation
        System.out.println("The area of a square of length: " + length +
                " and breadth: " + breadth + " is " + area);
    }
}
