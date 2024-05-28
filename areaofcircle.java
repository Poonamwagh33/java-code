import java.util.*;
import java.util.Scanner;

public class areaofcircle {
    public static void main(String args[]) {
        double pi = 3.14, area, r;
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        r = sc.nextInt();
        area = pi * r * r;
        System.out.println("Area of circle is:" + area);
    }
}