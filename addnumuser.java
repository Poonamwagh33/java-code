import java.util.*;
import java.util.Scanner;

public class addnumuser {
    public static void main(String args[]) {
        int a, b, sum;
        Scanner sc = new 12Scanner(System.in);
        System.out.println("Enter first number");
        a = sc.nextInt();
        System.out.println("Enter second number");
        b = sc.nextInt();
        sum = a + b;
        System.out.println("The addition of two numbers is:" +sum);
    }
}