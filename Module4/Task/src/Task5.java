public class Task5 {
    public static void main(String[] args) {
        int number = 25;
        //checks for both conditions first
          if (number%5==0&&number%3==0){
            System.out.println("FizzBuzz");
        }
          //Checks the next condition to see if the number is divisible by 3
        else if(number%3==0){
            System.out.println("Fizz");
        }
          //Checks the next condition to see if the number is divisible by 5
          else if (number % 5 == 0) {
            System.out.println("Buzz");
        }
        else //If none of the condition is met
            System.out.println("The number is neither divisible by 3 nor 5");



    }
}
