public class Task16A {
    //Demonstrating method overloading
    public static void main(String[] args) {
        Task16A overload = new Task16A();
        overload.doAssignment(56, "Quantitative");
        overload.doAssignment("Mental Maths", 59);
        overload.doAssignment(57.89,"Further Maths");

    }

    public void doAssignment(String maths, int score){
        System.out.println("I take in String and int in that order");
    }

    //overloading method doAssignment by changing the sequence of its arguments
    public void doAssignment(int score, String maths){
        System.out.println("I'm overloading doAssignment by changing my sequence of arguments");
    }

    //overloading method doAssignment by changing the datatype of its arguments
    public void doAssignment(double score, String maths){
        System.out.println("I'm overloading doAssignment by changing my datatype from int to double");
    }



}
