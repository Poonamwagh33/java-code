import java.util.ArrayList;

public class findcommonele {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("hi");
        list1.add("hello");
        list1.add("gm");
        System.out.println("List1:" + list1);
        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("hi");
        list2.add("hello");
        list2.add("gn");
        System.out.println("List2:" + list2);
        list1.retainAll(list2);
        System.out.println("common element" + list1);
    }
}
