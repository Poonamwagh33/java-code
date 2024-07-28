class person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}

public class encapsulation {
    public static void main(String[] args) {
        person person1 = new person();
        person1.setName("Poonam");
        person1.setAge(23);
        System.out.println("Name" + person1.getName());
        System.out.println("Age" + person1.getAge());
    }
}
