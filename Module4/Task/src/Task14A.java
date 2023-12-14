public class Task14A {
    private int shapeSides; // The sides of the square will always be 4
    private double shapeLength;
    private double shapeBreadth;

    // Constructor
    public Task14A() {
        this.shapeSides = 4;
    }

    // Getter for shape sides (no setter to enforce the value of 4)
    public int getShapeSides() {
        return shapeSides;
    }

    // Getter and Setter for shape length
    public double getShapeLength() {
        return shapeLength;
    }

    public void setShapeLength(double length) {
        this.shapeLength = length;
    }

    // Getter and Setter for shape breadth
    public double getShapeBreadth() {
        return shapeBreadth;
    }

    public void setShapeBreadth(double breadth) {
        this.shapeBreadth = breadth;
    }
}
