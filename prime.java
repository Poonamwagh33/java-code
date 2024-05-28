import java.util.*;
import java.util.Scanner;

public class prime {
    public static void main(String args[]) {
        int num, b, c;
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        b = 1;
        c = 0;
        while (b <= num) {
            if (num % b == 0)
                c = c + 1;
            b++;
        }
        if (c == 2) {
            System.out.println("The number   prime number");
        } else
            System.out.println("The number is  not a prime number");
    }
}