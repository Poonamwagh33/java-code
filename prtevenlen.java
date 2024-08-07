public class prtevenlen {
    public static void printwords(String s) {
        for (String word : s.split(" "))

            if (word.length() % 2 == 0)
                System.out.println(word);
    }

    public static void main(String[] args) {
        String s = "i am Poonam wagh";
        printwords(s);
    }
}
