public class staticex {
    static int a = 10;
    static int b;
    static {
        System.out.println("static block intialized");
        b = a * 4;
    }

    public static void main(String[] args) {
        System.out.println("from main");
        System.out.println("value of a : " + a);
        System.out.println("value of b :" + b);
    }
}
