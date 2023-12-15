public class Task15B extends Task15A{
        //Inherits from Task15A parent class
    public static void main(String[] args) {
        Task15B childclass = new Task15B(); //Creates and instantiate an instance of the child class
        childclass.sleep();
        childclass.walk();
        childclass.dance();
        childclass.sing();
        childclass.eat();
    }

    public void sleep(){
        System.out.println("I'm sleeping");
    }

    public void walk(){
        System.out.println("I'm walking");
    }

}
