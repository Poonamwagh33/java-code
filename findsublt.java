
import java.util.*;

public class findsublt {
    public static void main(String[] args) {
        try {
            ArrayList<Integer> arrlist = new ArrayList<Integer>();
            arrlist.add(1);
            arrlist.add(4);
            arrlist.add(9);
            arrlist.add(25);
            arrlist.add(36);
            System.out.println("original arrlist:" + arrlist);
            List<Integer> arrlist2 = arrlist.subList(2, 4);
            System.out.println("sublist of arrlist:" + arrlist2);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Exception thrown:" + e);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception thrown:");
        }
    }
}
