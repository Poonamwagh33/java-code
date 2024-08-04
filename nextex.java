import java.util.ArrayList;

import java.io.*;
import java.util.*;

public class nextex {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("element 1");
        list.add("element 2");
        list.add("element 3");
        Iterator<String> iterator = list.iterator();
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
    }
}
