import java.util.*;
import java.util.stream.Collector;

public class stringtolist {
    public static List<Character> convertStringtocharlist(String str) {
        List<Character> chars = str.chars().mapToObj(e -> (char) e).collect(Collectors.toList());
        return chars;
    }

    public static void main(String[] args) {
        String str = "geek";
        List<Character> chars = convertStringtocharlist(str);
        System.out.println(chars);
    }
}