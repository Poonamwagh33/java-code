abstract class ab {
    abstract void printInfo();

}

class Employee extends ab {
    void printInfo() {
        String name = "Poonam";
        int age = 21;
        float salary = 222.2F;
        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);
    }

}

class Base {
    public static void main(String[] args) {
        ab a = new Employee();
        a.printInfo();
    }
}
