public class Task15B extends Task15A{
        //Inherits from Task15A class
    public static void main(String[] args) {
        Task15A inheritance = new Task15A(); //Creates and instantiate an instance of the parent class
        inheritance.dance();
        inheritance.sing();
        inheritance.eat();
        Task15B childclass = new Task15B(); //Creates and instantiate an instance of the child class
        childclass.sleep();
        childclass.walk();
    }

    public void sleep(){
        System.out.println("I'm sleeping");
    }

    public void walk(){
        System.out.println("I'm walking");
    }

}
