import java.util.List;
import java.util.ArrayList;

public class getfstlastele {
    public static void getfirstlast(List<Integer> list) {
        System.out.println("Arraylist contains: " + list);
        if (list != null && !list.isEmpty()) {
            System.out.println("first element is :" + list.get(0));
            System.out.println("last element is :" + list.get(list.size() - 1));
            return;
        }
    }

    public static void main(String[] args) {
        List<Integer> a1 = new ArrayList<Integer>();
        a1.add(3);
        a1.add(1);
        a1.add(4);
        a1.add(5);
        a1.add(2);
        getfirstlast(a1);
    }
}
