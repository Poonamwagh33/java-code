public class sortasc {
    static int length;

    public static void printArray(int[] array) {
        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void sortArray(int[] array) {
        int temporary = 0;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (array[i] > array[j]) {
                    temporary = array[i];
                    array[i] = array[j];
                    array[j] = temporary;
                }
            }
        }
        System.out.println("elements of array sorted inascending order:");
        printArray(array);
    }

    public static void main(String[] args) {
        int[] array = new int[] { -5, -8, 9, 12, 1, 3 };
        length = array.length;
        System.out.println("elemets of original array:");
        printArray(array);
        sortArray(array);
    }
}
