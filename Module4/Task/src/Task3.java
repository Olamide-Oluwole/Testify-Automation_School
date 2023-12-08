public class Task3 {
    public static void main(String[] args) {
       //declaring my age
        int age = 39;
        String text = "I am ";
        String text2 = " years old.";
        // concatenating using string and primitive concat
        System.out.println(text + age + text2);
        //concatenating using the concat() method
        System.out.println(text.concat(age +text2));

    }
}
