// Java Program to print an arraylist of an
// user-defined collection

import java.util.*;

class printcollection {

    String name;
    int rollNo;

    // constructor of class GFG
    printcollection(String s, int n) {
        name = s;
        rollNo = n;
    }

    // over-riding the toString method
    // to print the collection
    public String toString() {
        return "Name : " + name + " | Roll No : " + rollNo;
    }

    // Driver Main Method
    public static void main(String[] args) {
        // creating an arraylist of user-defined collection
        ArrayList<printcollection> arr = new ArrayList<printcollection>();

        // creating objects of class GFG
        printcollection t1 = new printcollection("John", 101);
        printcollection t2 = new printcollection("Paul", 102);
        printcollection t3 = new printcollection("Jack", 103);
        printcollection t4 = new printcollection("Jose", 104);

        // adding objects to arraylist
        arr.add(t1);
        arr.add(t2);
        arr.add(t3);
        arr.add(t4);

        // printing the collection
        for (printcollection c : arr)
            System.out.println(c);
    }
}
