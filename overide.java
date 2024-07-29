class parent {
    void show() {
        System.out.println("parents show()");
    }
}

class child extends parent {

    @Override
    void show() {
        System.out.println("childs show()");
    }
}

public class overide {
    public static void main(String[] args) {
        parent obj1 = new parent();
        obj1.show();
        parent obj2 = new child();
        obj2.show();
    }
}
