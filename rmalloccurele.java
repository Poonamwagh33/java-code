import java.util.Arrays;

public class rmalloccurele {
    public static int[] removElements(int[] arr, int key) {
        int index = 0;
        for (int i = 0; i < arr.length; i++)
            if (arr[i] != key)
                arr[index++] = arr[i];
        return Arrays.copyOf(arr, index);
    }

    public static void main(String[] args) {
        int[] array = { 3, 9, 2, 3, 1, 7, 2, 3 };
        int key = 3;
        array = removElements(array, key);
        System.out.println(Arrays.toString(array));
    }
}
