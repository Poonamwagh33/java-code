import java.util.*;

public class vectortolist {
    public static void main(String[] args) {
        Vector<String> vec = new Vector<String>();
        vec.add("1");
        vec.add("2");
        vec.add("3");
        vec.add("4");
        vec.add("5");
        System.out.println("vector: " + vec);
        List<String> list = Collections.list(vec.elements());
        System.out.println("List: " + list);
    }
}
