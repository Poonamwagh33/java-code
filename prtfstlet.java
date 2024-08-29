import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class prtfstlet {
    public static void main(String[] args) {
        String s1 = "Poonam Wagh";
        String s2 = "Udayraj Wagh";
        Pattern p = Pattern.compile("\\b[a-zA-Z]");
        Matcher m1 = p.matcher(s1);
        Matcher m2 = p.matcher(s2);
        System.out.println("first letter of each word from string\" " + s1 + "\":");
        while (m1.find())
            System.out.println(m1.group());
        System.out.println();
        System.out.println("first letter of each word from string\" " + s2 + "\":");
        while (m2.find())
            System.out.println(m2.group());
    }
}
