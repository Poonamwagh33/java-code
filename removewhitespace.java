public class removewhitespace {
    public static void main(String[] args) {
        String str1 = "Remove white spaces";
        str1 = str1.replaceAll("\\s", "");
        System.out.println("String after removing all the spaces" + str1);
    }
}