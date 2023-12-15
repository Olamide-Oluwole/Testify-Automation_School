public class Task16BChildClass extends Task16BParentClass{
    public static void main(String[] args) {
        Task16BParentClass parentClass = new Task16BParentClass();
        Task16BChildClass childClass = new Task16BChildClass();
        // Calling methods from the parent class
        parentClass.getName("Olamide");
        parentClass.getFullname("Olamide","Oluwole");

        // Calling methods from the child class
        childClass.getName("Abiola");
        childClass.getFullname("Abiola", "Ajibogun");

    }

    void getName(String fullname) {
        System.out.println("My real full name is : " + fullname);
    }

    // Overiding the parent method with 2 args
    void getFullname(String firstname, String lastname) {
        System.out.println("My real first and last names are: " + firstname + ", " + lastname);
    }
}
