public class mirrortri {
    public static void main(String[] args) {
        int number = 7;
        int m, n;

        // Upper triangle
        for (m = 1; m <= number; m++) {
            // Printing spaces
            for (n = 1; n < m; n++) {
                System.out.print("  ");
            }
            // Printing stars
            for (n = m; n <= number; n++) {
                System.out.print("*  ");
            }
            System.out.println();
        }

        // Inverted triangle
        for (m = number - 1; m >= 1; m--) {
            // Printing spaces
            for (n = 1; n < m; n++) {
                System.out.print("  ");
            }
            // Printing stars
            for (n = m; n <= number; n++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
}
