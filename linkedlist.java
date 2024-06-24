import java.util.*;

public class linkedlist {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.add("Poonam");
        l.add(30);
        l.add(null);
        l.add("durga");
        l.set(0, "Software");
        l.add(0, "venky");
        l.removeLast();
        l.addFirst("ccc");
        System.out.println(l);

    }
}
