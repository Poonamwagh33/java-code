import java.util.LinkedList;
import java.util.List;
import java.util.function.Supplier;
import java.util.*;

public class list {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(3);
        System.out.println("Arraylist:" + list.toString());

        List<Integer> llist = new LinkedList<Integer>();
        llist.add(2);
        llist.add(4);
        System.out.println("LinkedList:" + llist.toString());

        List<Integer> stack = new Stack<Integer>();
        stack.add(3);
        stack.add(1);
        System.out.println("Stack:" + stack.toString());

    }
}
