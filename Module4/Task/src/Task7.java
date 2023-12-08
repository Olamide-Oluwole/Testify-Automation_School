import java.lang.reflect.Array;
import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {
        String [][] fruits = new String [4][3];
        fruits [0][0] = "mango";
        fruits [1][0] = "watermelon";
        fruits [2][0] = "banana";
        fruits [3][0] = "orange";

        System.out.println("The fruits in the first column are: "+Arrays.deepToString(fruits));

    }
}
