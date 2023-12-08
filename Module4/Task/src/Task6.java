public class Task6 {
    public static void main(String[] args) {
        String word = "DEMOCRACY";
        //Using StringBuilder to reverse the string
        // creating StringBuilder object
        StringBuilder newword = new StringBuilder();
        newword.append(word);
        // reverse the String
        newword.reverse();
        // get the substring COME from the reversed string and print it out
        System.out.println( "The substring within index 4 and 8 is  : " +newword.substring(4, 8));
    }
}
