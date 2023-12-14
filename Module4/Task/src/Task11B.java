public class Task11B {

    // Class B

        public static void main(String[] args) {
            // Creating an object of class A
            Task11A objectA = new Task11A();
            //Assigning Olamide to the instance of the variable in class A
            objectA.name = "Olamide";

            // Printing the name from Class A
            System.out.println("Name from Class A: " + objectA.returnName(objectA.name));
        }
    }

