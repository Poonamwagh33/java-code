public class statover {
    static void show() {
        System.out.println("parent");
    }
}

class child extends statover {
    void show() { // show method of parent cannot overide
        System.out.println("child");
    }
}

class main {
    public static void main(String[] args) {
        statover s = new statover();
        s.show();// canot overide parents show
    }
}
