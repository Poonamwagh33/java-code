// it is compareTo() method used for comparing two string lexicograplically in java.
public class lexicograph {
    public static void main(String[] args) {
        String s1 = "Ram";
        String s2 = "Ram";
        String s3 = "Shyam";
        String s4 = "ABC";
        System.out.println("comparing strings with compareTo:");
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s3));
        System.out.println(s1.compareTo(s4));
    }
}
