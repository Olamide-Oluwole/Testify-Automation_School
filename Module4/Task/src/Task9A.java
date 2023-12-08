public class Task9A {
    public static void main(String[] args) {
        //I have a list of numbers, 1-10, write a loop that prints odd
        // if it is an odd number and a loop that prints even
        // if it is an even number.

        int [] numbers = {1,2,3,4,5,6,7,8,9,10};
        for (int num:
                numbers) {
            if (num%2==0){
                System.out.println(num +" is even");
            } else if (num%2!=0) {
                System.out.println(num +" is odd");
            }

        }
    }
}
