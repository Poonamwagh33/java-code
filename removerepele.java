import java.util.*;

public class removerepele {
    public static void main(String[] args) {
        ArrayList<String> gfg = new ArrayList<String>();
        gfg.add("geeks");
        gfg.add("for");
        gfg.add("geeks");
        System.out.println("original arraylist:" + gfg);
        System.out.println("\nUsing LinkedHashSet:\n");
        Set<String> set = new LinkedHashSet<>(gfg);
        List<String> gfg1 = new ArrayList<>(set);
        System.out.println("modified ArrayList:" + gfg1);
        System.out.println("\nUsing Hashset:\n");
        Set<String> set1 = new HashSet<>(gfg);
        List<String> gfg2 = new ArrayList<>(set);
        System.out.println("modified ArraList:" + gfg2);
    }
}
