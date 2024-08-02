//Integer.compare method compares both the integer and give result like 0:x==y,    1:x>y,   -1:x<y
public class compare {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(Integer.compare(a, b));
        int x = 30;
        int y = 30;
        System.out.println(Integer.compare(x, y));
        int w = 15;
        int z = 8;
        System.out.println(Integer.compare(w, z));
    }
}
