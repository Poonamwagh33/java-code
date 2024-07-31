class staticmeth {
    static int a = 10;
    int b = 20;

    static void m1() {
        a = 20;
        System.out.println("from m1");
        b = 10;
        m2();
        System.out.println(super.a);
    }

    void m2() {
        System.out.println("from m2");
    }

    public static void main(String[] args) {

    }
}
