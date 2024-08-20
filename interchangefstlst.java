public class interchangefstlst {
    static int N = 3;

    static void swap_first_last(int mat[][]) {
        int cls = N;
        for (int j = 0; j < N; j++) {
            int temp = mat[j][0];
            mat[j][0] = mat[j][N - 1];
            mat[j][N - 1] = temp;
        }
    }

    public static void main(String[] args) {
        int mat[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        for (int j = 0; j < N; j++) {
            for (int k = 0; k < N; k++) {
                System.out.print(mat[j][k] + " ");
            }
            System.out.println();
        }
        System.out.println("swapped matrix as follows: ");
        swap_first_last(mat);
        for (int j = 0; j < N; j++) {
            for (int k = 0; k < N; k++)
                System.out.print(mat[j][k] + " ");
            System.out.println();
        }
    }
}
