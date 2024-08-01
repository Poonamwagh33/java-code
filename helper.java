//static method can only access static data members and static method of another class or same class
//but cannot access non static methods and variables.non static methods can access statiic and non static methods .
public class helper {
    public static int sum(int a, int b) {
        return a + b;
    }
}

class gfg {
    public static void main(String[] args) {
        int n = 3, m = 6;
        int s = helper.sum(n, m);
        System.out.println("sum is= " + s);
    }
}