import java.util.*;
import java.io.*;

public class sort2darr {
    public static void sort2darr(int arr[][], int col) {
        Arrays.sort(arr, (a, b) -> Integer.compare(a[col], b[col]));
    }

    public static void main(String[] args) {
        int matrix[][] = { { 39, 27, 11, 42 }, { 10, 93, 91, 90 }, { 54, 78, 56, 89 }, { 24, 64, 20, 65 } };
        int col = 3;
        sort2darr(matrix, col - 1);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++)
                System.out.print(matrix[i][j] + " ");
            System.out.println();
        }
    }
}
