public class findlargenum {
    static int biggestofthree(int x, int y, int z) {
        return z > (x > y ? x : y) ? z : ((x > y) ? x : y);
    }

    public static void main(String[] args) {
        int a, b, c;
        int largest;
        a = 5;
        b = 10;
        c = 3;
        largest = biggestofthree(a, b, c);
        System.out.println(largest + " is the largest number:");
    }
}
