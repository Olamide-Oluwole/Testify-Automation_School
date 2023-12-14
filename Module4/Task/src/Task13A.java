import java.sql.SQLOutput;

public class Task13A {
    String firstname;
    String lastname;
    int age;
    String skincolor;
    public Task13A(String Pfirstname){ //Overloading the constructor
        firstname = Pfirstname;
        System.out.println("My firstname is " +firstname);
    }

    //A constructor that accepts and prints the firstname and lastname
    public Task13A(String Pfirstname, String Plastname){
        firstname = Pfirstname;
        lastname = Plastname;
        System.out.println("My fullname is " +firstname+ " " +lastname);
    }

    public Task13A(String Pfirstname, String Plastname, int Page){
        firstname = Pfirstname;
        lastname = Plastname;
        age = Page;
        System.out.println("My fullname is " +firstname+ " " +lastname + " and  I am "+age+ " years old.");


    }

}
