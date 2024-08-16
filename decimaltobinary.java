
import java.util.Scanner;

public class decimaltobinary {
    public static void main(String[] args) {
        int dec_num, quot, i = 1, j;
        int bin_num[] = new int[100];
        Scanner sc = new Scanner(System.in);
        System.out.println("input a decimal number: ");
        dec_num = sc.nextInt();
        quot = dec_num;
        while (quot != 0) {
            bin_num[i++] = quot % 2;
            quot = quot / 2;
        }
        System.out.println("binary number is:");
        for (j = i - 1; j > 0; j--) {
            System.out.println(bin_num[j]);
        }
        System.out.print("\n");
    }
}
