import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        {
            //Declare the variables for principal, rate, time and final result
            float p, r, t, simpleinterest;
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the Principal : ");
            p = input.nextFloat();
            System.out.print("Enter the Rate of interest : ");
            r = input.nextFloat();
            System.out.print("Enter the Time period : ");
            t = input.nextFloat();
            input.close();
            simpleinterest = (p * r * t) / 100;
            System.out.print("The simple interest payable is " + simpleinterest);
        }
    }
}
