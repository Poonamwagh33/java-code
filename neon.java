public class neon {
    public static boolean checkNeon(int n) {
        int square = n * n;
        int sum = 0;
        while (square > 0) {
            int r = square % 10;
            sum += r;
            square = square / 10;
        }
        if (sum == n)
            return true;
        else
            return false;

    }

    public static void main(String[] args) {
        int n = 9;
        if (checkNeon(n))
            System.out.println("given number " + n + "is a neon number");
        else
            System.out.println("given number" + n + "is not a neon number");
    }
}
