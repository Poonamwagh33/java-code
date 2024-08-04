import java.io.*;
import java.util.*;

class hasnextex {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Poonam");
        list.add("Wagh");
        Iterator<String> iterator = list.iterator();
        System.out.println(iterator.hasNext());
        iterator.next();
        System.out.println(iterator.hasNext());
        iterator.next();
        System.out.println(iterator.hasNext());
    }
}