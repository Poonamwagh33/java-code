class encapsule {
    private int value;

    public void setvalue(int x) {
        value = x;
    }

    public int getvalue() {
        return value;
    }

}

class B {
    public static void main(String args[]) {
        encapsule r = new encapsule();
        r.setvalue(100);
        System.out.println(r.getvalue());
    }
}
