public class thisex {
    String name;
    int age;

    thisex(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String get_name() {
        return name;
    }

    public void change_name(String name) {
        this.name = name;
    }

    public void printDetails() {
        System.out.println("Name" + this.name);
        System.out.println("Age" + this.age);
        System.out.println();
    }

    public static void main(String[] args) {
        thisex first = new thisex("ABC", 18);
        thisex second = new thisex("XYZ", 22);
        first.printDetails();
        second.printDetails();
        first.change_name("PQR");
        System.out.println("Name has been changet to:" + first.get_name());
    }
}
